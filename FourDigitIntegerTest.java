public class FourDigitIntegerTest {

    private static int testsRun = 0;
    private static int testsPassed = 0;

    public static void main(String[] args) {
        testIsOdd();
        testIsPalindrome();
        testIsPerfectSquare();

        System.out.println();
        System.out.println("Tests passed: " + testsPassed + "/" + testsRun);

        if (testsPassed != testsRun) {
            throw new AssertionError("One or more tests failed.");
        }
    }

    private static void testIsOdd() {
        assertEquals(true, new FourDigitInteger(1235).isOdd(), "isOdd: 1235 should be odd");
        assertEquals(false, new FourDigitInteger(2468).isOdd(), "isOdd: 2468 should be even");
    }

    private static void testIsPalindrome() {
        assertEquals(true, new FourDigitInteger(1221).isPalindrome(), "isPalindrome: 1221 should be a palindrome");
        assertEquals(true, new FourDigitInteger(1001).isPalindrome(), "isPalindrome: 1001 should be a palindrome");
        assertEquals(false, new FourDigitInteger(1234).isPalindrome(), "isPalindrome: 1234 should not be a palindrome");
    }

    private static void testIsPerfectSquare() {
        assertEquals(true, new FourDigitInteger(1024).isPerfectSquare(), "isPerfectSquare: 1024 should be a perfect square");
        assertEquals(true, new FourDigitInteger(1225).isPerfectSquare(), "isPerfectSquare: 1225 should be a perfect square");
        assertEquals(false, new FourDigitInteger(1234).isPerfectSquare(), "isPerfectSquare: 1234 should not be a perfect square");
    }

    private static void assertEquals(boolean expected, boolean actual, String message) {
        testsRun++;
        if (expected == actual) {
            testsPassed++;
            System.out.println("PASS - " + message);
        } else {
            System.out.println("FAIL - " + message + " (expected " + expected + ", got " + actual + ")");
        }
    }
}