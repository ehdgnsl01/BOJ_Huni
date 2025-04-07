import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String password;
        char[] chars;
        boolean flag;
        char prev;
        int count;
        StringBuilder sb = new StringBuilder();

        while(!(password= br.readLine()).equals("end")){
            chars = password.toCharArray();
            count = 0;
            flag = false;
            prev = ' ';

            for(char p : chars){
                if(isVowel(p)) flag=true;
                //전에꺼랑 지금꺼가 종류가 다르면 count=1 초기화. 같으면 count++
                if(isVowel(prev) != isVowel(p)) count=1;
                else count++;
                //count가 3 이상이거나 prev=p 이면 ( 근데 e,o가 아닌 ) flag=false
                if(count > 2 || (prev==p && (p!='e' && p!='o'))){
                    flag=false;
                    break;
                }
                prev = p;
            }
            if(flag) sb.append('<').append(password).append("> is acceptable.\n");
            else sb.append('<').append(password).append("> is not acceptable.\n");
        }

        bw.write(sb.toString());
        br.close();
        bw.flush();
        bw.close();
    }

    public static boolean isVowel(char c) {
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';
    }
}
