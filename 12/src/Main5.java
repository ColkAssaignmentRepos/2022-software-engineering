//
// Edited by Manaki ITO on 2022/07/06.
// 伊藤 愛基 ( #2019024 )
//

public class Main5 {
    public static void main(String[] args) {
        //Observerを作る
        ObserverBarGraph observerBarGraph = new ObserverBarGraph();
        ObserverLineGraph observerLineGraph = new ObserverLineGraph();
        ObserverList observerList = new ObserverList();
        //Subjectを作る
        SubjectData subjectData = new SubjectData();

        //ObserverからSubjectを参照する
        observerBarGraph.setSubjectData(subjectData);
        observerLineGraph.setSubjectData(subjectData);
        observerList.setSubjectData(subjectData);
        //SubjectにObserverを追加する
        subjectData.addObserver(observerBarGraph);
        subjectData.addObserver(observerLineGraph);
        subjectData.addObserver(observerList);
        //各Observerを更新する
        subjectData.notifyObserver();
    }
}
