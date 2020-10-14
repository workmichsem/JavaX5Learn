package homework6.task1;


public class MainTask1 {
    public static void main(String[] args) {
        SampleArrayList sampleArrayList = new SampleArrayList();
        sampleArrayList.add("1");
        sampleArrayList.add("4");
        sampleArrayList.add("2");
        sampleArrayList.add("3");
        sampleArrayList.print();
        sampleArrayList.get(1);
        sampleArrayList.remove(1);
        sampleArrayList.print();
        sampleArrayList.remove();
        sampleArrayList.print();
        sampleArrayList.print();
        sampleArrayList.clear();

        SampleLinkedList<Integer> sampleLinkedList = new SampleLinkedList();
        sampleLinkedList.add(2);
        sampleLinkedList.add(1);
        sampleLinkedList.add(4);
        sampleLinkedList.add(1);
        sampleLinkedList.get(2);
        sampleLinkedList.remove();
        sampleLinkedList.remove(2);
        sampleLinkedList.clear();
    }
}