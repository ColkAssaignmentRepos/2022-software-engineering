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

    // 課題 5-1 用 コンポーネント ( 作業 1 )
    private Frame f5;         //改良版GUIのフレーム
    private Button add2;      //改良版GUIの追加ボタン
    private TextField name2;  //改良版GUIのリマインダ名
    private Choice index2;    //改良版GUIの追加場所
    private Choice priority2; //改良版GUIの優先度\

    // 仮題 5-4 用フレーム ( 作業 1 )
    private Frame removeFrame;
    private TextField indexrm;
    private Button removeButton;

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

        // 課題 5-1 用 初期化処理 ( 作業 2 )
        //GUI部品を作る
        f5 = new Frame();
        index2 = new Choice();     //今回ポップアップメニューに変更してみた
        name2 = new TextField(15);
        priority2 = new Choice();  //今回ポップアップメニューに変更してみた
        add2 = new Button("add");
        //優先度用ポップアップメニューの項目を作る
        for (int i = 1; i <= 5; i++) {
            priority2.add(String.valueOf(i));
        }
        //フレームに部品を追加して表示
        f5.setLayout(new FlowLayout());
        f5.add(index2);
        f5.add(name2);
        f5.add(priority2);
        f5.add(add2);
        f5.pack();
        f5.setVisible(true);
        //追加用ボタンにリスナを登録
        add2.addActionListener(this);

        // 仮題 5-4 用 初期化処理 ( 作業 1 )
        this.removeFrame = new Frame();
        this.indexrm = new TextField(15);
        this.removeButton = new Button("remove");

        this.removeFrame.setLayout(new FlowLayout());

        this.removeFrame.add(this.indexrm);
        this.removeFrame.add(this.removeButton);

        this.removeFrame.pack();
        this.removeFrame.setVisible(true);

        this.removeButton.addActionListener(this);
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

        // 課題 5-1 ( 作業 3 )
        //追加先のメニュー項目を全て消す
        index2.removeAll();
        //リマインダの配列の長さ分だけ項目を作る
        for (int i = 0; i < l.length; i++) {
            index2.add(String.valueOf(i));
        }
        //メニュー項目が変わったので念のためフレームの部品を再配置する
        f5.pack();
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
        // 課題 5-1 actionPerformed 追加処理 ( 作業 4 )
        if (e.getSource() == add2) {
            //ポップアップメニューから情報を取得するして整数に変換する
            //（メソッドparseIntは取得した文字列をint型に変換する）
            i = Integer.parseInt(index2.getSelectedItem());
            p = Integer.parseInt(priority2.getSelectedItem());
            n = name2.getText();
            //Controllerのメソッドaddを呼び出す
            //・iは追加する配列の場所
            //・nはリマインダの名前
            //・pはリマインダ優先度
            controller.add(i, n, p);
        }
        // 課題 5-4 actionPerformed 追加処理 ( 作業 2 )
        if (e.getSource() == this.removeButton) {
            //テキストフィールドから情報を取得するして整数に変換する
            i = Integer.parseInt(indexrm.getText());
            //Controllerのメソッドremoveを呼び出す
            //iは削除する配列の場所
            controller.remove(i);
        }
    }
}
