package CSC1350_Spring24.Variables;

public class ReplaceExample {
    public static void main(String[] args) {
        System.out.println("Original string");
        String stringWithAmpersands = "a&string&with&ampersands";
        System.out.println(stringWithAmpersands);
        System.out.println("\nReplaced string");
        System.out.println(stringWithAmpersands.replace("a&s", "replaced"));

        System.out.println("\nString has not actually changed");
        //the replace method doesn't change the value of the original string
        System.out.println(stringWithAmpersands);

        //if you want to create a string with the method call you can either
        // reassign the variable or create a new variable

        System.out.println("\nNow the string has changed because we reassigned it.");
        stringWithAmpersands = stringWithAmpersands.replace("&", " ");
        System.out.println(stringWithAmpersands);
    }
}
