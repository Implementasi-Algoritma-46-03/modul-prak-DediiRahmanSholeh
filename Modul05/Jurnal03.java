import java.util.Scanner;

public class Jurnal03 {

    public static void main(final String[] args) {
        // Kerjakan soalnya di sini
      Scanner input= new Scanner(System.in);
      int A= input.nextInt();
      char O = input.next().charAt(0);
      int B = input.nextInt();

      switch(O){
        case  '+'  :
             System.out.println(A + B);
            break;
        case '-' :
            System.out.println(A - B );
            break ;
        case '*' :
            System.out.println(A * B);
            break ;
        case '/' :
             if (B == 0) {
                    System.out.println("Error");
                } else {
                    double hasil = (double) A / B;
                    System.out.printf("%.7f%n", hasil);
                }
                break;
            default:
                System.out.println("Operator tidak valid");
        }
    }
}
