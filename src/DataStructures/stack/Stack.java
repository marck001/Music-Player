package DataStructures.stack;



/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


import javax.swing.DefaultListModel;
import DataStructures.node.Node;
/**
 *
 * @author marck
 */
public class Stack<T> {
     private Node<T> L;
    
    public Stack(){
        L=null;
    }

    public Node<T> getL() {
        return L;
    }

    public void setL(Node<T> L) {
        this.L = L;
    }
    
    public void push(T val)
    {
        Node<T> node = new Node<>(val);
        node.setNext(L);
        L=node;
    }
    
    public T pop(){
        T cima=L.getInfo();
        L=L.getNext();
        return cima;
    }
    
   public T top(){
        return L.getInfo();
    }

    
    public boolean isEmpty(){
        return L==null;
    }
    
    public void clear(){
        while(L!=null)
            L=L.getNext();
    }
    
    public int count() {
        int c = 0;
        Node<T> p =L;
        while (p != null) {
            c++;
            p = p.getNext();
        }
        return c;
    }
    
    public void show(DefaultListModel model){
        Node current=L;
        model.removeAllElements();
        while(current!=null)
        {
            model.addElement(current.getInfo());
            current=current.getNext();
        }
    }
}
