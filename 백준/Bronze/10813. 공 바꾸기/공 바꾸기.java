import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String[] input = br.readLine().split(" ");
        int n = Integer.parseInt(input[0]);
        int m = Integer.parseInt(input[1]);

        int[] ball = new int[n];
        for (int i = 0; i < n; i++) {
            ball[i] = i + 1;
        }

        for (int i = 0; i < m; i++) {
            String[] str = br.readLine().split(" ");
            int a = Integer.parseInt(str[0]);
            int b = Integer.parseInt(str[1]);
            int temp = 0;
            temp = ball[a-1];
            ball[a-1] = ball[b-1];
            ball[b-1] = temp;
        }

        for (int i = 0; i < n; i++) {
            bw.write(ball[i] + " ");
        }
        br.close();
        bw.flush();
        bw.close();
    }
}
