package by.it.group251051.kozlovski.lesson01;

import java.math.BigInteger;

/*
 * Вам необходимо выполнить рекурсивный способ вычисления чисел Фибоначчи
 */

public class FiboA { // объявляем публичный класс FiboA, в котором находиться основной код программы

    private long startTime = System.currentTimeMillis();
    // задаем локальную переменную, в которую сохраняем текущее время системы

    private long time() { return System.currentTimeMillis() - startTime; }
    // функция, возвращающая разницу текущего времени и прошлой переменной(тем самым делая счетчик)

    public static void main(String[] args) {// основное тело программы
        FiboA fibo = new FiboA();// задаем новую переменную класса FiboA
        int n = 33;// задаем целочисленную переменную, в которой будет храниться номер числа Фибоначчи
        System.out.printf("calc(%d)=%d \n\t time=%d \n\n", n, fibo.calc(n), fibo.time());// вывод результата на экран

        //вычисление чисел фибоначчи медленным методом (рекурсией)
        fibo = new FiboA();
        n = 33;
        System.out.printf("slowA(%d)=%d \n\t time=%d \n\n", n, fibo.slowA(n), fibo.time());// вывод результата на экран
    }


    private int calc(int n) { // функция расчета числа Фибоначчи рекурсией
        //здесь простейший вариант, в котором код совпадает с мат.определением чисел Фибоначчи
        //время O(2^n)
        if (n < 2) return n; // если n меньше 2, то возращаем значение n(выход из рекурсии)

        return calc(n - 1) + calc (n -2);
        // возращение значения суммы значений функции calc при n-1 и n-2(рекурсия)
    }


    BigInteger slowA(Integer n) {
        //рекурсия
        //здесь нужно реализовать вариант без ограничения на размер числа,
        //в котором код совпадает с мат.определением чисел Фибоначчи
        //время O(2^n)

        if (n == 0) return BigInteger.ZERO; // если n равен 0, возвращаем значение(выход из рекурсии)
        if (n == 1) return BigInteger.ONE;// если n равен 0, возвращаем значение(выход из рекурсии)

        return slowA(n-1).add(slowA(n -2));
        //возращение значения суммы значений функции slowA при n-1 и n-2(рекурсия)
    }



}
