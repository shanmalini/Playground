import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
      Scanner sc = new Scanner(System.in);
      int i;
      int n = sc.nextInt();
      int arr1[] = new int[n];
      int arr2[] = new int[n];
      int arr3[] = new int[n];
      for(i = 0; i < n; i++)
      {
        arr1[i] = sc.nextInt();
      }
      for(i = 0; i < n; i++)
      {
        arr2[i] = sc.nextInt();
      }
      for(i = 0; i < n; i++)
      {
        arr3[i] = arr1[i] + arr2[i];
      }
      for(i = 0; i < n; i++)
      {
        System.out.println(arr3[i]);
      }
    }
}