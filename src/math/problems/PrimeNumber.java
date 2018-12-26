package math.problems;

public class PrimeNumber {

	public static void main(String[] args) {
        /*
         * Find list of Prime numbers from number 2 to 1 million.
         * Try the best solution as possible.Which will take less CPU life cycle.
         * Out put number of Prime numbers on the given range.
         *
         *
         * Use any databases[MongoDB, Oracle, MySql] to store data and retrieve data.
         *
         */
        int counter = 0;
        for (int a = 2; a < 1000000; a++){
            if (a == 2){
                System.out.println(a);
            }
            else if (isPrime(a)){
                counter++;
                System.out.println(a);
            }
        }
        System.out.println("Numbers are = " + counter);

    }

	public static boolean isPrime(int b){
	   if (b%2 == 0){
	       return false;
       }
       for (int c = 3; c*c <= b; c+=2){
          if(b%c == 0){
              return false;
          }
       }
       return true;
    }

}
