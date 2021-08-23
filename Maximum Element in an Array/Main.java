import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
      Scanner sc = new Scanner(System.in);
      int i;
      int n = sc.nextInt();
      int arr[] = new int[n];
      for(i = 0; i < n; i++)
      {
        arr[i] = sc.nextInt();
      }
      int max = arr[0];
      for(i = 0; i < n; i++)
      {
        if(arr[i] > max)
        {
          max = arr[i];
        }
      }
      System.out.println(max + " is the maximum element in the array");
    }
}