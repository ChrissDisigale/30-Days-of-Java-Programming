//Day 16 - Using switch to return a value.

import java.security.SecureRandom;

public class Day016 {

    public static void main(String[] args) {
        String result = map(randomNumber());
        System.out.println(result);
    }

    private static String map(int number) {
        // Requires JDK 12
        return switch (number) {
            case 1 -> "one";
            case 2 -> "two";
            case 3 -> "three";
            default -> "unknown";
        };
    }

    private static int randomNumber() {
        return new SecureRandom().nextInt(4);
    }
}