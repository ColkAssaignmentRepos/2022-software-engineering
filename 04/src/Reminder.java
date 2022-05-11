//
// Created by Manaki ITO on 2022/04/13.
// 伊藤 愛基 ( #2019024 )
//

public class Reminder {
    private String name;
    private int priority;
    private ReminderList reminderList;

    public String getName() {
        return name;
    }

    public int getPriority() {
        return priority;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPriority(int priority) {
        this.priority = priority;
    }

    public Reminder() {
        this.name = "no name";
        this.priority = 0;
    }

    public void show() {
        System.out.println(this.name + "(" + this.priority + ")");
    }

}
