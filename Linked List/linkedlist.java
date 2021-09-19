public class linkedlist {
    private class Node {
        int data = 0;
        Node next = null;

        Node(int data) {
            this.data = data;
        }
    }

    private Node head = null;
    private Node tail = null;
    private int size = 0;

    public int size() {
        return this.size;
    }

    public boolean isEmpty() {
        return this.size == 0;
    }

    public void addLastNode(Node node) {
        if (size == 0) {
            this.head = this.tail = node;
        } else {
            this.tail.next = node;
            node.next = null;

        }
        this.size++;
    }

    public void addLast(int data) {
        Node node = new Node(data);
        addLastNode(node);
    }

    public void addFirstNode(Node node) {
        if (this.size == 0) {
            this.head = this.tail = node;
        } else {
            node.next = this.head;
            this.head = node;
        }
    }

    public void addFirst(int data) {
        Node node = new Node(data);
        addFirstNode(node);
    }

    /*
     * =============================================================================
     * =======================
     */
    public Node removeFirstNode() {
        Node node = this.head;
        if (this.size == 1) {
            this.head = this.tail = null;
        } else {
            this.head = this.head.next;
            node.next = null;
        }
        this.size--;
        return node;
    }

    public int removeFirst() {
        if (size == 0) {
            return -1;
        }

        return removeFirstNode().data;
    }

    // >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
    public Node getFirstNode() {
        return this.head;

    }

    public int getFirst() {
        if (size == 0)
            return -1;
        return getFirstNode().data;
    }

    public Node getLastNode() {
        return this.tail;
    }

    public int getLast() {
        if (size == -1)
            return -1;
        return getLastNode().data;

    }

    public Node getIdxNode(int idx) {
        Node curr = this.head;
        
        while (idx-- > 0) {
            curr = curr.next;
        }
        return curr;
    }

    public int getIdx(int idx) {
        if (size == 0)
            return -1;
        return getIdxNode(idx).data;
    }

    public Node removeLastNode() {
        Node node = this.tail;
        Node curr = this.head;
        if (size == 1) {
            this.head = this.tail = null;
        } else {
            while (curr.next != node) {
                curr = curr.next;
            }
        }
        this.tail = curr;
        curr.next = null;
        return node;
    }

    public int removeLast() {
        if (size == -1)
            return -1;
        return removeLastNode().data;
    }

    public Node removeNodeAt(int idx) {
        Node node=null;
        return node;
    }

    public int removeAt(int idx) {
        if (size == 0)
            return -1;
        Node node= getIdxNode(idx);
        Node curr= getIdxNode(idx-1);
        curr.next=node.next;
        return node.data;   
    
    }
    
    public void addNodeAt(Node node,int idx){
        if(idx==0)
         addFirstNode(node);
        else if(idx==size)
          addLastNode(node);
        else{
            Node next= getIdxNode(idx);
            Node prev= getIdxNode(idx-1);
            node.next=next;
            prev.next=node;
        }  
           

        
    }
    
    public void addAt(int idx,int data){
        Node node=new Node(data);
        if(idx<0 || idx>this.size)
        {
            return;
        }
        addNodeAt(node,3);
    }
}
