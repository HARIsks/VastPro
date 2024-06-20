package SimpleOne;

import java.util.Scanner;

public class Floyd {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter a Number :");
		int n=s.nextInt();
		FloydOne(n);
		FloydTwo(n);
		FloydThree(n);
		s.close();
	}
	
	static void FloydOne(int n) {
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(i+" ");
			}
			System.out.println();
		}
	}
	
	static void FloydTwo(int n) {
		int k=1;
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=i;j++) {
				if(i==1) {
					System.out.print(k);
					k++;
				}
				else if(i%2==0) {
					System.out.print(k+" ");
					k++;
				}else {
					System.out.print(" "+k);
					k++;
				}
			}
			System.out.println();
		}
	}
	
	static void FloydThree(int n) {
		int k=1;
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=i;j++) {
				if(i==1) {
					System.out.print(k);
					if(k==1) {
						k--;
					}
					else {
						k++;
					}
				}
				else if(i%2==0) {
					System.out.print(k+" ");
					if(k==1) {
						k--;
					}
					else {
						k++;
					}
				}else {
					System.out.print(" "+k);
					if(k==1) {
						k--;
					}
					else {
						k++;
					}
				}
			}
			System.out.println();
		}
	}
}
