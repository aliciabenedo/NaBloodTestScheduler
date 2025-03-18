/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package schedulable;

/**
 *
 * @author NagbontianAliciaBene
 */
public class Person implements Comparable<Person> {
    private String name;
    private int age;
    private String priority; // Urgent, Medium, Low
    private String gpDetails;
    private boolean fromHospital;

    public Person(String name, int age, String priority, String gpDetails, boolean fromHospital) {
        this.name = name;
        this.age = age;
        this.priority = priority;
        this.gpDetails = gpDetails;
        this.fromHospital = fromHospital;
    }

    public String getName() { return name; }
    public int getAge() { return age; }
    public String getPriority() { return priority; }
    public String getGpDetails() { return gpDetails; }
    public boolean isFromHospital() { return fromHospital; }

    @Override
    public int compareTo(Person other) {
        // Compare priority levels
        int priorityComparison = getPriorityValue(this.priority) - getPriorityValue(other.priority);
        if (priorityComparison != 0) return priorityComparison; // Higher priority comes first
        if (this.fromHospital && !other.fromHospital) return -1; //prioitize  ppl in the hospiatal
        if (!this.fromHospital && other.fromHospital) return 1;
        return Integer.compare(other.age, this.age); // Older patients get priority
    }

    private int getPriorityValue(String priority) {
        return switch (priority.toLowerCase()) {
            case "urgent" -> 1;
            case "medium" -> 2;
            default -> 3; // Low priority
        };
    }

    @Override
    public String toString() {
        return name + " (Age: " + age + ", Priority: " + priority + ")";
    }
}