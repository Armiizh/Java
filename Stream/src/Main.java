import java.io.BufferedInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {

    private static final String URL = "https://file-examples-com.github.io/uploads/2017/04/file_example_MP4_1920_18MG.mp4";


    public static void main(String[] args) {

        System.out.println("starting main thread " + new Date());
        List<Thread> threads = new ArrayList<>();
        for (int i = 0; i < 2; i++) {
            threads.add(new Thread(new DownloadFile(URL, i + "video.mp4", i)));
        }
        for (Thread thread : threads) {
            thread.start();
        }
        System.out.println("finishing main thread " + new Date());
    }
}