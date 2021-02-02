package com.company;

interface Adder2 {
    int add(int a, int b);
}

interface StringConcat {
    String sconcat(String a, String b);
}

interface AddInterface {
    int test(int a, int b);
}

class Adder {
    static int add(int a, int b, AddInterface ad) {
        return ad.test(a, b);
    }
}

public class Main {

    public static void main(String[] args) {

        Adder2 adder2 = (int a, int b) -> {
            System.out.println(a + b);
            return a + b;
        };

        adder2.add(10, 2);

        StringConcat s = (str1, str2) -> {
            return str1 + str2;
        };
        System.out.println("Result: " + s.sconcat("Beema ", "Nesrin"));

        Adder adder = new Adder();
        int sum = Adder.add(10, 5, (a, b) -> {
            return a + b;
        });
        System.out.println("Result: " + sum);
    }

}
