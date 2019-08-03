import java.io.*;
import java.util.Random;


public class ShuffleTest {
	
	static public void sleep(int time){
	    try {
	      Thread.sleep(time);
	    } catch (InterruptedException e) { }

	}   
	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		ShuffleTest sh = new ShuffleTest();
		
		String a[]= new String[] {"A","2","3","4","5","6","7","8","9","10","K","Q","J"};
		String b[]= new String[] {"♤","♥","♧","◆"};
		
		                        // 숫자성분, 무늬 성분 
		int k, r;
		Random ra = new Random();
		
		int c[] = new int[52];      //배열안의 index를 정할 index 담는 배열 
		String d[] = new String[52]; //정리하기 위해 깔아놓을 숫자 배열
		String e[] = new String[52]; //정리하기 위해 깔아놓을 무늬 배열
		
			
		for(int i=0;i<c.length;i++) {    
			c[i] = i+1;		// 얘설정에 따라 밑에 +1, -1이 다바뀔수있음 
			System.out.print(c[i]+" ");  //섞기 전 index 순서대로 나열하기
			
			if((i+1) % 13 == 0) //13개씩  줄바꿈
			{
				System.out.println("");
			}
		}
				
		sh.sleep(2000);
		
		System.out.print("\n\n");
		for(int j=0;j<c.length;j++) { //카드의 숫자성분들을 한줄씩 나열	
			
			k = j % 13;	// a[]의 index에 넣을      0부터 12까지의 값을 얻기 위함 			
			d[j] =a[k]; 
			
			System.out.print(d[j]+" ");
			
			if(k ==12)
			{
				System.out.println("");
			}
		}
			
		k = 0;
		
		sh.sleep(2000);
		System.out.print("\n\n");
		for(int j=0;j<c.length;j++) { 
			
			k = j/13;			// b[]의 index에 넣을      0부터 3까지의 값을 얻기 위함 	
			e[j] =b[k];
			
			System.out.print(e[j]+" ");
					
			if((j+1) % 13 ==0)
			{
				System.out.println("");
			}
		}
		
		
		for(int i=0;i<=100000;i++) { //lotto섞기 알고리즘
			
			r = ra.nextInt(52);
		    int temp;
		    temp = c[0];
		    c[0] = c[r];
		    c[r] = temp;
		    
		}
			
		sh.sleep(2000);
		System.out.print("\n\n섞는중.......");
		sh.sleep(4000);
		System.out.print("\n\n\n");
		for(int j=0;j<c.length;j++) {
			
			System.out.print(d[c[j]-1]+" "+e[c[j]-1]+" ");  //c[]값이 1부터 들어갔기때문에 
			                                                // d,e[]의 index로 들어가기 위해서-1필요
					
			if((j+1) % 13 ==0)
			{
				System.out.println("");
			}
			
		}
			
		sh.sleep(2000);	
		///전체 보여주고 다가려버리는거야 그리고 고르라 하고 가각각에 맞는 타로 연결// 방금 본 카드 맞추기 게임 (마술이용)
	System.out.print("\n\n");
	System.out.print("몇번째 카드를 고르시겠어요?");
	
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	String str = br.readLine();
	int n = Integer.parseInt(str);
	
	
	//System.out.print(d[c[n]-1]+e[c[n]-1]);   //사람의 대답은 index가 아닌 몇번인지만 보므로
	System.out.print(d[c[n-1]-1]+e[c[n-1]-1]);
	
				
	}		
	
			
}