import java.io.*;
import java.util.Random;


public class Tosimple {
	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		ShuffleTest sh = new ShuffleTest();
		
		String a[]= new String[] {"A","2","3","4","5","6","7","8","9","10","K","Q","J"};
		String b[]= new String[] {"��","��","��","��"};
		
		                        // ���ڼ���, ���� ���� 
		int k, r;
		Random ra = new Random();
		
		int c[] = new int[52];      //�迭���� index�� ���� index ��� �迭 
		String d[] = new String[52]; //�����ϱ� ���� ��Ƴ��� ���� �迭
		String e[] = new String[52]; //�����ϱ� ���� ��Ƴ��� ���� �迭
		
			
		
		for(int i=0;i<c.length;i++) {    
			c[i] = i+1;		// �꼳���� ���� �ؿ� +1, -1�� �ٹٲ������ 
		}
		
		
		for(int j=0;j<c.length;j++) { //ī���� ���ڼ��е��� ���پ� ����	
			
			k = j % 13;	// a[]�� index�� ����      0���� 12������ ���� ��� ���� 			
			d[j] =a[k]; 
			
		}
			
		k = 0;
		
		

		for(int j=0;j<c.length;j++) { 
			
			k = j/13;			// b[]�� index�� ����      0���� 3������ ���� ��� ���� 	
			e[j] =b[k];
			
		}
		
		
		for(int i=0;i<=100000;i++) { //lotto�� �˰������� ���� 
			
			r = ra.nextInt(52);
		    int temp;
		    temp = c[0];
		    c[0] = c[r];
		    c[r] = temp;
		    
		}
			
		
		System.out.print("\n\n");
		for(int j=0;j<c.length;j++) {
			
			System.out.print(d[c[j]-1]+" "+e[c[j]-1]+" ");  //c[]���� 1���� ���⶧���� 
			                                                // d,e[]�� index�� ���� ���ؼ�-1�ʿ�
					
			if((j+1) % 13 ==0)
			{
				System.out.println("");
			}
			
		}
		
		
		
		///��ü �����ְ� �ٰ��������°ž� �׸��� ���� �ϰ� �������� �´� Ÿ�� ����// ��� �� ī�� ���߱� ���� (�����̿�)
	System.out.print("\n\n");
	System.out.print("���° ī�带 ���ðھ��?");
	
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	String str = br.readLine();
	int n = Integer.parseInt(str);
	
	
	//System.out.print(d[c[n]-1]+e[c[n]-1]);   //����� ����� index�� �ƴ� ����������� ���Ƿ�
	System.out.print(d[c[n-1]-1]+e[c[n-1]-1]);
	
		
			
	}
		
	
			
}
		
		
		


