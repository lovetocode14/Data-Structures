package com.example.LinkedList;

public class Node<T> {

    public Node(T data)
    {
        this.data = data;
    }

    private T data;

    private Node<T> pointer;

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public Node<T> getPointer() {
        return pointer;
    }

    public void setPointer(Node<T> pointer) {
        this.pointer = pointer;
    }
}
