//
// Created by Manaki ITO on 2022/04/06.
// 伊藤 愛基 ( #2019024 )
//

public class MyCalc {
    private int result1;
    private int result2;

    public int getResult1() {
        return result1;
    }

    public int getResult2() {
        return result2;
    }

    public void setResult1(int result1) {
        this.result1 = result1;
    }

    public void setResult2(int result2) {
        this.result2 = result2;
    }

    public MyCalc() {
        this.result1 = -1;
        this.result2 = -1;
    }

    public void show() {
        System.out.println("result1: " + this.result1);
        System.out.println("result2: " + this.result2);
    }

    public void calc(int x, int y) {
        this.result1 = x + y;
        this.result2 = x * y;
    }

}
