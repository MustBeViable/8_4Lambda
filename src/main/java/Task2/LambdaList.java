package Task2;

import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicInteger;

public class LambdaList {
    public static void main(String[] args) {
        Integer[] ints = {102020,1,200,2,12,11,23,3,4,121,223,313,1121,2,1337};
        ArrayList<Integer> intList = new ArrayList<>();
        for (Integer i : ints) {
            intList.add(i);
        }
        ArrayList<Integer> intArrayList = new ArrayList<>(intList);

        System.out.println("Alkuperänen lisna: " + intList);
        System.out.println();

        intArrayList.removeIf(n -> n % 2 == 0);
        System.out.println("Parittomat: " + intArrayList);
        System.out.println();

        intArrayList.replaceAll(n -> n*2);
        System.out.println("Parittomat kerrottuna kahdella: " + intArrayList);
        System.out.println();

        final int[] sumBox = {0};
        intArrayList.forEach(n -> sumBox[0] += n);
        int sumA = sumBox[0];
        System.out.println("Summa: " + sumA);
        }

    }
