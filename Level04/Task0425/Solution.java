/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Level04.Task0425;

/*Цель установлена!
Ввести с клавиатуры два целых числа, которые будут координатами точки, не лежащей на координатных осях OX и OY.
Вывести на экран номер координатной четверти, в которой находится данная точка.
Подсказка:
Принадлежность точки с координатами (a,b) к одной из четвертей определяется следующим образом:
для первой четверти a>0 и b>0;
для второй четверти a<0 и b>0;
для третьей четверти a<0 и b<0;
для четвертой четверти a>0 и b<0.

Пример для чисел 4 6:
1

Пример для чисел -6 -6:
3


Требования:
1. Программа должна считывать числа c клавиатуры.
2. Программа должна использовать команду System.out.println() или System.out.print().
3. Если точка находится в первой координатной четверти, вывести "1".
4. Если точка находится в второй координатной четверти, вывести "2".
5. Если точка находится в третей координатной четверти, вывести "3".
6. Если точка находится в четвёртой координатной четверти, вывести "4".
 */
/* 
Цель установлена!
*/

import java.io.*;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        if(a>0 && b>0){
            System.out.println("1");
        }
        else if(a<0 && b>0){
            System.out.println("2");
        }
        else if(a<0 && b<0){
            System.out.println("3");
        }
        else if(a>0 && b<0){
            System.out.println("4");
        }

    }
}

