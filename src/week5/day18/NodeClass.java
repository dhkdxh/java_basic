package week5.day18;

//binary search tree 구현
public class NodeClass {

    Node head = null;

    public class Node{
        Node left, right;
        int value;

        public Node(int value){
            this.value = value;
            this.left = null;
            this.right = null;
        }
    }

    public boolean insertNode(int value){
        //value가 처음 넣어질 경우
        if(head==null){
            head = new Node(value);
            return true;
        }
        //이미 tree가 있는데 node를 넣을 경우
        Node current = head;
        while(true){
            if(current.value > value){//값이 부모보다 작을 때
                if(current.left == null){
                    current.left = new Node(value);
                    return true;
                }else{
                    current = current.left;
                }
            }else{//값이 부모보다 클 때
                if(current.right == null){
                    current.right= new Node(value);
                    return true;
                }else{
                    current = current.right;
                }
            }
        }
    }

    public static void main(String[] args) {
        NodeClass nodeClass = new NodeClass();

    }
}
