import java.util.Scanner;


public class Ivo_Stratev_Task15 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int x = scan.nextInt();
		int arry[];
		
		int sum = 0;
		arry = new int[10];
		System.out.print("[");
		for(int i=1;i<11;i++){
			for(int j=0;j<1000;j++){
				if (j%(i*x)==0)
					sum = sum +j;
			}
			arry[(i - 1)] = sum;
			if(i == 10) {
				System.out.print(arry[(i - 1)] + "]");
			}else System.out.print(arry[(i - 1)] + ", ");			
		}
	}
}
