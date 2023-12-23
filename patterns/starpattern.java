package patterns;

public class starpattern {

    public static void main(String args[]){
        //outerloop
        for(int line=1;line<=4;line++){
            //inner loop
            for (int star=1;star<=line;star++){
                // isme saare stars ek saath ek ine mai print hojayenge
                System.out.print("*");
            }
            //toh saare stars ko alag line mai print krne ke liye print ln krna pdega
            System.out.println();
        }

    }
}

//jo line++ likha hai vo ek line ke stars ko print krneke baad netx line pr chala jayega
