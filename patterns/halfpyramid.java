package patterns;

public class halfpyramid {
    public static void main(String[] args) {
        int n=5 ; //ye number of lines dikhaega
        for(int line=1;line<=n;line++){
            // line ke baad humko print krvana h numbers
            for(int number=1;number<=line;number++){
                System.out.print(number);
            }
            System.out.println();


        }
    }
}
 //