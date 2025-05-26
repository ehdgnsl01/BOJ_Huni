import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
 
public class Main {
	public static int A, T, CALL;
	public static int result = 0;
	public static boolean CALLFLAG = false; //false면 '뻔' True면 '데기'
 
	public static int cyclecnt = 2; //몇번쨰 주기인지 확인, 첫번쨰 주기부터 2번씩 하니 2로 설정 
	public static int BBUNCNT = 0; //뻔 횟수 - 뻔은 '0'
	public static int DAEGICNT = 0;  //데기 횟수 - 대기는 '1'
    public static void main(String[] args) throws IOException{
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	
    	StringTokenizer st = new StringTokenizer(br.readLine());
    	A = Integer.parseInt(st.nextToken());
    	st = new StringTokenizer(br.readLine());
    	T = Integer.parseInt(st.nextToken());
    	st = new StringTokenizer(br.readLine());
    	CALL = Integer.parseInt(st.nextToken());
 
    	
    	simulate();
    	
    	System.out.println(result);
    	
    	
    }
    
    public static void simulate() {
    	while(true) {
    		
    		//첫 4번은 '뻔' - '데기' - '뻔' - '데기'
    		for(int i=0;i<4;i++) {
    			if(i%2 == 0) {
    				BBUNCNT += 1;
    			}
    			if(i%2 == 1) {
    				DAEGICNT += 1;
    			}
    			
    			//'뻔' 이 특정 번째에 맞다면
    			if(BBUNCNT == T && CALL == 0) {
    				result = ( BBUNCNT + DAEGICNT - 1 ) % A; 
    				return ;
    			}
    			//'데기' 가 특정번째에 왔다면
    			else if(DAEGICNT == T && CALL == 1) {
    				result = ( BBUNCNT + DAEGICNT - 1 ) % A;
    				return ;
    			}
    		}
    		
    		// 2, 3, 4, 5, ... 이렇게 늘어난다.
    		for(int i=0; i<cyclecnt; i++) {
    			BBUNCNT += 1;
    			//'뻔' 이 특정 번째에 맞다면
    			if(BBUNCNT == T && CALL == 0) {
    				result = ( BBUNCNT + DAEGICNT - 1 ) % A;
    				return;
    			}
    		}
    		
    		// 2, 3, 4, 5, ... 이렇게 늘어난다.
    		for(int i=0; i<cyclecnt; i++) {
    			DAEGICNT += 1;
    			//'뻔' 이 특정 번째에 맞다면
    			if(DAEGICNT == T && CALL == 1) {
    				result = ( BBUNCNT + DAEGICNT - 1 ) % A;
    				return ;
    			}
    		}
    		cyclecnt += 1;
    	}
    }
}