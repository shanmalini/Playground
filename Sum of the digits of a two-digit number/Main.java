import java.util.*;
class Main {
	public static void main (String[] args) {
		// Type your code here
      Scanner input = new Scanner(System.in);
      int num = input.nextInt();
      int d1 = num%10;
      num /= 10;
      num += d1;
      System.out.print(num);
	}
}