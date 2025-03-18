/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package schedulable;

import java.util.LinkedList;

/**
 *
 * @author NagbontianAliciaBene
 */
public class RecursionHelper {
        public static void displayRecursively(LinkedList<Person> list, int index) {
        if (index >= list.size()) return;
        System.out.println(list.get(index));
        displayRecursively(list, index + 1);
    }
}
