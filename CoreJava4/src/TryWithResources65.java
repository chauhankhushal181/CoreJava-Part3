import javax.imageio.IIOException;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class TryWithResources65 {
    public static void main(String[] args) throws NumberFormatException, IOException {
        int num = 0;

        BufferedReader br = null;
        try {
            br = new BufferedReader(new InputStreamReader(System.in));
            num = Integer.parseInt(br.readLine());
            System.out.println(num);

        } finally {
            br.close();
        }
    }
}
