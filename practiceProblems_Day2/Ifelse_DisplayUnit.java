package practiceProblems_Day2;

	import java.util.Scanner;

public class Ifelse_DisplayUnit {
	public static void main(String args[]) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Unit Value");
		
		int num=sc.nextInt();
		sc.close();
		
		if (num==10) {
			System.out.println("You have Entered value is " + " Ten ");
		}
		else if (num==100) {
			System.out.println("You have Entered value is " + " Hundred ");
		}
		else if (num==1000) {
			System.out.println("You have Entered value is " + " Thousend (Ten Hundred) ");
		}
		else if (num==10000) {
			System.out.println("You have Entered value is " + " Ten Thousend ");
		}
		else {
			System.out.println("You have Entered Wrong Number");
		}
	}
}
