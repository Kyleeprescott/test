package Chapter4test;
import java.util.Scanner;
public class Chapter4test {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a 1 to convert RMB to dollars enter 2 to convert dollars to RMB");
int num1 = input.nextInt();
 double RMB = 6.81;

if (num1 == 1) {
	System.out.println("Enter the RMB amount");
	int rmb1 = input.nextInt();
	
}
else if (num1 == 2) {
	System.out.println("Enter the amount of dollars");
	int dollars = input.nextInt();
	 double total = (6.81* dollars);
	 System.out.println(total);
}
else if (num1 >2) {
	System.out.println("incorrect value");
}
	}

}
