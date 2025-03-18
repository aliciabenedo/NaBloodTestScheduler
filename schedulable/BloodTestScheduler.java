/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package schedulable;
import java.util.LinkedList;
import java.util.Queue;
/**
 *
 * @author NagbontianAliciaBene
 */
public class BloodTestScheduler {
    private Queue<Person> patientQueue = new LinkedList<>();

    public void addPerson(Person person) {
        patientQueue.add(person);
    }

    public Person getNextPerson() {
        return patientQueue.poll();
    }
    public Person peekNextPerson() {
    return patientQueue.peek();  // Returns the next person without removing them
}

    public String getAllPatientsInfo() {
        StringBuilder sb = new StringBuilder();
        for (Person p : patientQueue) {
            sb.append(p.toString()).append("\n");
        }
        return sb.toString();
    }


}

