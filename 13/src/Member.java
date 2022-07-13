//
// Created by Manaki ITO on 2022/07/13.
// 伊藤 愛基 ( #2019024 )
//

import java.util.ArrayList;


public class Member implements Component {
    private String name;
    private String type;
    private String sort;

    private ArrayList<Component> children;

    public Member(String n, String t, String s) {
        this.name = n;
        this.type = t;
        this.sort = s;
    }

    public ArrayList<Component> getChildren() {
        return null;
    }

    public String toString() {
        switch (this.sort) {
            case "field":
                return this.name + ": " + this.type;

            case "method":
                return this.name + "(): " + this.type;
        }

        return null;
    }
}
