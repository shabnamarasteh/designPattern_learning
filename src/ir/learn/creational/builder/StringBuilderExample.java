package ir.learn.creational.builder;

public class StringBuilderExample {
    public static void main(String[] args) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Hello").append("How are you?").append(12).append(" Bye").toString();
    }
}
