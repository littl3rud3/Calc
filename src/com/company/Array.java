package com.company;

import java.util.*;
import java.util.stream.Collectors;

public class Array {
    //Создаём словарь римских цифр
    Map<String, Integer> arabian = new HashMap<String, Integer>();

    public Map<String, Integer> getArabian() {
        String[] arab = new String[]{"I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX", "X"};
        for (int i = 0; i < arab.length; i++) {
            arabian.put(arab[i], i + 1);
        }
            return arabian;
        }

    //Создаём перечень допустимых значений арабских цифр
    public static final Set<String> VALUES = Set.of(
            "1", "2", "3", "4", "5", "6", "7", "8", "9", "10"
    );
    enum RomanNumeral {
        I(1), IV(4), V(5), IX(9), X(10),
        XL(40), L(50), XC(90), C(100);

        private int value;

        RomanNumeral(int value) {
            this.value = value;
        }

        public int getValue() {
            return value;
        }

        public static List<RomanNumeral> getReverseSortedValues() {
            return Arrays.stream(values())
                    .sorted(Comparator.comparing((RomanNumeral e) -> e.value).reversed())
                    .collect(Collectors.toList());
        }
    }
    //Преобразуем ответ в римских цифрах
    public static String arabicToRoman(int number) {

        List<RomanNumeral> romanNumerals = RomanNumeral.getReverseSortedValues();

        int i = 0;
        StringBuilder sb = new StringBuilder();

        while ((number > 0) && (i < romanNumerals.size())) {
            RomanNumeral currentSymbol = romanNumerals.get(i);
            if (currentSymbol.getValue() <= number) {
                sb.append(currentSymbol.name());
                number -= currentSymbol.getValue();
            } else {
                i++;
            }
        }

        return sb.toString();
    }

}

