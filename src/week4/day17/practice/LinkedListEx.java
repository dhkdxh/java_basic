package week4.day17.practice;

public class LinkedListEx {
    public static void main(String[] args) {
        Node<Integer> node1 = new Node<>(1);
        Node<Integer> node2 = new Node<>(2);

        node1.next = node2;//노드간 연결
        Node<Integer> head = node1;
    }
}
