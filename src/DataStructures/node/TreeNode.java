/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DataStructures.node;

/**
 *
 * @author marck
 */
public class TreeNode<T> {
    
    private T info;
    private TreeNode<T> left;
    private TreeNode<T> right;
    
     public TreeNode() {
        left= null;
        right = null;
    }

    public TreeNode(T info) {
        this.info = info;
        left = null;
        right = null;
    }

    public T getInfo() {
        return info;
    }

    public void setInfo(T info) {
        this.info = info;
    }

    public TreeNode<T> getLeft() {
        return left;
    }

    public void setLeft(TreeNode<T> left) {
        this.left = left;
    }

    public TreeNode<T> getRight() {
        return right;
    }

    public void setRight(TreeNode<T> right) {
        this.right = right;
    }
   
}
