import java.util.*;
class Main
{
  public static void main(String args[])
  {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int i, flag = 0;
    int arr1[] = new int[n];
    int arr2[] = new int[n];
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
      if(arr1[i] < arr2[i])
      {
        flag = 1;
      }
    }
    if(flag == 1)
      System.out.println("Incompatible");
    else
      System.out.println("Compatible");
  }
}