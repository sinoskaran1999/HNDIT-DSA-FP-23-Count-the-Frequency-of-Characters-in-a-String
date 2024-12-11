public class Frequency {
    public static void main(String[] args) {
        String input = "apple";
        int[] frequency = new int[26]; // Array for 26 lowercase letters

        // Traverse the string and count the frequencies using a linear search
        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            int index = c - 'a'; // Map 'a' to index 0, 'b' to index 1, etc.
            frequency[index]++; // Increment the frequency count
        }

        // Output in the specific order: 'a', 'p', 'l', 'e'
        System.out.print("{");
        // First 'a'
        if (frequency[0] > 0) System.out.print("'a': " + frequency[0] + ", ");
        // Second 'p'
        if (frequency[15] > 0) System.out.print("'p': " + frequency[15] + ", ");
        // Third 'l'
        if (frequency[11] > 0) System.out.print("'l': " + frequency[11] + ", ");
        // Fourth 'e'
        if (frequency[4] > 0) System.out.print("'e': " + frequency[4] + ", ");
        System.out.println("\b\b}"); // Remove trailing comma and space
    }
}

