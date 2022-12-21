

import java.util.function.*;

public class Calculator {
    static Supplier<Calculator> instance = Calculator::new;


    BinaryOperator<Integer> plus = (x, y) -> x + y;
    BinaryOperator<Integer> minus = (x, y) -> x - y;
    BinaryOperator<Integer> multiply = (x, y) -> x * y;
    //BinaryOperator<Integer> divide = (x, y) -> y>0 && y<0 ? x / y : 0; //Возникает ошибка деления на 0.

    //todo: Решить проблему можно разными путями. №1: Нужно ловить Exception. №2: нужно задавть проверку для "y".
    BinaryOperator<Integer> divide = (x, y) -> y.equals(0) ? 0 : x / y; //Этот способ также считаю уместным для данной работы.


    UnaryOperator<Integer> pow = x -> x * x;
    UnaryOperator<Integer> abs = x -> x > 0 ? x : x * -1;
    Predicate<Integer> isPositive = x -> x > 0;
    Consumer<Integer> println = System.out::println;
}
