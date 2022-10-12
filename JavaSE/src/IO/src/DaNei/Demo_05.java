package IO.src.DaNei;


import javazoom.jl.player.Player;
import javazoom.jl.player.advanced.AdvancedPlayer;


import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 *
 * @Date: 2022/09/18/11:21
 * @Description:
 */

@SuppressWarnings("all")
public class Demo_05 implements Runnable {
    /**JLayer提供的AdvancedPlayer类是最灵活、功能最全的播放器类。
     * 该类提供了很多方法**/
    Scanner scanner = new Scanner(System.in);
    public static void Mp3AdvancedPlayer(String path) {
        try {
            FileInputStream fIn = new FileInputStream((path));
            BufferedInputStream bis = new BufferedInputStream(fIn);
            AdvancedPlayer player = new AdvancedPlayer(bis);
            player.play(); //播放音频文件
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**  javazoom.jl.player.Player类是JLayer提供的标准播放器类，
     * 该类的使用方法非常简单，在创建播放器对象时将MP3文件的文件输入流当做参数，
     * 然后执行播放器的play()方法即可播放。
     * **/
    public static void Mp3Player(String path) {
        try {
            Player player = new Player(new FileInputStream(path));
            player.play();
        } catch (Exception e) {
            // TODO: handle exception
        }
    }
    public static void main(String[] args) throws Exception {


    }

    @Override
    public void run() {
        while (true){
            System.out.println("请输入音频");
            int name = scanner.nextInt();
            String filePath = "F:\\daily\\QQ\\Message\\676366223\\FileRecv\\音频\\h"+name+".mp3";
            Mp3AdvancedPlayer(filePath);
        }

    }
}

