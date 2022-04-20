//
// Created by Manaki ITO on 2022/04/20.
// 伊藤 愛基 ( #2019024 )
//

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Controller implements ActionListener {
    private View view;
    private ReminderList reminderList;

    public View getView() {
        return view;
    }

    public ReminderList getReminderList() {
        return reminderList;
    }

    public void setView(View view) {
        this.view = view;
    }

    public void setReminderList(ReminderList reminderList) {
        this.reminderList = reminderList;
    }


    public Controller() {

    }

    public void add(int i, String n, int p) {

    }

    public void remove(int i) {

    }

    public void clear() {

    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
