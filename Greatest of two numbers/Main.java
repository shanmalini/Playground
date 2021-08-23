import java.util.Scanner;
class Main {
	public static void main (String[] args) {
		// Type your code here
      Scanner input = new Scanner(System.in);
      int num1 = input.nextInt();
      int num2 = input.nextInt();
      if(num1>num2) System.out.print("num1 is the greatest number");
      else System.out.print("num2 is the greatest number");
	}
}