public class UC7_StringJoin {
    public static void main(String[] args) {
        // Goal: Use String.join() for clean concatenation
        if (args.length > 0) {
            // "String.join"
            String names = String.join(", ", args);
            System.out.println("Hello " + names);
        } else {
            System.out.println("Hello, World!");
        }
    }
}