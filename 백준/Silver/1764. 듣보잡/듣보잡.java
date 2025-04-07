import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] s = br.readLine().split(" ");
        int n = Integer.parseInt(s[0]);
        int m = Integer.parseInt(s[1]);

        HashSet<String> set = new HashSet<>();
        for (int i = 0; i < n; i++) {
            set.add(br.readLine());
        }
        ArrayList<String> result = new ArrayList<>();
        for (int i = 0; i < m; i++) {
            String tmp = br.readLine();
            if(set.contains(tmp)){
                result.add(tmp);
            }
        }
        // 정렬
        Collections.sort(result);

        bw.write(result.size() + "\n");
        for (String str : result) {
            bw.write(str + "\n");
        }
        br.close();
        bw.flush();
        bw.close();
    }
}
