/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DataStructures.node;

/**
 *
 * @author marck
 */
public class DoubleNode<T> {
     private T info;
    private DoubleNode previous;
    private DoubleNode next;

    public DoubleNode(T x) {
        info = x;
    }

    public DoubleNode(T x, DoubleNode previous, DoubleNode next) {
        info = x;
        this.previous = previous ;
        this.next = next;
    }

    public T getInfo() {
        return info;
    }

    public void setInfo(T info) {
        this.info = info;
    }

    public DoubleNode getPrevious() {
        return previous;
    }

    public void setPrevious(DoubleNode previous) {
        this.previous = previous;
    }

    public DoubleNode getNext() {
        return next;
    }

    public void setNext(DoubleNode next) {
        this.next = next;
    }

   
    
    
}
