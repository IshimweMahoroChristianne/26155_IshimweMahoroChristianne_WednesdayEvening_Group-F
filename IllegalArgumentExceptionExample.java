// IllegalArgumentExceptionExample.java
public class IllegalArgumentExceptionExample {
    public static void main(String[] args) {
        try {
            Thread.sleep(-1000);
        } catch (IllegalArgumentException | InterruptedException e) {
            System.out.println("IllegalArgumentException occurred: " + e.getMessage());
        }
    }
}