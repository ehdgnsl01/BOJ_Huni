import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.io.BufferedWriter;
import java.io.OutputStreamWriter;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] str = br.readLine().split(" ");
        int a = Integer.parseInt(str[0]);
        int b = Integer.parseInt(str[1]);

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        if (b<45){
            if(a==0){
                bw.write("23 " + (b+15));
            }
            else{
                bw.write((a-1)+" " + (b+15));
            }
        }
        else{
            bw.write(a+" "+(b-45));
        }
        bw.flush();
        bw.close();
    }
}
