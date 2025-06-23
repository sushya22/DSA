package LinkedList;
import java.util.Scanner;
import java.util.ArrayList;
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

    public Node deleteKey(Node head,int k)
    {
        Node temp = head;
        while(temp!=null)
        {
            if(temp.data == k)
            {
                if(temp==head)
                {
                    head = head.next;
                }
                Node prevNode = temp.prev;
                Node nextNode = temp.next;
                if(prevNode!=null) prevNode.next = nextNode;
                if(nextNode!=null) nextNode.prev = prevNode;
                temp = temp.next;
            }
            else
            {
                temp=temp.next;
            }
        }
        return head;
    }

    public void printSumPairs(Node head, int k)
    {
        Node temp1 = head;
        Node temp2;
        ArrayList<ArrayList<Integer>> result = new ArrayList<ArrayList<Integer>>();
        while(temp1!=null)
        {
           temp2 = temp1.next;
           while(temp2!=null)
           {
            if(temp1.data+temp2.data==k)
            {
                ArrayList<Integer> temp = new ArrayList<>();
                temp.add(temp1.data);
                temp.add(temp2.data);
                result.add(temp);
            }
            if(temp1.data+temp2.data>k)
            {
                break;
            }
            temp2 = temp2.next;
           }
           temp1 = temp1.next;
        }

        for(ArrayList<Integer> arr:result)
        {
            for(Integer i:arr)
            {
                System.out.print(i+" ");
            }
            System.out.println();
        }
    }

    public Node findTailNode(Node head)
    {
        Node temp = head;
        if(temp==null)
        {
            return temp;
        }
        while(temp.next!=null)
        {
            temp = temp.next;
        }
        return temp;
        
    }

    public void printSumPairsOpt(Node head,int k)
    {
        ArrayList<ArrayList<Integer>> result = new ArrayList<ArrayList<Integer>>();
        Node right = findTailNode(head);
        Node left = head;
        while(left.data<right.data)
        {
            if(left.data+right.data==k)
            {
                ArrayList<Integer> arr = new ArrayList<>();
                arr.add(left.data);
                arr.add(right.data);
                result.add(arr);
                left = left.next;
                right = right.prev;
            }
            else if(left.data+right.data<k)
            {
                left = left.next;
            }
            else
            {
                right = right.prev;
            }
        }

        for(ArrayList<Integer> ar:result)
        {
            for(Integer i:ar)
            {
                System.out.print(i+" ");
            }
            System.out.println();
        }
    }

    public Node removeDuplicates(Node head)
    {
        Node temp = head;
        Node nextNode = head;
        while(nextNode!=null)
        {
            nextNode = nextNode.next;
            while(nextNode!=null && temp.data==nextNode.data )
            {
                nextNode = nextNode.next;
            }

            temp.next = nextNode;
            if(nextNode!=null) nextNode.prev = temp;
            temp = nextNode;
        }
        return head;
    }
    public static void main(String[] args)
    {
        int[] arr = new int[]{2};
        DoublyLinkedList d = new DoublyLinkedList();
        d.arrayToDLinkedList(arr);
        Scanner sc = new Scanner(System.in);
        // d.insertBeforeNode(d.head.next.next);
        // d.reverseDLL();
        // d.findMiddleOpt();
        // d.printDDL();
        // int n = sc.nextInt();
        // d.head = d.deleteKey(d.head, 2);
        // d.printSumPairsOpt(d.head,n);
        d.head = d.removeDuplicates(d.head);
        d.printDDL();
    }
}
