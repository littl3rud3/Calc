package com.company;

import static com.company.Array.arabicToRoman;

public class Calc {
        public static void calc(String Value1, String Operator, String Value2) {
            Array val = new Array();
            //Если оба числа арабских
        if (val.VALUES.contains(Value1) && val.VALUES.contains(Value2)) {
            switch (Operator) {
                case "*":
                    int mul = Integer.parseInt(Value1) * Integer.parseInt(Value2);
                    System.out.println(mul);
                    break;
                case "/":
                    int div = Integer.parseInt(Value1) / Integer.parseInt(Value2);
                    System.out.println(div);
                    break;
                case "+":
                    int sum = Integer.parseInt(Value1) + Integer.parseInt(Value2);
                    System.out.println(sum);
                    break;
                case "-":
                    int min = Integer.parseInt(Value1) - Integer.parseInt(Value2);
                    System.out.println(min);
                    break;
                default:
                    System.out.println("error");
                    break;
            }
        } else if (val.getArabian().containsKey(Value1) && val.getArabian().containsKey(Value2)) {
            switch (Operator) {
                case "*":
                    int mul = val.getArabian().get(Value1) * val.getArabian().get(Value2);
                    System.out.println(arabicToRoman(mul));
                    break;
                case "/":
                    int div = val.getArabian().get(Value1) / val.getArabian().get(Value2);
                    System.out.println(arabicToRoman(div));
                    break;
                case "+":
                    int sum = val.getArabian().get(Value1) + val.getArabian().get(Value2);
                    System.out.println(arabicToRoman(sum));
                    break;
                case "-":
                    int min = val.getArabian().get(Value1) - val.getArabian().get(Value2);
                    System.out.println(arabicToRoman(min));
                    break;
                default:
                    System.out.println("error");
                    break;
            }
        }
    }


}
