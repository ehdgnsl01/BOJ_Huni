import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.io.BufferedWriter;
import java.io.OutputStreamWriter;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int a = Integer.parseInt(br.readLine());
        String b = br.readLine();

        char[] b_chars = b.toCharArray();

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        bw.write((a * (b_chars[2]-'0')) + "\n");
        bw.write((a * (b_chars[1]-'0')) + "\n");
        bw.write((a * (b_chars[0]-'0')) + "\n");
        bw.write((a * Integer.parseInt(b)) + "\n");
        bw.flush();
        bw.close();
    }
}
