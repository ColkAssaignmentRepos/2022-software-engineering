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

        // 課題 5-3 作業 1
        //リマインダの配列を取得する
        Reminder[] l = reminderList.getReminder();
        //i番目にインスタンスが存在している場合は、そこから空いている場所まで追加場所を後にずらす
        //最後まで空きがない場合は、配列の最後に追加する(上書きされる場合もある)
        if(l[i] != null) {
            while(l[i]!=null && i<l.length-1) i++;
        }

        //i番目にリマインダを追加する
        reminderList.add(i, r1);
    }

    // 課題5-4 Controller().remove() ( 作業 3 )
    public void remove(int i) {
        //i番目のリマインダを削除する
        reminderList.remove(i);
    }
}
