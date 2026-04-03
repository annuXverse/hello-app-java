public class UC3 {
    public static void main(String[] args) {
        // Goal: If name exists use it, else use "World"
        String name = (args.length > 0) ? args[0] : "World";
        System.out.println("Hello " + name);
    }
}