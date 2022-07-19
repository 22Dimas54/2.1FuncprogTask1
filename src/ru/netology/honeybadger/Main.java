package ru.netology.honeybadger;

import java.util.*;
import java.util.stream.Collectors;

/*

-generatorDictionary - чистая функция, так как она:
                        1. детерминирована(сколько бы раз мы не подали одну и туже строку, результат всегда будет одинаков)
                        2. не обладает побочным эффектом(аргумент попав в данную фунцию никак не измениться "внешними факторами")

-используется концепция функций высших порядков - функция println принимает в качестве аргумента функцию generatorDictionary

-используется концепция монады - в функции generatorDictionary строка разбивается на стринговый массив, потом сортирутся и выдает коллекцию

*/
public class Main {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Аборигены говорите:");
            System.out.println(generatorDictionary(scanner.nextLine()));
        } catch (Exception e) {
            e.getMessage();
        }
    }

    private static List<String> generatorDictionary(String input) {
        return Arrays.stream(input.split(" "))
                .sorted()
                .collect(Collectors.toList());
    }
}
