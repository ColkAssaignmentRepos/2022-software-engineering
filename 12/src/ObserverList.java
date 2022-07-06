//
// Created by Manaki ITO on 2022/07/06.
// 伊藤 愛基 ( #2019024 )
//

import java.awt.*;
import java.util.ArrayList;


public class ObserverList implements Observer {
    private SubjectData subjectData;

    private Frame frame;
    private List list;

    private final int WINDOW_SIZE_W = 250;
    private final int WINDOW_SIZE_H = 250;

    //コンストラクタ
    public ObserverList() {
        this.frame = new Frame("ObserverList");
        this.list = new List();

        this.frame.add(this.list, BorderLayout.CENTER);

        this.frame.setSize(this.WINDOW_SIZE_W, this.WINDOW_SIZE_H);

        this.frame.setVisible(true);
    }

    public SubjectData getSubjectData() {
        return this.subjectData;
    }

    public void setSubjectData(SubjectData sb) {
        this.subjectData = sb;
    }

    public void update() {
        this.list.removeAll();

        ArrayList<Integer> var1 = this.subjectData.getData();

        for (Integer i : var1) {
            this.list.add(i.toString());
        }

        this.frame.pack();
    }
}
