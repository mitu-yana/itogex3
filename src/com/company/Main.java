package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner number = new Scanner(System.in);
        Scanner stroka = new Scanner(System.in);
        System.out.println("введите количество строк");
        int n = number.nextInt();
        int max_length=0;
        int where=0;
        String[] strarray = new String[n];
            for (int i=0;i<n;i++) {
            System.out.println("Введите строку");
            strarray[i] = stroka.nextLine();
        }
        String[] undoubles = new String[n];
        for (int i=0;i<n;i++)  {
            String[] char_array=strarray[i].split("");
            undoubles[i]=char_array[0];
            for (String sym: char_array) {
                if (!undoubles[i].contains(sym)) {
                    undoubles[i]+=sym;
                }
                }
            if (max_length< undoubles[i].length()) {
                    max_length=undoubles[i].length();
                    where=i;
            }



        }
        System.out.println(strarray[where]);

    }
}


//Задание:
//пользователь вводит сначала количество строк n, затем сами строки.
// Среди данных строк найти строку с максимальным количеством различных символов.
// Если таких строк будет много, то вывести первую.
//
//Пример для теста работы программы:
//
//Количество строк: 3
//Строка 1: привет
//Строка 2: анализ
//Строка 3: 111111111111
//Ответ: привет