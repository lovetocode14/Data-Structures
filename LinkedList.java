package com.example.LinkedList;

public class LinkedList<T>
{
    Node head = new Node<T>(null);
    Node cursor;

     //Cursor is now pointing at head

    private void addAfterHead(T data) //add to right of cursor
    {
        cursor.setPointer(head);
        cursor.setPointer(new Node(data)); //cursor now points to new node

        if (head.getPointer() != null)
        {
            cursor.getPointer().setPointer(head.getPointer()); //get pointer of cursor (new node) and set its point to where head was pointing (put in inbetween head and whatever head node head was (possibly) pointing to. May be null
        }

        head.setPointer(cursor.getPointer()); //set head to new node pointed to from cursor
    }

    private void resetCursor() //set Cursor back to head
    {
        cursor.setPointer(head);
    }

   

}
