package Introduction;

public class CommandLineExample {
    public static void main(String[] args) {
        // Check if any command line arguments are passed
        if (args.length > 0) {
            System.out.println("Command line arguments are:");

            // Loop through the arguments and print each one
            for (int i = 0; i < args.length; i++) {
                System.out.println("Argument " + i + ": " + args[i]);
            }
        } else {
            System.out.println("No command line arguments found.");
        }
    }
}
