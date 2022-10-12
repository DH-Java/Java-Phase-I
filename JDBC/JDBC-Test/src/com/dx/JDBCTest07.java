package com.dx;

import java.sql.*;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
/*
*@Author:DH
*@Date:2021/11/16 14:54
*@Description:TODO
** @param null
*@return:
* 1、解决sql注入问题
*       只要用户提供的信息不参与SQL语句的编译过程，问题就解决了。
*       即使用户提供的信息中含有SQL语句的关键字，但是没有参与编译，不起作用。
*       要想用户信息不参与SQL语句的编译，那么必须使用java.sql.PreparedStatement
*       PreparedStatement接口继承了java.sql.Statement
*       PreparedStatement是属于预编译的数据库操作对象。
*       PreparedStatement的原理是：预先对SQL语句的框架进行编译，然后再给SQL语句传“值”
* 2、测试结果：
*          请输入账户
           fdsa
           请输入密码
           fdsa ‘ or ’1'='1
           登陆失败
  3、解决SQL注入的关键是什么?
  * 用户提供的信息中即使含有sql语句的关键字，但是这些关键字并没有参与编译。不起作用。
* 4、对比一下PreparedStatement和Statement的区别？
*       -Statement存在SQL注入问题，PreparedStatement解决了SQL注入问题
*       -Statement是编译一次执行一次。PreparedStatement是编译一次，可执行n次。PreparedStatement效率较高一些。
*       -PreparedStatement会在编译阶段做类型的安全检查。
*
*       综上所述：PreparedStatement使用较多，只有极少数的情况下需要使用Statement
*
* 5、什么情况下必须使用Statement呢？
*       业务方面要求必须支持SQL注入的时候。
*       Statement支持SQL注入，凡是业务方面要求是需要进行sql语句拼接的，必须使用Statement
*
*/


    /*
     * 实现功能：
     *       1、需求：模拟用户登录功能的实现。
     *       2、业务描述：
     *               程序运行的时候，提供一个输入的入口，可以让用户输入用户名和密码
     *               用户输入用户名和密码之后，提交信息，java程序收集到用户信息
     *               java程序连接数据库验证用户名和密码是否合法
     *               合法：显示登陆成功
     *               不合法：显示登陆失败
     *       3、数据的准备：
     *            在实际开发中，表的设计会使用专业的建模工具，我们这里安装一个建模工具：PowerDesigner
     *            使用PD工具来进行数据库表的设计。(参见table_user.sql脚本)
     *       4、当前程序存在的问题：
     *           请输入账户
     *            fdsa
     *           请输入密码
     *           fdsa ' or '1'='1
     *           登陆成功
     *           这种现象被称为SQL注入（安全隐患）。（黑客经常使用）
     *       5、导致SQL注入的根本原因是什么？
     *           用户输出的信息含有sql关键字，并且这些关键字参与sql语句的编译过程，
     *           导致sql语句的原意被扭曲，进而达到sql注入
     *
     * */
    public class JDBCTest07 {
        public static void main(String[] args) {
            Map<String,String> userLoginInfo = initUI();
            boolean loginSuccess = Login(userLoginInfo);
            System.out.println(loginSuccess ? "登陆成功":"登陆失败");
        }
        /*用户登录
         *@Author:DH
         *@Date:2021/11/16 14:03
         *@Description:TODO
         ** @param 用户登录信息
         *@return:true 登陆成功 false 登陆失败
         */
        private static boolean Login(Map<String, String> userLoginInfo) {
            //打上标记
            boolean loginSuccess = false;
            //单独定义变量
            String loginName = userLoginInfo.get("loginName");
            String loginPassword = userLoginInfo.get("loginPassword");
            //JDBC代码
            ResultSet resultSet = null;
            PreparedStatement Ps= null;//这里使用PreparedStatement（预编译的数据库操作对象）
            Connection connection = null;
            try {
                //1、注册驱动
                Class.forName("com.mysql.cj.jdbc.Driver");
                //2、获取连接
                connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/MySQL","root","020903");
                //3、获取预编译的数据库操作对象
                //SQL语句的框子，其中一个问号表示一个占位符，一个?将来接收一个”值“，注意占位符不能使用单引号括起来。
                String sql = "select * from xs.table_user where user= ? and password = ? ";
                //程序执行到此处，会发送sql语句框子给DBMS，然后DBMS进行sql语句的预先编译
                Ps= connection.prepareStatement(sql);
                //给占位符?传值（第一个问号下标是1,第二个问号下标是2，JDBC所有下标都是从1开始）
                Ps.setString(1,loginName);
                Ps.setString(2,loginPassword);
                //4、执行sql语句
                resultSet = Ps.executeQuery();
                //5、处理查询结果集
                if (resultSet.next()){
                    //登陆成功
                    loginSuccess = true;
                }
            } catch (Exception e) {
                e.printStackTrace();
            }finally {
                //6、释放资源
                if (resultSet != null){
                    try {
                        resultSet.close();
                    } catch (SQLException e) {
                        e.printStackTrace();
                    }
                }
                if (Ps != null){
                    try {
                        Ps.close();
                    } catch (SQLException e) {
                        e.printStackTrace();
                    }
                }
                if (connection != null){
                    try {
                        connection.close();
                    } catch (SQLException e) {
                        e.printStackTrace();
                    }
                }
            }



            return loginSuccess;
        }

        /*
        *@Author:DH
        *@Date:2021/11/16 13:53
        *@Description:TODO
        ** @param
        *@return:java.util.Map<java.lang.String,java.lang.String>
        初始化页面方法
        * 用户输入的账户和密码*/
        private static Map<String, String> initUI() {
            Scanner scanner = new Scanner(System.in);
            System.out.println("请输入账户");
            String username = scanner.nextLine();
            System.out.println("请输入密码");
            String password = scanner.nextLine();
            Map<String ,String> useLoginInfo = new HashMap<>();
            useLoginInfo.put("loginName",username);
            useLoginInfo.put("loginPassword",password);
            return useLoginInfo;
        }
    }


