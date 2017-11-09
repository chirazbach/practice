package asd.service;

public interface Calculator {
    int sum(int a, int b);

    int substraction(int a, int b);

    int multiplication(int a, int b);

    int divison(int a, int b) throws Exception;

    boolean equalIntegers(int a, int b);

}