package homework6.task1;


public class MainTask1 {
    public static void main(String[] args) {
        SampleArrayList sampleArrayList = new SampleArrayList();
        sampleArrayList.add("1");
        sampleArrayList.add("4");
        sampleArrayList.add("2");
        sampleArrayList.add("3");
        sampleArrayList.print();
//        sampleArrayList.get(1);
//        sampleArrayList.remove(1);
//        sampleArrayList.print();
//        sampleArrayList.removeLastElement();
//        sampleArrayList.print();
//        sampleArrayList.print();
//        sampleArrayList.clear();
//
//        SampleLinkedList<Integer> sampleLinkedList = new SampleLinkedList();
//        sampleLinkedList.add(2);
//        sampleLinkedList.add(1);
//        sampleLinkedList.add(4);
//        sampleLinkedList.add(1);
//        sampleLinkedList.get(2);
//        sampleLinkedList.removeLastElement();
//        sampleLinkedList.remove(2);
//        sampleLinkedList.clear();
    }
}
//
//Задание 1: ArrayList– пересоздание массива каждый раз при добавлении элемента – это достаточно дорогая
// операция, я бы посоветовал создавать массив с какой-то длиной и потом увеличивать его по мере
// необходимости, например, в 1,5 - 2 раза. При удалении элементов из списка, размер массива можно
// не уменьшать. public void remove() { - не понял смысла этого метода. Если хотите удалять последний
// элемент, то назовите метод соответствующе.
//        LinkedList: не увидел своей реализации
//
