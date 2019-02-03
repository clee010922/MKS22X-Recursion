public class Recursion {
    /*You may write additional private methods */

    /*Recursively find the sqrt using Newton's approximation
     *tolerance is the allowed percent error the squared answer is away from n.
     *precondition: n is non-negative

    */

    /*
    public static double sqrt(double n, double tolerance){

    }

    */

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
      return makeAllSums(n, 0);
    }

    private static ArrayList<Integer> makeAllSums(int n, int partialSum) {

    }

     /*
    public static void main(String[] args) {
      System.out.println(fib(0));
      System.out.println(fib(1));
      System.out.println(fib(2));
      System.out.println(fib(3));
      System.out.println(fib(4));
      System.out.println(fib(5));
      System.out.println(fib(6));
      System.out.println(fib(7));
    }
    */

}
