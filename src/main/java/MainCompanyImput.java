import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;

public class MainCompanyImput {
    public static void main(String[] args) {

        ArrayList<Employee> company =
                new ArrayList<>();
        Employee emp = getEmployee();
        company.add(emp);

        printCompany(company);
    }


    private static void printCompany(ArrayList<Employee> company) {
        for (Employee e : company) {
            System.out.println(e);
        }
    }

    private static Employee getEmployee() { //method sozdajet vvod rabotnika i dobawit k listu
        InputStreamReader is = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(is);//chitaet stroki
        Employee emp = null;
        try {
            System.out.print("Enter your name >>>>");
            String name = br.readLine();
            System.out.print("enter ID >>>>>");
            String str = br.readLine();
            int id = Integer.parseInt(str);
            System.out.print("Enter your position >>>>> ");
            String position = br.readLine();
            System.out.print("Enter your salary >>>>> ");
            str = br.readLine();
            double salary = Double.parseDouble(str);
            emp = new Employee(name, id, position, salary);

        }catch (IOException e){
            System.out.println(e.getMessage());
        }
        return emp;
    }
}
/*
HW
ArrayList<Product>
Product
----------
name(String)
code(int)
price(double)

input ->
add number products use sreams
and
add to list

printLists
 */