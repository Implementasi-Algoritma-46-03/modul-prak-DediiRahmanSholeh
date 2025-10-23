import java.util.Scanner;

public class TP02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String kalimat = input.nextLine(); 

        String hasil = ""; 

        for (int i = 0; i < kalimat.length(); i++) {
            char c = kalimat.charAt(i);

        
            char lower = Character.toLowerCase(c);

            switch (lower) {
                case 'a':
                case 'i':
                case 'u':
                case 'e':
                case 'o':
                    break;
                default:
                    hasil += c;
                    break;
            }
        }

        System.out.println(hasil); 
    }
}