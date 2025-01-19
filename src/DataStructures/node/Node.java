package DataStructures.node;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author marck
 * @param <T>
 */
public class Node<T> {

    private T info;
    private Node<T> next;

    public Node() {
    }

    public Node(T info) {
        this.info = info;
     //   this.sgte=null;

    }

    public Node(T info, Node<T> next) {
        this.info = info;
        this.next = next;
    }

    public T getInfo() {
        return info;
    }

    public void setInfo(T info) {
        this.info = info;
    }

    public Node<T> getNext() {
        return next;
    }

    public void setNext(Node<T> next) {
        this.next = next;
    }

   
}
