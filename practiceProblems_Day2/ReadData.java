package practiceProblems_Day2;


	import java.util.Scanner;

	public class ReadData{

		public static void main(String[] args) {
			// TODO Auto-generated method stub
		
			
			Scanner sameer=new Scanner(System.in);
			System.out.println("Enter the single digit value");
			
			int num=sameer.nextInt();
			sameer.close();

			
//				System.out.println("you entered "+num);
				
//				if(num==1 || num==2 || num==3 || num==4 || num==5 || num==6 || num==7 || num==8 || num==9) {
//					System.out.println("ten hundred");
//					
//				}
				
				
				if (num==1) {
					System.out.println("you have entered "+"ONE");
				}
				
				else if (num==2) {
					System.out.println("you have entered "+"TWO");
				}
				else if (num==3) {
					System.out.println("you have entered "+"THREE");
				}
				else if (num==4) {
					System.out.println("you have entered "+"FOUR");
				}
				else if (num==5) {
					System.out.println("you have entered "+"FIVE");
				}
				else if (num==6) {
					System.out.println("you have entered "+"SIX");
				}
				else if (num==7) {
					System.out.println("you have entered "+"SEVEN");
				}
				else if (num==8) {
					System.out.println("you have entered "+"EIGHT");
				}
				else if (num==9) {
					System.out.println("you have entered "+"NINE");
				}
				
//				System.exit(0);
				else {
					System.out.println("you entered wrong number");
				}
		
		}

	}


