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
        return strValue.charAt(0) == strValue.charAt(3) 
                && strValue.charAt(1) == strValue.charAt(2);
    }

    public boolean isPerfectSquare() {
        int sqrtValue = (int) Math.sqrt(this.value);
        return sqrtValue * sqrtValue == this.value;
    }
}
