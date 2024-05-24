package main;

public interface I_AATree<T> extends Comparable<T> {

    Node<T> skew(Node<T> t);

    Node<T> split(Node<T> t);

    void clear();

    void insert(T value);

    boolean search(T value);

    void delete(T value);
}
