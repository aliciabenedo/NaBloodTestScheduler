/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package schedulable;

import java.util.LinkedList;

/**
 *
 * @author NagbontianAliciaBene
 * print each person in the list  one by one 
 * till end of the list is reached
 */
public class RecursionHelper {
        public static void displayRecursively(LinkedList<Person> list, int index) {
            //stops recursion when index reaches list size
        if (index >= list.size()) return;
        System.out.println(list.get(index));///prints the person at the current index
        displayRecursively(list, index + 1);//recursive call for next indexs
    }
}
