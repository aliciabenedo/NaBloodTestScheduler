package schedulable;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */

/**
 *
 * @author NagbontianAliciaBene
 */
public interface Scheduler {
    void addPerson(Person person);/**adds person to system*/
    Person getNextPerson();    
/** Retrieves and removes the next person in the scheduling queue  */
}

    

