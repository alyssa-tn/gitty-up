package gitty.up;

public class Calculator {
    public String getGreeting() {
        return "Hello World!";
    }

    public static void main(String[] args) {
        System.out.println(new Calculator().getGreeting());
    }
}
