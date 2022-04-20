//
// Created by Manaki ITO on 2022/04/13.
// 伊藤 愛基 ( #2019024 )
//

public class ReminderList {
    private View view;
    private Reminder[] reminder;

    public View getView() {
        return view;
    }

    public void setView(View view) {
        this.view = view;
    }

    public ReminderList() {
        this.reminder = new Reminder[10];
    }

    public void show() {
        System.out.println(
                "----------Reminder List----------"
        );
        for (int i = 0; i < this.reminder.length; i++) {
            if (this.reminder[i] == null) {
                continue;
            }

            System.out.print(i + ": ");
            this.reminder[i].show();
        }
        System.out.println(
                "---------- End of List ----------"
        );
        System.out.println();
    }

    public void add(int i, Reminder r) {
        this.reminder[i] = r;
    }

    public void remove(int i) {
        this.reminder[i] = null;
    }

    public void clear() {
        this.reminder = new Reminder[10];
    }

}
