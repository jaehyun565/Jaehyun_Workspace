package test04_finally;

public class FinallyTest1 {
    public static void main(String[] args) {

        int num = 1;
        
        try {
            System.out.println("1");
            int i = 1 / num;
            System.out.println("2");
            return;
        } catch (ArithmeticException e) {
            System.out.println("3");            
        } finally {
            System.out.println("4");
            
        }
        System.out.println("5");
    }
}
