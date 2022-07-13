//
// Created by Manaki ITO on 2022/07/13.
// 伊藤 愛基 ( #2019024 )
//

public class Main4 {
    public static void main(String[] args) {
        Class car = new Class("Car");
        Member num = new Member("num", "int", "field");
        Member gas = new Member("gas", "double", "field");
        Member show = new Member("show", "void", "method");

        Class Date = new Class("Date");
        Member year = new Member("year", "int", "field");
        Member month = new Member("month", "int", "field");
        Member day = new Member("day", "int", "field");
        Member toString = new Member("toString", "String", "method");

        car.add(num);
        car.add(gas);
        car.add(show);

        car.add(Date);
        Date.add(year);
        Date.add(month);
        Date.add(day);
        Date.add(toString);

        MyTreeModel m = new MyTreeModel(car);
        new MyTreeView(m);
    }
}
