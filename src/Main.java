import java.io.FileOutputStream;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.channels.Channel;
import java.nio.channels.Channels;
import java.nio.channels.ReadableByteChannel;

public class Main {

    public static void main(String[] args) {

        try {
            URL website = new URL("https://www.google.com/");
            ReadableByteChannel rbc = Channels.newChannel(website.openStream());
            try (FileOutputStream file = new FileOutputStream("data.html")) {
                file.getChannel().transferFrom(rbc, 0, Long.MAX_VALUE);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        /*ElementsOne el1 = new ElementsOne();
        ElementsOne el2 = new ElementsOne();

        el1.start();
        el2.start();

        Thread el3 = new Thread(new ElementsTwo());
        Thread el4 = new Thread(new ElementsTwo());
        Thread el5 = new Thread((new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i <= 11; i++) {
                    System.out.println("El5 " + i);
                }
            }
        }));

        el3.start();
        el4.start();
        el5.start();*/
    }
}
