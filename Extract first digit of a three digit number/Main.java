import java.util.Scanner;
class Main {
	public static void main (String[] args) {
		// Type your code here
      Scanner input = new Scanner(System.in);
      int num = input.nextInt();
      num /= 100;
      System.out.print(num);
	}
}