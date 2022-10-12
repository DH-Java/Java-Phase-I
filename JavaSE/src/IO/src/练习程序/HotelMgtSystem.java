package IO.src.练习程序;

import java.util.Objects;
import java.util.Scanner;

public class HotelMgtSystem {
    public static void main(String[] args) {
      /*  Room room = new Room(101,"单人间",false);
        Room room1 = new Room(102,"单人间",false);
        System.out.println(room.equals(room1));
        System.out.println(room);*/
        Hotel hotel = new Hotel();
        //打印房间状态。
        hotel.print();
        System.out.println("欢迎使用酒店管理系统，请认真阅读以下使用说明");
        System.out.println("请输入对应的功能编号：【1】表示查看房间列表。【2】表示订房。【3】表示退房。【0】表示退出。");
        Scanner s = new Scanner(System.in);
        System.out.println("请输入功能编号");
        //一直可以使用。
        while (true){
            int i = s.nextInt();
            if (i == 1) {
                //查看房间列表
                hotel.print();
            } else if (i == 2) {
                //订房
                System.out.println("请输入房间编号：");
                int roomNO = s.nextInt();
                hotel.order(roomNO);
            }else if (i==3){
                //退房
                System.out.println("请输入退房编号");
                int roomNo = s.nextInt();
                hotel.exit(roomNo);
            }else if (i==0){
                //退出
                System.out.println("再见，欢迎下次再来！");
            }else {
                //出错了
                System.out.println("功能编号错误。请重新输入");
            }
        }

    }

    public static class Hotel {
        //二维数组，模式大厦的所有房间
        private Room[][] rooms;
        //盖楼通过构造方法来盖楼。
        public Hotel(){
            //动态初始化
            rooms = new Room[3][10];
            for (int i = 0; i <rooms.length ; i++) {
                for (int j = 0; j <rooms[i].length ; j++) {
                    if (i==0){
                        rooms[i][j] = new Room((i+1)*100+j+1,"单人间",true);
                    } else if (i==1) {
                        rooms[i][j] = new Room((i+1)*100+j+1,"豪华间",true);
                    }else if (i==2){
                        rooms[i][j] = new Room((i+1)*100+j+1,"总统套房",true);
                    }


                }
            }
        }
        //在酒店对象上提供一个打印房间列表的方法。
        public void print(){
            for (int i = 0; i <rooms.length ; i++) {
                for (int j = 0; j <rooms[i].length ; j++) {
                    Room room = rooms[i][j];
                    System.out.print(room);
                }
                System.out.println();
            }
        }
        //订房方法，调用方法时需要传递一个房间编号过来。
        public void order(int roomNo){
            //订房最主要的是将对象的status修改为false。
            //Room对象的status修改为false。
            Room room = rooms[roomNo/100-1][roomNo%100-1];
            room.setStatus(false);
            System.out.println(roomNo + "已订房");
        }
        //退房
        public void exit(int roomNo){
            Room room = rooms[roomNo/100-1][roomNo%100-1];
            room.setStatus(true);
            System.out.println(roomNo + "已退房 ！");
        }


    }

    public static class Room {
        //房间编号
        private int no;
        //房间类型
        private String type;
        //房间状态
        private boolean status;

        public Room() {

        }

        public Room(int no, String type, boolean status) {
            this.no = no;
            this.type = type;
            this.status = status;
        }

        public int getNo() {
            return no;
        }

        public void setNo(int no) {
            this.no = no;
        }

        public String getType() {
            return type;
        }

        public void setType(String type) {
            this.type = type;
        }

        public boolean getStatus() {
            return status;
        }

        public void setStatus(boolean status) {
            this.status = status;
        }

        @Override
        public String toString() {
            return "["+ no +" , "+ type+" , "+(status ? "空闲" :"占用")+"]";
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Room room = (Room) o;
            return no == room.no && status == room.status && Objects.equals(type, room.type);
        }


    }
}
