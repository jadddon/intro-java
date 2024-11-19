package L20;

public class ExceptionTester {
    
    public static void main(String[] args) {

        String x = "Hello!";

        // String x = null;

        try{
            System.out.println("Point 1");
            System.out.println(x.charAt(100));
            System.out.println("Point 2");
        } catch(StringIndexOutOfBoundsException e) {
            System.out.println(e);
        }catch(NullPointerException e) {
            System.out.println(e);
        }catch(ArrayIndexOutOfBoundsException e) {
            System.out.println(e);
        }

        System.out.println("And on and on...");

}

}
