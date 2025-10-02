package Task2;

import java.util.ArrayList;

public class LambdaList {
    public static void main(String[] args) {
        Integer[] ints = {102020,1,200,2,12,11,23,3,4,121,223,313,1121,2,1337};
        ArrayList<Integer> intList = new ArrayList<>();
        for (Integer i : ints) {
            intList.add(i);
        }
        ArrayList<Integer> intOdd = new ArrayList<>(intList);
        ArrayList<Integer> intEven = new ArrayList<>(intList);
        ArrayList<Integer> doubledInts = new ArrayList<>(intList);


        System.out.println("Alkuperänen lisna: " + intList);
        System.out.println();

        intOdd.removeIf(n -> n % 2 == 0);
        System.out.println("Parittomat: " + intOdd);
        System.out.println();

        intEven.removeIf(n -> n%2 != 0);
        System.out.println("Parilliset: " + intEven);
        System.out.println();

        doubledInts.replaceAll(n -> n*2);
        System.out.println("Tuplauksen jälkeen: " + doubledInts);

        }
    }
