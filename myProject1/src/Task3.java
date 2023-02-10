import java.util.Scanner;

public class Task3 {
    //if else
    //Scanner
    public static void main(String[] args){
        System.out.println("- Lesson number one / - Task number three -");

        Scanner input1 = new Scanner(System.in);

        System.out.println("a deyisenini daxil edin - ");
        int a = input1.nextInt();

        System.out.println("b deyisenini daxil edin - ");
        int b = input1.nextInt();

        System.out.println("c deyisenini daxil edin - ");
        int c = input1.nextInt();

        if(c!=0){
            if((a+b)/c<10){
                System.out.println(a+ " ile " + b + " -nin ceminin " + c + " -ye bolunmesinden alinan 10 dan kicikdir");
            }else if((a+b)/c==10){
                System.out.println(a+ " ile " + b + " -nin ceminin " + c + " -ye bolunmesinden alinan 10 dan beraberdir");
            }else{
                System.out.println(a+ " ile " + b + " -nin ceminin " + c + " -ye bolunmesinden alinan 10 dan boyukdur");
            }
        }else{
            System.out.println(" c = " + c + " ugursuz emeliyyat ");
        }



    }
}
