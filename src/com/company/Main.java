package com.company;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите через пробел числа от 1 до 10 и операцию, которую вы хотите произвести");
        System.out.println("Числа могут быть как римскими, так и арабскимим");
        System.out.println("Главное, чтобы оба числа были римскими или оба арабскими");
        System.out.println("Пример: 5 * 5, V * V");
        String a = scanner.next();// Инициализируем первое число
        String op = scanner.next();// Инициализируем операцию
        String b = scanner.next();// Инициализируем второе число
        Calc Operation = new Calc();
        Array valu = new Array();
        while ((valu.VALUES.contains(a) && valu.VALUES.contains(b))
                || (valu.getArabian().containsKey(a) && valu.getArabian().containsKey(b))) {
            Operation.calc(a, op, b);
            a = scanner.next();
            op = scanner.next();
            b = scanner.next();
        } throw new UnsupportedOperationException("Прочитайте условие еще раз");
    }
}




