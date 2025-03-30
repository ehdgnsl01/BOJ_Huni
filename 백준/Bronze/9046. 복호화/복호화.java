import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        while(n-- > 0){
            String input = br.readLine();
            int[] res = new int[26];
            for(int i = 0; i < input.length(); i++){
                if (input.charAt(i) >= 'a' && input.charAt(i) <= 'z') {
                    res[input.charAt(i) - 'a']++;
                }
            }
            int max = 0;
            for (int r : res){
                if(r > max){
                    max = r;
                }
            }
            int count = 0;
            int answer = 0;
            for (int j=0; j<26; j++){
                if(max == res[j]){
                    count++;
                    answer = j;
                }
            }
            bw.write((count == 1 ? String.valueOf((char)('a' + answer)) : "?") + "\n");
        }
        br.close();
        bw.flush();
        bw.close();
    }
}
