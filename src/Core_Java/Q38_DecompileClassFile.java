package Core_Java;

public class Q38_DecompileClassFile {
    private final String name;

    public Q38_DecompileClassFile(String name) {
        this.name = name;
    }

    public String greet() {
        return "Hello, " + name;
    }

    public static void main(String[] args) {
        System.out.println(new Q38_DecompileClassFile("Decompiler").greet());
    }
}
