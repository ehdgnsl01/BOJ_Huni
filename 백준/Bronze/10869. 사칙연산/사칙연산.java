import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.io.BufferedWriter;
import java.io.OutputStreamWriter;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] str = br.readLine().split(" ");
        int A = Integer.parseInt(str[0]);
        int B = Integer.parseInt(str[1]);

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        bw.write((A+B) + "\n");
        bw.write((A-B) + "\n");
        bw.write((A*B) + "\n");
        bw.write((A/B) + "\n");
        bw.write((A%B) + "\n");

        bw.flush();
        bw.close();
    }
}
