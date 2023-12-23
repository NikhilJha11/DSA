package functions;



import java.util.Scanner;

public class factorial {
    public static int fact(int n){ // creating the function with the logic codes
        int f=1; // initalising the value of f with initial value as 1
        for(int i=1;i<=n;i++){ // creating the loop with i increment
            f=f*i;
        }
        return f;
    }

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter a number");
        int a = sc.nextInt();  // taking the input from the user
        int ans=fact(a); // calling the fact function from above
        System.out.println("factorial is: "+ans);
    }
}

// logic is goes like f=1*1=1
 // for next line the value of f is 1 , f=1*2=2, value of i increased from 1 to 2 therefore 1*2= value of factorial of 2
// for next line the value of f will be 2 , f=2*3=6, value of i =3  , therefore value of 3 factorial will be 6
// for next line the value of f will be 6, f=6*4=24, value of i =4, therefore value of 4 factorial will be 24
//