package Lesson_4.Task_4;

import java.util.ArrayList;
import java.util.List;

public class LRUCache<E> {
    ArrayList<E> listEmployee;
    int size;

    public LRUCache(int size) {
        listEmployee = new ArrayList<>();
        this.size = size;
    }

    public void addElement(E employee) {
        if (listEmployee.size() > size) {
            listEmployee.remove(0);
        }
        this.listEmployee.add(employee);
    }

    public E getElement(int ind) {
        if (ind >= listEmployee.size())
            return null;
        return this.listEmployee.get(ind);
    }

    public List<E> getAllElements() {
        return this.listEmployee;
    }
}