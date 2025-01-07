public class Rev {
    public static void main(String[] args) {
        String s = "Hello, World!";
        String rev = "";
        for (int i = s.length() - 1; i >= 0; i--) {
            rev += s.charAt(i);
        }
        System.out.println(rev);
    }
}
