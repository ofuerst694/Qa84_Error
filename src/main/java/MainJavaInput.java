import java.util.Scanner;

public class MainJavaInput {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);//(iz vne chto-to poluchit') iz console
        System.out.print("enter your name and surname >>>>>");
     // String name = scan.next();//do pervogo probella odno slowo
        String name = scan.nextLine();// dast wsju stroku
        System.out.println("Your name is " + name);
        System.out.print("Enter your age >>>>> ");
        int age = scan.nextInt();
        System.out.println("Your are " + age + "year old");
    }
}
