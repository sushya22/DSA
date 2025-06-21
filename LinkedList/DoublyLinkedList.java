package LinkedList;
import java.util.Scanner;
class Node{
    int data;
    Node next;
    Node prev;

    Node(int data)
    {
        this.data = data;
        this.next = null;
        this.prev = null;
    }
}

public class DoublyLinkedList {
    Node head = null;

    public void arrayToDLinkedList(int[] arr)
    {
         this.head = new Node(arr[0]);
         Node temp = head;
         for(int i=1;i<arr.length;i++)
         {
            Node newNode = new Node(arr[i]);
            newNode.prev = temp;
            newNode.prev.next = newNode;
            temp = newNode;
         }
         

    }

    public void printDDL()
    {
        Node temp = this.head;
        while(temp!=null)
        {
            System.out.println(temp.data);
            temp = temp.next;
        }
    }

    public void deleteHead()
    {
        if(this.head == null || this.head.next == null)
        {
            this.head = null;
            return;
        }
        this.head = this.head.next;
        this.head.prev = null;   
        
    }

    public void deleteTail()
    {
        if(this.head == null || this.head.next==null)
        {
            this.head = null;
            return;
        }

        Node temp = this.head;
        while(temp.next!=null)
        {
            temp = temp.next;
        }
        temp.prev.next = null;
        temp.prev = null;
    }

    public void deleteKthElement(int k)
    {
        if(this.head==null)
        {
            return;
        }
        Node temp = this.head;
        int count = 0;
        while(temp!=null)
        {
            count++;
            if(count==k)
            {
                break;
            }
            temp = temp.next;
        }
        
        if(temp.prev == null && temp.next==null)
        {
            this.head = null;
            return;
        }
        if(temp.prev==null)
        {
            temp.next.prev = null;
            this.head = temp.next;
            temp.next = null;
            return;
        }
        if(temp.next==null)
        {
            temp.prev.next = null;
            temp.prev = null;
            return;
        }
        else
        {
            temp.prev.next = temp.next;
            temp.next.prev = temp.prev;
            temp.next = null;
            temp.prev = null;
        }

    }
    public void deleteNode(Node node)
    {
        if(node.next==null)
        {
            node.prev.next = null;
            node.prev = null;
            return;
        }
        node.prev.next = node.next;
        node.next.prev = node.prev;
        node.prev = null;
        node.next = null;
        return;
    }

    public void insertBeforeHead()
    {
        int n = 100;
        Node newNode = new Node(n);
        if(this.head==null)
        {
            this.head = newNode;
            return;
        }
        newNode.next = this.head;
        this.head.prev = newNode;
        this.head = newNode;
        return;
    }
    
    public void insertBeforeTail()
    {
        Node newNode = new Node(100);
        if(this.head==null)
        {
            this.head = newNode;
            return;
        }
        
        if(this.head.next == null)
        {
            newNode.next = this.head;
            this.head.prev = newNode;
            return;
        }

        Node temp = this.head;
        while(temp.next!=null)
        {
            temp = temp.next;
        }
         
        temp.prev.next = newNode;
        newNode.prev = temp.prev;
        newNode.next = temp;
        temp.prev = newNode;
        return;
    }

    public void insertBeforeKthElement(int k)
    {   
        Node newNode = new Node(2000);
        if(k==1)
        {           
            newNode.next = this.head;
            this.head.prev = newNode;
            this.head = newNode;
        }
        Node temp = this.head;
        int count = 0;
        while(temp!=null)
        {
            count++;
            if(count==k)
            {
                break;
            }
            temp = temp.next;
        }

        newNode.next = temp;
        newNode.prev = temp.prev;
        newNode.prev.next = newNode;
        temp.prev = newNode;

    }
     
    public void insertBeforeNode(Node node)
    {
        Node newNode = new  Node(3000);
        newNode.next = node;
        newNode.prev = node.prev;
        newNode.prev.next = newNode;
        node.prev = newNode;
    }

    public void reverseDLL()
    {
        if(this.head == null || this.head.next==null)
        {
            return;
        }

        Node temp = this.head;
        Node lastNode = this.head;
        while(temp!=null)
        {
            Node front = temp.next;
            temp.next = temp.prev;
            temp.prev = front;
            lastNode = temp;
            temp=temp.prev;
        }
        this.head = lastNode;
    }

    public void findMiddleElement()
    {
        if(this.head==null)
        {
            return;
        }
        if(this.head.next==null)
        {
            System.out.println(this.head.data);;
        }

        Node temp = this.head;
        int count = 0;
        while(temp!=null)
        {
            count++;
            temp=temp.next;
        }

        int middle = (count/2)+1;
        temp = this.head;
        while(temp!=null)
        {
            middle-=1;
            if(middle==0)
            {
                break;
            }
            temp=temp.next;
        }
        System.out.println(temp.data);
    }
    
    public void findMiddleOpt()
    {
        if(this.head==null)
        {
            return;
        }
        if(this.head.next==null)
        {
            System.out.println(this.head.data);
            return;
        }

        Node slow = this.head;
        Node fast = this.head;
        while(fast!=null && fast.next!=null)
        {
            slow = slow.next;
            fast = fast.next.next;

        }

        System.out.println(slow.data);
    }
    public static void main(String[] args)
    {
        int[] arr = new int[]{1,2};
        DoublyLinkedList d = new DoublyLinkedList();
        d.arrayToDLinkedList(arr);
        Scanner sc = new Scanner(System.in);
        // d.insertBeforeNode(d.head.next.next);
        // d.reverseDLL();
        d.findMiddleOpt();
        // d.printDDL();
    }
}
