//Day 14 - Reversing a String
public class Day014 {

    public static void main(String[] args) {
        var original = "repoleveDssirhc";
        var reversed = new StringBuilder(original).reverse().toString();
        System.out.println(reversed);
    }
}
