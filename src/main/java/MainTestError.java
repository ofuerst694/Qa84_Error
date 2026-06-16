public class MainTestError {
    public static void main(String[] args) {
      int size = Integer.MAX_VALUE;//peremennnaja
     // int[] ar = new int[size];//masiv pustoj sozdali
        while(true) {
            try {
                int[] ar = new int[size];
                break;
            } catch (Error e) {
                System.out.println(e.getMessage());
                size = size / 2;
                //size--; 5-6hours
            }
        }
        System.out.println("Size = " + (size * 4)/ 1024/1024/1024);
    }
}
