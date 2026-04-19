public class UC4 {
    public static void main(String[] args) {
        // Goal: Print all names if provided, else "World"
        if (args.length > 0) {
            System.out.print("Hello ");
            // Loop through all arguments
            for (int i = 0; i < args.length; i++) {
                System.out.print(args[i] + (i < args.length - 1 ? ", " : ""));
            }
            System.out.println();
        } else {
            System.out.println("Hello World");
        }
    }
}