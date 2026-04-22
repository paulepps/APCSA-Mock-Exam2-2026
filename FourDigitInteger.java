public class FourDigitInteger {
    
    private int value;

    public FourDigitInteger(int aValue) {
        this.value = aValue;
    }

    public boolean isOdd() {
        return this.value % 2 != 0;
    }

    public boolean isPalindrome() {
        String strValue = Integer.toString(this.value);
        String reversedStrValue = new StringBuilder(strValue).reverse().toString();
        return strValue.equals(reversedStrValue);
    }

    public boolean isPerfectSquare() {
        int sqrtValue = (int) Math.sqrt(this.value);
        return sqrtValue * sqrtValue == this.value;
    }
}
