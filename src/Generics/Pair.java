package Generics;

public class Pair <K,V> {

    private K First;

    private V Second;

    public V getSecond() {
        return Second;
    }

    public void setSecond(V second) {
        Second = second;

    }

    public K getFirst() {
        return First;
    }

    public void setFirst(K first) {
        First = first;
    }
}