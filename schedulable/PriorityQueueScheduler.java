/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package schedulable;
import java.util.PriorityQueue;

/**
 *
 * @author NagbontianAliciaBene
 */
public class PriorityQueueScheduler implements Scheduler {
    private PriorityQueue<Person> queue;
   

    public PriorityQueueScheduler() {
        queue = new PriorityQueue<>();
    }//orders elements based on ther priority
    
    public String getQueueDetails() {
    if (queue.isEmpty()) {
        return "No patients in the queue.";
    }
    
    StringBuilder sb = new StringBuilder();
    for (Person p : queue) { //stores people in queue
        sb.append(p.toString()).append("\n");
        //appends each person details
    }
    return sb.toString();
}

    @Override
    public void addPerson(Person person) {
        queue.add(person);
    }

    @Override
    public Person getNextPerson() {
        return queue.poll();//removes/return priority people
    }

    public boolean isEmpty() {
        return queue.isEmpty();
    }
}
