public class UC5 {
    public static void main(String[] args) {
        // Goal: Use Enhanced For Loop (for-each) to greet everyone
        if (args.length > 0) {
            System.out.print("Hello ");
            
            // Enhanced for loop: Simple and clean
            for (String name : args) {
                System.out.print(name + " ");
            }
            System.out.println();
        } else {
            System.out.println("Hello, World!");
        }
    }
}