package net.mindview.util;

import java.util.LinkedList;

/**
 * Created by Rafal on 02017-04-07.
 */
public class Stack<T> {
    private LinkedList<T> storage = new LinkedList<T>();
    public void push(T v){storage.addFirst(v);}
    public T peek(){return storage.getFirst();}
    public T pop(){return storage.removeFirst();}
    public boolean empty(){return storage.isEmpty();}
    public String toString(){return storage.toString();}
}
