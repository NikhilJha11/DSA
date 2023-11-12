package functions;

public class binomialcoff {
    public static int binomialcoeff(int n, int r){ // values initialised as parameters
        int fact_n = factorial(n); // value of factorial n store krliya
        int fact_r = factorial(r); // baaki sabmai bhi same kiya
        int fact_nr = factorial(n-r);
        int binomialcoeff=fact_n/(fact_r*fact_nr); // then isme formula lagaya  binomial coeffiecient ka
        return binomialcoeff;


    }
    public static int factorial(int n){ // creating the function with the logic codes
        int f=1; // initalising the value of f with initial value as 1
        for(int i=1;i<=n;i++){ // creating the loop with i increment
            f=f*i;
        }
        return f;
    }  // ye function banaya tha to get the factorial of the number
    public static void main(String[] args) {
        System.out.println(binomialcoeff(6,2));
        // yaha sout mai 2 value le liya print krne ke liye

    }
}
