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
public class NoShowList {
    private LinkedList<Person> noShows;

    public NoShowList() {
        noShows = new LinkedList<>();
    }

    public void addNoShow(Person person) {
        if (noShows.size() == 5) {
            noShows.removeFirst(); // Keep only last 5
        }
        noShows.add(person);
    }

    public void displayNoShows() {
        if (noShows.isEmpty()) {
            System.out.println("No recent no-shows.");
        } else {
            System.out.println("Last 5 No-Shows:");
            for (Person p : noShows) {
                System.out.println(p);
            }
        }
    }

    public LinkedList<Person> getNoShows() {
        return noShows;
    }
}