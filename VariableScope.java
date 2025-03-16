public class VariableScope {
    
    // Global (class-level) variable
    static int globalCount = 100;

    public static void main(String[] args) {
        // Print the global variable from main
        System.out.println("Global Count (from main): " + globalCount);
        
        // Call the showScope method
        showScope();
    }

    // Method to demonstrate variable scope
    public static void showScope() {
        // Local variable inside showScope
        int localCount = 50;
        
        // Print both global and local variables
        System.out.println("Global Count (from showScope): " + globalCount);
        System.out.println("Local Count (from showScope): " + localCount);
    }
}
