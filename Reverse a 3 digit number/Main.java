import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    //Type your code here
    Scanner input = new Scanner(System.in);
    int num = input.nextInt();
    int d1 = num%10;
    num /= 10;
    int d2 = num%10;
    num /= 10;
    num += (d2*10 + d1*100);
    System.out.print(num);
  }
}