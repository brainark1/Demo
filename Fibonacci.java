public class Fibonacci {

   public int calculateFib(int n) {
     int curr = 1;
     int prev = 0;
     for (int i = 1; i < n; i++) {
       int next = curr + prev;
       prev = curr;
       curr = next;
     }
     return curr;
   }
}
