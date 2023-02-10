import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("- Lesson number one / - Task number one -");

        //User-den data almaq hissesi
        Scanner input1 = new Scanner(System.in);

        System.out.println("a deyisenini daxil edin - ");
        int a = input1.nextInt();

        System.out.println("b deyisenini daxil edin - ");
        int b = input1.nextInt();

        System.out.println("c deyisenini daxil edin - ");
        int c = input1.nextInt();

        System.out.println("d deyisenini daxil edin - ");
        int d = input1.nextInt();

        //shert bloku
        if(a+b>=c+d){
            System.out.println(a+ " ile " + b + " cemi " + c + " ile " + d + " ceminden boyukdur");
        } else if (a+b<=c+d) {
            System.out.println(a+ " ile " + b + " cemi " + c + " ile " + d + " ceminden kicikdir");
        }
    }
}