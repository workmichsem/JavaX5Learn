package homework6.task1;

import java.util.Collection;
import java.util.Iterator;

//    Создать собственную типизированную коллекцию с методами:
//        - int size() – возвращает размер коллекции
//        - void add(E item) – добавить элемент в коллекцию
//        - void remove(int index) – удаляет элемент по индексу
//        - void remove(E item) – удаляет элемент
//        - E get(int index) – получение элемента по индексу
//        - void clear() – очищает коллекцию
public class MyCollection implements Collection {

//    public int size() {
//        return 0;
//    }

    public boolean add(Collection collection) {
        return false;
    }


//    public boolean remove(int index) {
//        return false;
//    }

    public boolean remove(Collection collection) {
        return false;
    }

    public boolean get(int index) {
        return false;
    }

//    public Iterator iterator() {
//        return null;
//    }
//
//    public void clear() {
//
//    }









    @Override
    public int size() {
        return 0;
    }

    @Override
    public boolean add(Object o) {
        return false;
    }


    public boolean remove(int index) {
        return false;
    }

    @Override
    public boolean remove(Object o) {
        return false;
    }

    @Override
    public Iterator iterator() {
        return null;
    }

    @Override
    public void clear() {

    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public boolean contains(Object o) {
        return false;
    }


    @Override
    public Object[] toArray() {
        return new Object[0];
    }

    @Override
    public boolean addAll(Collection c) {
        return false;
    }

    @Override
    public boolean retainAll(Collection c) {
        return false;
    }

    @Override
    public boolean removeAll(Collection c) {
        return false;
    }

    @Override
    public boolean containsAll(Collection c) {
        return false;
    }

    @Override
    public Object[] toArray(Object[] a) {
        return new Object[0];
    }


}