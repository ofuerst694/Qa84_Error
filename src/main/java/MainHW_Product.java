import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class MainHW_Product {
    public static void main(String[] args) {
        ArrayList<ProductHW> product  =
                new ArrayList<>();
        ProductHW p = getProductHW();
        product.add(p);

        printProductHW(product);

    }


    private static ProductHW getProductHW() {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        ProductHW p = null;
        try{
            System.out.println("Please enter the name of the product: ");
            String name = br.readLine();
            System.out.println("Please enter the code of the product: ");
            int code = Integer.parseInt(br.readLine());
            System.out.println("Please enter the price of the product: ");
            double price = Double.parseDouble(br.readLine());
            p = new ProductHW(name, code, price);


        }catch(Exception e){
            System.out.println(e.getMessage());
        }
        return p;
    }

    private static void printProductHW(ArrayList<ProductHW> product) {
        for (ProductHW p : product) {
        System.out.println();
    }
}

}