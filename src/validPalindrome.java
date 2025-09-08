public class validPalindrome {
    public boolean isPalindrome(String s) {
        boolean flag = true;
        int len = s.length();
        for (int i = 0; i < len / 2; i++) {
            if (s.charAt(i) != s.charAt(len - i - 1)) {
                flag = false;
                break;
            }
        }
        return flag;
    }
}
