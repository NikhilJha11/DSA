package functions;

public class primeornot {

    public static boolean isPrime(int n){ // boolean case liya h true and false ke liye
        boolean isPrime=true; // boolean ko initally true le liya h
        //corner case / side cases
        if (n==2){
            return true;
        }
        for(int i=2; i<=Math.sqrt(n);i++){ // for loop use krke divisliblity test krliya
            if(n%i==0) { //completely dividing
                isPrime = false;
                break;
            }
        }
        return isPrime;
    }
    public static void main(String[] args) {

        System.out.println(isPrime(9));

    }


}
// initally true krdiya tha agar divisible by 2 aajayega toh false krdenege toh number not prime
// agar remainder aagya mtlb prime hai