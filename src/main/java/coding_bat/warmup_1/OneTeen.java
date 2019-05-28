package coding_bat.warmup_1;

//We'll say that a number is "teen" if it is in the range 13..19 inclusive. Given 2 int values, return true if one or the other is teen, but not both.
//loneTeen(13, 99) → true
//loneTeen(21, 19) → true
//loneTeen(13, 13) → false
public class OneTeen {
    public static void main(String[] args) {
        System.out.println(loneTeen(25, 12));
    }

    public static boolean loneTeen(int a, int b) {
        boolean teenA = a >= 13 & a <= 19;
        boolean teenB = b >= 13 & b <= 19;
        boolean teenC = teenA & teenB;
        return (teenA | teenB) & !teenC ? true : false;
    }
}