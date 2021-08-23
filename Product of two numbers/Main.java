import java.util.Scanner;
class Main{
	public static void main (String[] args) {
		// Type your code here
      Scanner input = new Scanner(System.in);
      int num1 = input.nextInt();
      int num2 = input.nextInt();
      int product = num1*num2;
      System.out.print(product);
	}
}