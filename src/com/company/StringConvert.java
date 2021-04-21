package com.company;

public class StringConvert {
    //метод для конвертации строки
    public static String convert(String s) {
        //создаем строку-результат
        StringBuilder result = new StringBuilder();
        //определяем символ буквы
        char letter = s.charAt(0);
        //счетчик
        int count = 1;
        //в цикле итерируемся по символам строки
        for (int i = 1; i < s.length(); i++) {
            //если символ равен нашему символу, увеличиваем счетчик
            if (s.charAt(i) == letter) {
                count++;
                //к строке добавляем сначала количество, потом этот символ
            } else {
                result.append(count);
                result.append(letter);
                //присваиваем следующее значение нашему символу 
                letter = s.charAt(i);
                //обнуляем счетчик
                count = 1;
            }
        }
        //добавляем в строку количество и символ
        result.append(count);
        result.append(letter);
        //возвращаем строку
        return result.toString();
    }
}





