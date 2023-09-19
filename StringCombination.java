public class StringCombination {
    public static void main(String[] args) {
        String str = "abcde";
        for (int i = 0; i <= str.length(); i++) {
            for (int j = i; j <= str.length(); j++) {
                System.out.println(str.substring(i, j));
            }
        }
    }
}
