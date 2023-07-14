package equilbriumindex;

import java.util.Scanner;

public class Equilbriumindex{
	public static void main(String []args){
		Scanner scan = new Scanner(System.in);
		int arrsize=scan.nextInt();
		int arr[]=new int[arrsize];
		arr[0]=scan.nextInt();
		for(int i=1;i<arrsize;i++) {
			arr[i]=scan.nextInt();
			arr[i]=arr[i-1]+arr[i];
		}
		int temp=0;
		for(int i=1;i<arrsize;i++) {
			if(arr[i-1]==arr[arrsize-1]-arr[i]) {	
				temp=i;
				break;
			}
		}
		if(temp==0) {
			System.out.print(-1);
		}
		else {
		System.out.print(temp);
		}
	}
}