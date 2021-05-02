import java.util.Scanner;
public class PR_5 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter three Number: ");
        int x = sc.nextInt();
        int y = sc.nextInt();
        int z = sc.nextInt();
        int temp;

        
        if(x<y){
            temp = x;
            x = y;
            y = temp;
        }
        if(z>y){
            if(z>x){
                temp = z;
                z = y;
                y = x;
                x = temp;
            }
            else{
                temp = z;
                z = y;
                y = temp;
            }
        }
        System.out.println("Number in Desending Order: \n"+x+"\n"+y+"\n"+z);
        
    }
}
