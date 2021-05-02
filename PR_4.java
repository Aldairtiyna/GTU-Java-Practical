import java.util.Scanner;
public class PR_4 {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Your Weight in pound : ");
        float w = sc.nextFloat();

        System.out.print("Enter Your Height in Inch : ");
        float h = sc.nextFloat();

        double BMI = (w*0.4535) / ((h*0.0254)*(h*0.0254));

        System.out.println("Your BMI is: "+BMI);

    } 
}
