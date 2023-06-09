package main.java.com.egor_abrosimov.javacore.chapter29;

import java.util.ArrayList;
import java.util.Optional;
import java.util.stream.Stream;

public class StreamDemo {
    public static void main(String[] args) {
        ArrayList<Integer> myList = new ArrayList<>(){{
            add(7);
            add(18);
            add(10);
            add(24);
            add(17);
            add(5);
        }};

        System.out.println("Исходный список: " + myList);

        Stream<Integer> myStream = myList.stream();

        Optional<Integer> minVal = myStream.min(Integer::compare);
        if(minVal.isPresent())
            System.out.println("Минимальное значение: " + minVal.get());

        myStream = myList.stream();
        Optional<Integer> maxVal = myStream.max(Integer::compare);
        if(maxVal.isPresent())
            System.out.println("Максимальное значение: " + maxVal.get());

        Stream<Integer> sortedStream = myList.stream().sorted();
        System.out.print("Отсортированный поток данных: ");
        sortedStream.forEach(n -> System.out.print(n + " "));
        System.out.println();

        Stream<Integer> oddVals = myList.stream().sorted().filter(n -> (n%2) == 1);
        System.out.print("Нечетные значения: ");
        oddVals.forEach(n -> System.out.print(n + " "));
        System.out.println();

        oddVals = myList.stream().filter(n -> (n%2) == 1).filter(n -> n > 5);
        System.out.print("Нечетные значения больше 5: ");
        oddVals.forEach(n -> System.out.print(n + " "));
        System.out.println();
    }
}
