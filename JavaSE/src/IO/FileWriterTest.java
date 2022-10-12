package IO;

import java.io.FileWriter;
import java.io.IOException;

//文件字符输出流。写。
//只能输出普通文本。
public class FileWriterTest {
    public static void main(String[] args) {
        FileWriter writer = null;
        //创建一个字符输出流。
        try {
            writer = new FileWriter("F:\\其他\\temp.txt", true);

            //开始写
            char[] chars = {'我', '是', '中', '国', '人'};
            writer.write(chars);
            writer.write(chars, 2, 3);
            writer.write("我是一名java软件工程师");
            writer.write("\n");
            writer.write("Hello World");
            //刷新
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (writer != null) {
                try {
                    writer.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
