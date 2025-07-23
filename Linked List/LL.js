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
