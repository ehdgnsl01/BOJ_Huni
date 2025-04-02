import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String[] input = br.readLine().split(" ");
        int n = Integer.parseInt(input[0]);
        int m = Integer.parseInt(input[1]);
        int[] arr = new int[n];
        String[] arr_str = br.readLine().split(" ");
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(arr_str[i]);
        }
        while(m-->0){
            String[] sol = br.readLine().split(" ");
            int k = Integer.parseInt(sol[0]);
            int a = Integer.parseInt(sol[1]);
            int b = Integer.parseInt(sol[2]);

            switch(k) {
                case 1:
                    arr[a-1] = b;
                    break;
                case 2:
                    for(int i=a-1;i<b;i++){
                        if(arr[i] == 0) arr[i]=1;
                        else if(arr[i] == 1) arr[i]=0;
                    }
                    break;
                case 3:
                    for(int i=a-1;i<b;i++){
                        arr[i] = 0;
                    }
                    break;
                case 4:
                    for(int i=a-1;i<b;i++){
                        arr[i] = 1;
                    }
                    break;
            }
        }
        for(int i=0;i<n;i++){
            bw.write(arr[i] + " ");
        }

        br.close();
        bw.flush();
        bw.close();
    }
}
