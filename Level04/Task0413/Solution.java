/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Level04.Task0413;

/*День недели
Ввести с клавиатуры номер дня недели, в зависимости от номера вывести название
"понедельник", "вторник", "среда", "четверг", "пятница", "суббота", "воскресенье",
если введен номер больше 7 или меньше 1 - вывести "такого дня недели не существует".

Пример для номера 5:
пятница

Пример для номера 10:
такого дня недели не существует


Требования:
1. Программа должна считывать число c клавиатуры.
2. Программа должна выводить текст на экран.
3. Если введено число от 1 до 7, необходимо вывести день недели.
4. Если введено число не входящее в интервал от 1 до 7, то вывести уведомление что такого дня недели не существует.
 */
/* 
День недели
*/

import java.io.*;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        if(number == 1){
            System.out.println("понедельник");
        }
        else if(number == 2){
            System.out.println("вторник");
        }
        else if(number == 3){
            System.out.println("среда");
        }
        else if(number == 4){
            System.out.println("четверг");
        }
        else if(number == 5){
            System.out.println("пятница");
        }
        else if(number == 6){
            System.out.println("суббота");
        }
        else if(number == 7){
            System.out.println("воскресенье");
        }
        else{
            System.out.println("такого дня недели не существует");
        }
    }
}