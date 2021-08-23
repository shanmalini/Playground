import java.util.*;
class Main
{
  public static int recur(int curr_step, int n, int results_cache[])
  {
    if(curr_step > n)
      return 0;
    if(curr_step == n)
      return 1;
    if(results_cache[curr_step] != -1)
      return results_cache[curr_step];
    int result = recur(curr_step+1, n, results_cache) + recur(curr_step+2, n, results_cache);
    results_cache[curr_step] = result;
    return result;
  }
  public static int total_ways(int n)
  {
    int results_cache[] = new int[n];
    for(int i = 0; i < n; i++)
    {
      results_cache[i] = -1;
    }
    return recur(0, n, results_cache);
  }
  public static void main(String args[])
  {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    System.out.println(total_ways(n));
  }
}