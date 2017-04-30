package generics;

/**
 * Created by Rafal on 02017-04-30.
 */
public class LinkedStack2<T> {
    private class Node<U>{
        U item;
        Node<U> next;
        Node(){item=null;next=null;}
        Node(U item, Node<U> next){
            this.item=item;
            this.next=next;
        }
        boolean end(){return item == null && next == null;}
    }
    private Node<T> top = new Node<>(); // end sentinel?
    public void push(T item){
        top = new Node<>(item, top);
    }
    public T pop(){
        T result = top.item;
        if (!top.end())
            top=top.next;
        return result;
    }

    public static void main(String[] args) {
        LinkedStack2<String> lss = new LinkedStack2<>();
        for (String s:"RAFIRAF is the BEST".split(" ")
             ) {
            lss.push(s);
        }
        String s;
        while ((s = lss.pop()) != null)
            System.out.println(s);
    }
}
