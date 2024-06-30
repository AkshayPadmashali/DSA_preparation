class Solution
{
    //Function to insert a node at the beginning of the linked list.
    Node insertAtBeginning(Node head, int x)
    {
        Node node = new Node(x);
        node.next = head;
        head = node;
        
        return head;
    }
    
    //Function to insert a node at the end of the linked list.
    Node insertAtEnd(Node head, int x)
    {
    
       if(head == null){
        return insertAtBeginning(null, x);
       }
       
       Node node = new Node(x);
       
       Node temp = head;
       while(temp.next != null){
           temp = temp.next;
       }
       temp.next = node;
       node.next = null;
       
       return head;
    }
}