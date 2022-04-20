public void update() {
    //リストの内容を全て消す
    l1.removeAll();
    //リマインダの配列を取得する
    Reminder[] l = reminderList.getReminder();
    //取得した配列に繰り返し処理をする
    for(int i=0; i<l.length; i++) {
        //リマインダの情報から文字列を作る
        String str = "";
        //配列の添字を追加
        str += "[" + String.valueOf(i) + "] ";
        if(l[i]!=null) {
            //リマインダの名前を取得して追加
            str += l[i].getName();
            //リマインダの優先度を取得して追加
            str += "(" + l[i].getPriority() + ") ";
        }
        //リストにリマインダ情報の文字列を追加
        l1.add(str);
    }
}
