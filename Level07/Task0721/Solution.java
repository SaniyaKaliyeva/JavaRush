/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Level07.Task0721;

/*Минимаксы в массивах
Создать массив на 20 чисел.
Заполнить его числами с клавиатуры.
Найти максимальное и минимальное числа в массиве.
Вывести на экран максимальное и минимальное числа через пробел.


Требования:
1. Создай массив целых чисел (int[]) на 20 элементов.
2. Считай с клавиатуры 20 целых чисел и добавь их в массив.
3. Найди и выведи через пробел максимальное и минимальное числа.
4. Используй цикл for.
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Минимаксы в массивах
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int maximum = Integer.MIN_VALUE;
        int minimum = Integer.MAX_VALUE;

        int[] array = new int[20];
        for(int i = 0; i < array.length; i++){
            array[i] = Integer.parseInt(reader.readLine());
        }
        for(int i = 0; i < array.length; i++){
            if(array[i] > maximum){
                maximum = array[i];
            }
        }
        for(int i = 0; i < array.length; i++){
            if(array[i] < minimum){
                minimum = array[i];
            }
        }

        System.out.print(maximum + " " + minimum);
    }
}
