package coding_bat.warmup_1;

//Given a string, return a new string where the first and last chars have been exchanged.
//frontBack("code") → "eodc"
//frontBack("a") → "a"
//frontBack("ab") → "ba"
public class FrontBack {
    public static void main(String[] args) {
        System.out.println(frontBack("Alibabax"));
    }

    public static String frontBack(String str) {
        if (str.length() <= 1) return str;
        Character firstCar = str.charAt(0);
        String lastChar = str.substring(str.length() - 1);
        String middleStr = str.substring(1, str.length() - 1);

        return lastChar + middleStr + firstCar;
    }
}
