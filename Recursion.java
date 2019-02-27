import java.util.*;

public class Recursion {
    /*You may write additional private methods */

    /*Recursively find the sqrt using Newton's approximation
     *tolerance is the allowed percent error the squared answer is away from n.
     *precondition: n is non-negative

    */


    public static double sqrt(double n, double tolerance){
      return sqrt(n, n/2, tolerance);
    }

    private static double sqrt(double n, double guess, double tolerance) {
      if (Math.abs(guess * guess - n) > tolerance) {
        return sqrt(n, (n / guess + guess) / 2, tolerance);
      }
      return guess;
    }



    /*Recursively find the n'th fibbonaci number in linear time
     *fib(0) = 1; fib(1) = 1; fib(5) = 5
     *precondition: n is non-negative
     */
    public static int fib(int n){
      return fib(n, 0, 1);
    }

    private static int fib(int n, int a, int b) {
      if (n == 0)
        return a;
      if (n == 1)
        return b;
      return fib(n-1, b, a + b);
    }



    /*As Per classwork*/
    public static ArrayList<Integer> makeAllSums(int n){
      ArrayList<Integer> sums = new ArrayList<Integer>();
      makeAllSums(n, 0, sums);
      return sums;
    }

    private static void makeAllSums(int n, int partialSum, ArrayList<Integer> sums) {
      if (n > 0) {
        makeAllSums(n - 1, partialSum + n, sums);
        makeAllSums(n - 1, partialSum, sums);
      }
      if (n == 0) {
        sums.add(partialSum);
      }
    }

    //testcase must be a valid index of your input/output array
    public static void testFib(int testcase){
      Recursion r = new Recursion();
      int[] input = {0,1,2,3,5,30};
      int[] output ={0,1,1,2,5,832040};
      int max = input.length;
      if(testcase < input.length){
        int in = input[testcase];
        try{

          int ans = r.fib(in);
          int correct = output[testcase];
          if(ans == correct){
            System.out.println("PASS test fib "+in+". "+correct);
          }
          else{
            System.out.println("FAIL test fib"+in+". "+ans+" vs "+correct);

          }
        }catch(IllegalArgumentException n){
          if(in < 0){
            System.out.println("PASS test fib"+in+" IllegalArgumentException");
          }else{
            System.out.println(" FAIL IllegalArgumentException in test case:"+in);
          }
        }catch(Exception e){
          System.out.println(" FAIL Some exception in test case:"+in);
        }
      }
    }


    //testcase must be a valid index of your input/output array
    public static void testSqrt(int testcase){
      Recursion r = new Recursion();
      double[] input = {0.0,1.0, 2.0, 4.0, 7.0};
      double[] output = {0.0,1.0,1.4142135623730951,2.0,2.6457513110645907};
      int max = input.length;
      if(testcase < input.length){
        double in = input[testcase];
        try{

          double ans = r.sqrt(in,.00001);
          double correct = Math.sqrt(in);
          if(closeEnough(ans,correct)){
            System.out.println("PASS test sqrt "+in+" "+ans);
          }
          else{
            System.out.println("FAIL test sqrt "+in+" "+ans+" vs "+correct);

          }
        }catch(IllegalArgumentException n){
          if(in < 0){
            System.out.println("PASS test sqrt"+in+" IllegalArgumentException");
          }else{
            System.out.println(" FAIL IllegalArgumentException in test case:"+in);
          }
        }catch(Exception e){
          System.out.println(" FAIL Some exception in test case:"+in);
        }
      }
    }

    public static boolean closeEnough(double a, double b){
      if(a==0.0 && b==0.0)return true;
      if(a==0.0)return b < 0.00000000001;
      if(b==0.0)return a < 0.00000000001;
      return Math.abs(a-b)/a < 0.0001;//This is the normal % difference allowed
    }

    public static void main(String[] args) {
      /*
      System.out.println(fib(0));
      System.out.println(fib(1));
      System.out.println(fib(2));
      System.out.println(fib(3));
      System.out.println(fib(4));
      System.out.println(fib(5));
      System.out.println(fib(6));
      System.out.println(fib(7));
      System.out.println(makeAllSums(3));
      System.out.println(sqrt(100, 0.0001));
      System.out.println(sqrt(0, 0.0001));
      System.out.println(sqrt(81, 0.0001));
      System.out.println(sqrt(2, 0.00000001));
      */
      testFib(0);
      testFib(1);
      testFib(2);
      testFib(3);
      testFib(4);
      testFib(5);
      testSqrt(0);
      testSqrt(1);
      testSqrt(2);
      testSqrt(3);
      testSqrt(4);
    }

}
