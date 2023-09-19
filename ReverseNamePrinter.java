public class ReverseNamePrinter {
    public static void main(String[] args) {
        String name = "divya";
        System.out.print("Name in reverse: ");
        printNameReverse(name);
    }

    public static void printNameReverse(String name) {
        if (name == null || name.isEmpty()) {
            return;
        }
        System.out.print(name.charAt(name.length() - 1));
        printNameReverse(name.substring(0, name.length() - 1));
    }
}
