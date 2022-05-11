        if(e.getSource()==l1) {
            //ダブルクリックで選択された項目の場所をsに代入
            int s = l1.getSelectedIndex();
            //リマインダのリストを取得
            Reminder[] l = reminderList.getReminder();
            //テキストフィールドにリマインダの情報をsetする
            //（整数はString.valueOfで文字列に変換）
            index.setText(String.valueOf(s));
            name.setText(l[s].getName());
            priority.setText(String.valueOf(l[s].getPriority()));
        }
