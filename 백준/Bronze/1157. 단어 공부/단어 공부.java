import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String s = br.readLine();
        s = s.toUpperCase();
        char[] alphabet = new char[26];
        for (int i = 0; i < s.length(); i++) {
            alphabet[s.charAt(i) - 'A']++;
        }
        int max = -1;
        char maxchar = 0;
        for (int i = 0; i < alphabet.length; i++) {
                if (alphabet[i] > max) {
                    max = alphabet[i];
                    maxchar = (char)('A' + i);
                }
                else if (alphabet[i] == max) {
                    maxchar = '?';
                }
        }
        bw.write(maxchar + "");
        br.close();
        bw.flush();
        bw.close();
    }
}
