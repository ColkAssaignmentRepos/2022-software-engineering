    public void add(int i, String n, int p) {
        //追加するReminderインスタンスを1つ作る
        Reminder r1 = new Reminder();
        //引数で渡されたリマインダ情報をインスタンスにsetする
        r1.setName(n);
        r1.setPriority(p);
        //i番目にリマインダを追加する
        reminderList.add(i, r1);
    }
