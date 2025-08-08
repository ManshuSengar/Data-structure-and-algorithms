/**
 * Definition for singly-linked list.
 * function ListNode(val, next) {
 *     this.val = (val===undefined ? 0 : val)
 *     this.next = (next===undefined ? null : next)
 * }
 */
/**
 * @param {ListNode} head
 * @param {number} k
 * @return {ListNode}
 */
var rotateRight = function(head, k) {
    if(!head) return head;
    let curr=head;
    let size=0;
   while(curr){
    curr=curr.next;
    size++;
   }
   k=k%size;
   let kElement=head;
   for(let i=0;i<size-k;i++){
     kElement=kElement.next;
   }
   console.log("kElement",kElement);
   let move=kElement.next;
   kElement.next=null;
   move.next=head;
};


class ListNode {
    val: number;
    next: ListNode | null;
    
    constructor(val: number, next: ListNode | null = null) {
        this.val = val;
        this.next = next;
    }
}

class MyLinkedList {
    private head: ListNode | null;
    private size: number;

    constructor() {
        this.head = null;
        this.size = 0;
    }

    get(index: number): number {
        if (index < 0 || index >= this.size || this.head === null) {
            return -1;
        }
        
        let current: ListNode = this.head;
        for (let i = 0; i < index; i++) {
            if (current.next === null) return -1;
            current = current.next;
        }
        
        return current.val;
    }

    addAtHead(val: number): void {
        const newNode = new ListNode(val);
        newNode.next = this.head;
        this.head = newNode;
        this.size++;
    }

    addAtTail(val: number): void {
        const newNode = new ListNode(val);
        
        if (this.head === null) {
            this.head = newNode;
        } else {
            let current = this.head;
            while (current.next !== null) {
                current = current.next;
            }
            current.next = newNode;
        }
        
        this.size++;
    }

    addAtIndex(index: number, val: number): void {
        if (index < 0 || index > this.size) {
            return;
        }
        
        if (index === 0) {
            this.addAtHead(val);
            return;
        }
        
        if (index === this.size) {
            this.addAtTail(val);
            return;
        }
        
        const newNode = new ListNode(val);
        let current = this.head;
        
        for (let i = 0; i < index - 1; i++) {
            if (current === null) return;
            current = current.next;
        }
        
        if (current === null) return;
        
        newNode.next = current.next;
        current.next = newNode;
        this.size++;
    }

    deleteAtIndex(index: number): void {
        if (index < 0 || index >= this.size || this.head === null) {
            return;
        }
        
        if (index === 0) {
            this.head = this.head.next;
            this.size--;
            return;
        }
        
        let current = this.head;
        for (let i = 0; i < index - 1; i++) {
            if (current.next === null) return;
            current = current.next;
        }
        
        if (current.next === null) return;
        
        current.next = current.next.next;
        this.size--;
    }
}

/**
 * Your MyLinkedList object will be instantiated and called as such:
 * var obj = new MyLinkedList()
 * var param_1 = obj.get(index)
 * obj.addAtHead(val)
 * obj.addAtTail(val)
 * obj.addAtIndex(index,val)
 * obj.deleteAtIndex(index)
 */
