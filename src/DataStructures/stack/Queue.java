package DataStructures.stack;

import DataStructures.node.Node;
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

import javax.swing.DefaultListModel;

/**
 *
 * @author marck
 */
public class Queue<T> {

    private Node<T> first;
    private Node<T> last;

    public Queue() {
        first = null;
        last = null;
    }

    public boolean isEmpty() {
        return first == null && last == null;
    }

    public void queue(T val) {
        Node<T> node = new Node(val);

        if (first == null) {
            first = node;
            last = node;
        } else {
            last.setNext(node);
            last = node;
        }
    }

    public void encolarAlInicio(T val) {
        Node<T> node = new Node(val);

        if (first == null) {
            first = node;
            last = node;
        } else {
            node.setNext(first);
            first = node;
        }
    }

    public T peak() {
        if (!isEmpty()) {
            return first.getInfo();
        }
        return null;
    }

    public T dequeue() {

        if (!isEmpty()) {
            T val = first.getInfo();

            if (first == last) {
                first = null;
                last = null;
            } else {
                first = first.getNext();
            }
            return val;
        }
        return null;
    }

    public T delete(T val) {
        if (isEmpty()) {
            return null;
        }

        if (first.getInfo().equals(val)) {
            return dequeue();
        }

        Node<T> current = first;
        while (current.getNext() != null && !current.getNext().getInfo().equals(val)) {
            current = current.getNext();
        }

        if (current.getNext() == null) {
            return null;
        }

        Node<T> nodeToDelete = current.getNext();
        current.setNext(nodeToDelete.getNext());

        if (nodeToDelete == last) {
            last = current;
        }

        return nodeToDelete.getInfo();
    }

    public void clear() {
        while (first != null) {
            first = first.getNext();
        }
        last = null;
    }

    public void show(DefaultListModel model) {

        model.removeAllElements();
        Node<T> p = first;
        while (p != null) {
            model.addElement(p.getInfo());
            p = p.getNext();
        }
    }

    public int contar() {
        int c = 0;
        Node<T> p = first;
        while (p != null) {
            c++;
            p = p.getNext();
        }
        return c;
    }
}
