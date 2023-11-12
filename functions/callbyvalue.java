package functions;

public class callbyvalue {
    public static void main(String[] args) {
        int a= 10;// initialising the variable
        int b=15;
        swap(a,b); // calling the function in the main function
        System.out.println("inside the main function: "+ a+" " + b +"values would be same");

    }
    public static void swap(int a, int b){ // passing the parameters a and b

        int temp=a; // creating the extra temp to store the values of a and b
        a=b;
        b=temp;
        System.out.println("inside the swap function: "+ a+" "  + b +"values will be swapped");

    }
}
