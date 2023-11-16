// Aaron Prince Anu 

public class Names {
    public static void main(String[] args) {
        while (true) {
            // Prompt for name input
            System.out.print("Enter a name (ZZZ to stop): ");
            String input = In.getString();

            // Check for exit condition
            if (input.equals("ZZZ")) {
                break;
            }

            // Process and print formatted name
            String formattedName = formatName(input);
            System.out.println(formattedName);
        }
    }

    private static String formatName(String name) {
        String formattedName;

        // Split the name into parts
        String[] parts = name.split("\\s+");

        // Check if there's only one name
        if (parts.length == 1) {
            return parts[0];
        }

        // Extract last name
        String lastName = parts[parts.length - 1];

        // Initialize formatted name with last name
            formattedName = lastName + ", ";

        // Process initials
        for (int i = 0; i < parts.length - 1; i++) {
            String initials = getInitials(parts[i]);
            formattedName += initials + " ";
        }

        // Trim trailing space and return the formatted name
        return formattedName.trim();
    }

    private static String getInitials(String word) {
        // Extract the first character as an initial
        return word.substring(0, 1) + ".";
    }
}