import java.io.*;

public class MainInputStream {
    public static void main(String[] args) {
        InputStreamReader is =
                new InputStreamReader(System.in);
        BufferedReader br =
                new BufferedReader(is);//chtoby chitat strokami
        System.out.println("Enter your name>>>>");
        String name = "";
        try {
            name = br.readLine();//br dolzhen byt w try
            System.out.println("Name is " + name);
            System.out.print("Enter your age>>>>> ");
            String str = br.readLine();// delaju iz neje
            double age = Double.parseDouble(str);// perewazhu v double
            System.out.println("Your age is " + age);
            System.out.print("Enter your ID >>>>> ");
            str = br.readLine();
            int id = Integer.parseInt(str);
            System.out.println("Your ID is " + id);
            br.close();//zakryt
        } catch(IOException e) {
            System.out.println(e.getMessage());//trow vyletit pervym, prerwet programmu
        }
    }
}
