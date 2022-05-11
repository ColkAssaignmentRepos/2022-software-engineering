    public void actionPerformed(ActionEvent e) {
        int i, p;
        String n;
        //押されたボタンがどれなのかを調べる
        if(e.getSource()==add) {
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
    }
