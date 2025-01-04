/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkgtry;
class GenericList<T> {
    private T[] items;
    private int size;

    public GenericList(int capacity) {
        items = (T[]) new Object[capacity];
        size = 0;
    }

    public void add(T item) {
        if (size == items.length) {
            throw new IllegalStateException("List is full");
        }
        items[size++] = item;
    }

    public T get(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Index out of bounds");
        }
        return items[index];
    }

    public int size() {
        return size;
    }

    public void display() {
        System.out.print("List Contents: ");
        for (int i = 0; i < size; i++) {
            System.out.print(items[i] + " ");
        }
        System.out.println();
    }
}


public class Try {

   
    public static void main(String[] args) {
        GenericList<String> stringList = new GenericList<>(5);
        stringList.add("Alice");
        stringList.add("Bob");
        stringList.add("Charlie");
        stringList.display(); // Output: List Contents: Alice Bob Charlie

        System.out.println("Item at index 1: " + stringList.get(1)); // Output: Bob

        GenericList<Integer> integerList = new GenericList<>(5);
        integerList.add(10);
        integerList.add(20);
        integerList.add(30);
        integerList.display(); // Output: List Contents: 10 20 30
    }
    
}
