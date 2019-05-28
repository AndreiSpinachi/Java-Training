package coding_bat.warmup_1;

public class Makes10 {

    public static void main(String[] args) {
        boolean result = makes10(5, 5);
        System.out.println("The result is: " + result);
    }

    public static boolean makes10(int a, int b) {
        return ((a == 10 | b == 10) | (a + b == 10)) ? true : false;
    }
}
