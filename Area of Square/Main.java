import java.util.Scanner;
class Main {
	public static void main (String[] args) {
		// Type your code here
      Scanner input = new Scanner(System.in);
      int side = input.nextInt();
      int area = side*side;
      System.out.print(area);
	}
}