package main.java.com.egor_abrosimov.javacore.chapter15;

public class BlockLambdaDemo2 {
    public static void main(String[] args) {
        StringFunc reverse = str ->{
            String result = "";

            for (int i = str.length() - 1; i >= 0; i--)
                result += str.charAt(i);

            return result;
        };

        System.out.println("Лямбда обращается на " + reverse.func("Лямбда"));
        System.out.println("Выражение обращается на " + reverse.func("Выражение"));
    }
}

interface StringFunc{
    String func(String n);
}
