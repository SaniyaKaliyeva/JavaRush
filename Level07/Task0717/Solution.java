/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Level07.Task0717;

/*Удваиваем слова
1. Введи с клавиатуры 10 слов в список строк.

2. Метод doubleValues должен удваивать слова по принципу:
"альфа", "бета", "гамма" -> "альфа", "альфа", "бета", "бета", "гамма", "гамма"

3. Выведи результат на экран, каждое значение с новой строки.


Требования:
1. Объяви переменную типа список строк и сразу проинициализируй ee.
2. Считай 10 строк с клавиатуры и добавь их в список.
3. Метод doubleValues должен удваивать элементы списка по принципу альфа,бета,гамма -> альфа,альфа,бета,бета,гамма,гамма.
4. Выведи получившийся список на экран, каждый элемент с новой строки.
 */
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Удваиваем слова
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> list = new ArrayList<>();
        for(int i = 0; i < 10; i ++){
            list.add(reader.readLine());
        }

        ArrayList<String> result = doubleValues(list);
        for(String s : list){
            System.out.println(s);
        }
    }

    public static ArrayList<String> doubleValues(ArrayList<String> list) {
        for(int i = 0; i < list.size();i+=2){
            list.add(i+1, list.get(i));
        }
        return list;
    }
}
