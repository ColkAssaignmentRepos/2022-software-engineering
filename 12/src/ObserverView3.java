//
// Created by Manaki ITO on 2022/07/06.
// 伊藤 愛基 ( #2019024 )
//

import java.awt.BorderLayout;
import java.awt.Frame;
import java.util.ArrayList;
import java.awt.List;

public class ObserverView3 implements Observer {
    private SubjectModel subjectModel;

    private Frame f1;
    private List l1;

    private final int WINDOW_SIZE_W = 250;
    private final int WINDOW_SIZE_H = 250;

    public ObserverView3() {
        f1 = new Frame("View3");
        l1 = new List();

        f1.add(l1, BorderLayout.CENTER);

        this.f1.setSize(this.WINDOW_SIZE_W, this.WINDOW_SIZE_H);

        f1.setVisible(true);
    }

    public SubjectModel getSubjectModel() {
        return subjectModel;
    }

    public void setSubjectModel(SubjectModel subjectModel) {
        this.subjectModel = subjectModel;
    }

    public void update() {
        this.l1.removeAll();

        ArrayList<String> var1 = this.subjectModel.getData();

        for (String s : var1) {
            this.l1.add(s);
        }

        this.f1.pack();
    }
}
