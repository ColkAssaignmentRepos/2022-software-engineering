//
// Edited by Manaki ITO on 2022/07/13.
// 伊藤 愛基 ( #2019024 )
//

public class Main2 {
    public static void main(String[] args) {
        Directory root = new Directory("se-112");

        Directory src = new Directory("src");

        Directory srcKadai = new Directory("kadai");
        File observerBarGraph = new File("ObserverBarGraph", "java");
        File subjectData = new File("SubjectData", "java");

        File observer = new File("Observer", "java");
        File subject = new File("Subject", "java");

        Directory bin = new Directory("bin");

        Directory binKadai = new Directory("kadai");
        File observerBarGraphClass = new File("ObserverBarGraph", "class");
        File subjectDataClass = new File("SubjectData", "class");

        File observerClass = new File("Observer", "class");
        File subjectClass = new File("Subject", "class");

        root.add(src);

        src.add(srcKadai);
        srcKadai.add(observerBarGraph);
        srcKadai.add(subjectData);

        src.add(observer);
        src.add(subject);

        root.add(bin);

        bin.add(binKadai);
        binKadai.add(observerBarGraphClass);
        binKadai.add(subjectDataClass);

        bin.add(observerClass);
        bin.add(subjectClass);

        MyTreeModel m = new MyTreeModel(root);
        MyTreeView v = new MyTreeView(m);
    }
}
