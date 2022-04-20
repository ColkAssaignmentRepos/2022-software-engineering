//
// Created by Manaki ITO on 2022/04/20.
// 伊藤 愛基 ( #2019024 )
//

import java.awt.*;

public class View {
    private Controller controller;
    private ReminderList reminderList;

    private Frame frame;
    private List list;

    private final String WINDOW_TITLE = "Reminder";
    private final int WINDOW_SIZE_W = 250;
    private final int WINDOW_SIZE_H = 250;

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
        this.frame = new Frame(this.WINDOW_TITLE);
        this.list = new List();

        this.frame.setSize(this.WINDOW_SIZE_W, this.WINDOW_SIZE_H);

        this.frame.add(this.list, BorderLayout.CENTER);

        this.frame.setVisible(true);
    }

    public void update() {
        //リストの内容を全て消す
        this.list.removeAll();
        //リマインダの配列を取得する
        Reminder[] l = this.reminderList.getReminder();
        //取得した配列に繰り返し処理をする
        for (int i = 0; i < l.length; i++) {
            //リマインダの情報から文字列を作る
            String str = "";
            //配列の添字を追加
            str += "[" + String.valueOf(i) + "] ";
            if (l[i] != null) {
                //リマインダの名前を取得して追加
                str += l[i].getName();
                //リマインダの優先度を取得して追加
                str += "(" + l[i].getPriority() + ") ";
            }
            //リストにリマインダ情報の文字列を追加
            this.list.add(str);
        }
    }
}
