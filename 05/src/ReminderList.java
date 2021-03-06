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

    public Reminder[] getReminder() {
        return reminder;
    }

    public void setView(View view) {
        this.view = view;
    }

    public ReminderList() {
        // 課題 5-2 で 要素数 20 に変更
        this.reminder = new Reminder[20];
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

        this.view.update();
    }

    public void remove(int i) {
        this.reminder[i] = null;

        this.view.update();
    }

    public void clear() {
        // 課題 5-2 で 要素数 20 に変更
        this.reminder = new Reminder[20];

        this.view.update();
    }

}
