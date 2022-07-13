//
// Created by Manaki ITO on 2022/07/13.
// 伊藤 愛基 ( #2019024 )
//

import java.util.ArrayList;


public class Shortcut extends File {
    private String path;

    public Shortcut(String n, String e, String p) {
        super(n, e);

        this.path = p;
    }

    @Override
    public String toString() {
        String retval;
        retval = super.toString() + " -> " + this.path;

        return retval;
    }
}
