//
// Created by Manaki ITO on 2022/04/20.
// 伊藤 愛基 ( #2019024 )
//

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class View implements ActionListener {
    private Controller controller;
    private ReminderList reminderList;

    // リスト表示用フレーム
    private Frame listFrame;

    private final String LIST_WINDOW_TITLE = "Reminder - List";
    private final int LIST_WINDOW_SIZE_W = 500;
    private final int LIST_WINDOW_SIZE_H = 300;

    private List list;

    // 追加用フレーム
    private Frame addFrame;

    private final String ADD_WINDOW_TITLE = "Reminder - Add";

    private TextField index, name, priority;
    private Button add;

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
        // リスト表示用フレームのセットアップ
        this.listFrame = new Frame(this.LIST_WINDOW_TITLE);
        this.list = new List();

        this.listFrame.setSize(this.LIST_WINDOW_SIZE_W, this.LIST_WINDOW_SIZE_H);

        this.listFrame.add(this.list, BorderLayout.CENTER);

        // 追加用フレームのセットアップ
        this.addFrame = new Frame(this.ADD_WINDOW_TITLE);

        this.index = new TextField(5);
        this.name = new TextField(12);
        this.priority = new TextField(3);

        this.add = new Button("add");

        this.addFrame.setLayout(new FlowLayout());

        this.addFrame.add(this.index);
        this.addFrame.add(this.name);
        this.addFrame.add(this.priority);
        this.addFrame.add(this.add);

        this.addFrame.pack();

        // ActionListener の指定
        this.add.addActionListener(this);
        this.list.addActionListener(this);

        // フレームの表示
        this.listFrame.setVisible(true);
        this.addFrame.setVisible(true);
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

    @Override
    public void actionPerformed(ActionEvent e) {
        int i, p;
        String n;
        //押されたボタンがどれなのかを調べる
        if (e.getSource() == add) {
            //テキストフィールドから情報を取得するして整数に変換する
            //（メソッドparseIntは取得した文字列をint型に変換する）
            i = Integer.parseInt(index.getText());
            p = Integer.parseInt(priority.getText());
            n = name.getText();
            //Controllerのメソッドaddを呼び出す
            //・iは追加する配列の場所
            //・nはリマインダの名前
            //・pはリマインダ優先度
            controller.add(i, n, p);
        }
        if (e.getSource() == list) {
            //ダブルクリックで選択された項目の場所をsに代入
            int s = list.getSelectedIndex();
            //リマインダのリストを取得
            Reminder[] l = reminderList.getReminder();
            //テキストフィールドにリマインダの情報をsetする
            //（整数はString.valueOfで文字列に変換）
            index.setText(String.valueOf(s));
            name.setText(l[s].getName());
            priority.setText(String.valueOf(l[s].getPriority()));
        }
    }
}
