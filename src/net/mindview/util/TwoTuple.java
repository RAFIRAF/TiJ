package net.mindview.util;

/**
 * Created by Rafal on 02017-04-19.
 */
public class TwoTuple<A,B> {
    public final A first;
    public final B second;
    public TwoTuple(A a, B b){
        first=a;
        second=b;
    }

    @Override
    public String toString() {
        return "("+first+", "+second+")";
    }
}
