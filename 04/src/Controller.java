//
// Created by Manaki ITO on 2022/04/20.
// Modified by Manaki ITO on 2022/05/01.
// 伊藤 愛基 ( #2019024 )
//

public class Controller {
    private View view;
    private ReminderList reminderList;

    public View getView() {
        return view;
    }

    public void setView(View view) {
        this.view = view;
    }

    public ReminderList getReminderList() {
        return reminderList;
    }

    public void setReminderList(ReminderList reminderList) {
        this.reminderList = reminderList;
    }

    public void add(int i, String n, int p) {
        //追加するReminderインスタンスを1つ作る
        Reminder r1 = new Reminder();
        //引数で渡されたリマインダ情報をインスタンスにsetする
        r1.setName(n);
        r1.setPriority(p);
        //i番目にリマインダを追加する
        reminderList.add(i, r1);
    }
}
