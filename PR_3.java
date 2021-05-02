import java.util.Scanner;
public class PR_3 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter Number in Meter: ");
        double m = input.nextDouble();
        double f=m*3.2808;
        System.out.println("Result in feet: "+f);

    }
}
