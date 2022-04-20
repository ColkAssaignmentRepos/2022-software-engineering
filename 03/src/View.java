//
// Created by Manaki ITO on 2022/04/20.
// 伊藤 愛基 ( #2019024 )
//

public class View {
    private Controller controller;
    private ReminderList reminderList;

    public Controller getController() {
        return controller;
    }

    public ReminderList getReminderList() {
        return reminderList;
    }

    public void setController(Controller controller) {
        this.controller = controller;
    }

    public void setReminderList(ReminderList reminderList) {
        this.reminderList = reminderList;
    }


    public View() {

    }

    public void update() {

    }
}
