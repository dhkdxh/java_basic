package week4.day17.practice;

public class SingleLinkedListEx <T>{
    public Node<T> head = null;

    public class Node<T> {
        T data;
        Node<T> next = null;
        public Node(T data){
            this.data = data;
        }
    }

    public void addNode(T data){
        if(head == null){
            head = new Node<>(data);
        }else{
            Node<T> node = this.head;
            while(node.next != null){
                node = node.next;
            }
            node.next = new Node<>(data);
        }
    }

    public void printAll(){
        Node<T> node = head;
        while(node.next != null){
            System.out.print(node.data + " ");
            node = node.next;
        }
        System.out.print(node.data+"\n");
    }

    public Node<T> search(T data){
        Node<T> node = head;
        while(node.next != null){
            if(node.data.equals(data)) return node;
            node = node.next;
        }
        return null;//data가 없다면
    }

    public boolean deleteNode(T isData){
        Node<T> checked = search(isData);
        if(checked==null) return false;//데이터가 linkedlist에 없음

        if(head.data.equals(isData)) {
            head = head.next;
            return true;
        }
        Node<T> node = head;
        while(node.next!= null){
            if(node.next.data.equals(isData)) {
                node.next = node.next.next;
                return true;
            }
            node = node.next;
        }
        return false;
    }

    public void addNodeInside(T data, int index){
        Node<T> current = head;
        for(int i=0; i<index-1; i++){
            current = current.next;
        }

        Node<T> newNode = new Node<>(data);
        Node<T> temp = current.next;
        current.next = newNode;
        newNode.next = temp;
    }

    public static void main(String[] args) {
        SingleLinkedListEx<Integer> myLinkedList = new SingleLinkedListEx<>();

        myLinkedList.addNode(1);
        myLinkedList.addNode(2);
        myLinkedList.addNode(3);
        myLinkedList.addNode(4);
        myLinkedList.addNode(5);

//        System.out.println(myLinkedList.head.data);
//        System.out.println(myLinkedList.head.next.data);
        myLinkedList.printAll();
        myLinkedList.addNodeInside(6, 2);
        System.out.println("-----------------------------");
        myLinkedList.printAll();
        boolean isDeleted = myLinkedList.deleteNode(6);
        System.out.println("-----------------------------");
        myLinkedList.printAll();
    }
}
