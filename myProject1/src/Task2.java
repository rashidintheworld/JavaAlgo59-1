import java.util.Scanner;

public class Task2 {
    public static void main(String[] args){
        System.out.println("- Lesson number one / - Task number two -");

        //User-den data almaq
        Scanner input1 = new Scanner(System.in);

        System.out.println("a deyisenini daxil edin - ");
        int a = input1.nextInt();

        System.out.println("b deyisenini daxil edin - ");
        int b = input1.nextInt();

        System.out.println("c deyisenini daxil edin - ");
        int c = input1.nextInt();

        System.out.println("d deyisenini daxil edin - ");
        int d = input1.nextInt();

        //shert bloku :

        //1 ci sert
        if(a%2==0){
            System.out.println(a+" - Bu eded cut dur");
        }else{
            System.out.println(a+" - Bu eded tek dir");
        }

        //2 ci sert
        if(b%2==0){
            System.out.println(b+" - Bu eded cut dur");
        }else{
            System.out.println(b+" - Bu eded tek dir");
        }

        //3 cu sert
        if(c%2==0){
            System.out.println(c+" - Bu eded cut dur");
        }else{
            System.out.println(c+" - Bu eded tek dir");

        //4 cu sert
        } if(d%2==0){
            System.out.println(d+" - Bu eded cut dur");
        }else{
            System.out.println(d+" - Bu eded tek dir");
        }
    }
}
