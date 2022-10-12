package com.springmvc.Controller;

import com.springmvc.pojo.User;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.RequestEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.util.MultiValueMap;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.UUID;

/**
 * Created with IntelliJ IDEA.
 *
 * @Date: 2022/04/17/16:31
 * @Description:
 */
@Controller
public class HttpController {
    @RequestMapping("/testRequestBody")
    public String testRequestBody(@RequestBody String requestBody) {
        System.out.println("RequestBody:" + requestBody);
        return "success";
    }

    @RequestMapping("/testRequestEntity")
    public String testRequestEntity(RequestEntity<String> requestEntity) {
        System.out.println("请求头：" + requestEntity.getHeaders());
        System.out.println("请求体：" + requestEntity.getBody());
        return "success";
    }

    @RequestMapping("/testResponse")
    public void testResponse(HttpServletResponse response) throws IOException {
        response.getWriter().println("hello response");
    }

    @RequestMapping("/testResponseBody")
    @ResponseBody
    public User testResponseBody() {
        return new User("邓豪", 20);
    }

    @RequestMapping("/testaxios")
    @ResponseBody
    public String testAxios(String username, String password) {
        System.out.println(username + ":" + password);
        return "hello,axios";
    }

    @RequestMapping("/testDown")
    public ResponseEntity<byte[]> testResponseEntity(HttpSession session) throws IOException {
        //获取ServletContext对象
        ServletContext servletContext = session.getServletContext();
        //获取服务器中文件的真实路径
        String realPath = servletContext.getRealPath("/static/img/1.jpg");
        //创建输入流
        InputStream is = new FileInputStream(realPath);
        //创建字节数组
        byte[] bytes = new byte[is.available()];
        //将流读到字节数组中
        is.read(bytes);
        //创建HttpHeaders对象设置响应头信息
        MultiValueMap<String, String> headers = new HttpHeaders();
        //设置要下载方式以及下载文件的名字
        headers.add("Content-Disposition", "attachment;filename=1.jpg");
        //设置响应状态码
        HttpStatus statusCode = HttpStatus.OK;
        //创建ResponseEntity对象
        ResponseEntity<byte[]> responseEntity = new ResponseEntity<>(bytes, headers, statusCode);
        //关闭输入流
        is.close();
        return responseEntity;
    }
    /**
    * @Description: 上传功能
    * @Param: [fileUp, session]
    * @return: [org.springframework.web.multipart.MultipartFile, javax.servlet.http.HttpSession]
    * @Date: 2022/4/18
    */
    @RequestMapping("/testUp")
    public String testUp(MultipartFile photo, HttpSession session) throws IOException {
        //获取上传的文件的文件名
        String filename = photo.getOriginalFilename();
        //获取上传的文件的后缀名
        String suffixName = filename.substring(filename.lastIndexOf("."));
        //将uuid作为文件名
        String uuid = UUID.randomUUID().toString().replace("-","");
        //将uuid+后缀名拼接后的结构作为最终的文件名
        filename = uuid+suffixName;
        ServletContext servletContext = session.getServletContext();
        //通过servletContext获取服务器中的photo目录的路径
        String realPath = servletContext.getRealPath("photo");
        System.out.println(realPath);
        File file = new File(realPath);
        if (!file.exists()) {
            //若不存在，则创建目录
            file.mkdir();
        }
        String finalPath = realPath + File.separator + filename;
        photo.transferTo(new File(finalPath));
        return "success";
    }
}
