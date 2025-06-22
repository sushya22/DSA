package LinkedList;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;
import java.util.Stack;

class Node{
    int data;
    Node next;
    Node(int i)
    {
       data = i;
       next = null;
    }
}
public class LinkedList {
    Node head;

    public Node convertArrayLL(int[] arr)
    {
        if(arr.length==0)
        {
            return null;
        }

        Node head = new Node(arr[0]);
        Node temp = head;
        for(int i=1;i<arr.length;i++)
        {
            Node newNode = new Node(arr[i]);
            temp.next = newNode;
            temp = newNode;
        }
        return head;
    }

    public void printLL(Node head)
    {
        Node temp = head;
        while(temp!=null)
        {
            System.out.println(temp.data);
            temp = temp.next;
        }
    }

    public Node insertAtHead(Node head,int n)
    {
        Node temp = new Node(n);
        if(head == null)
        {
            head = temp;
            return head;
        }
        temp.next = head;
        head = temp;
        return head;
    }

    public Node deleteTail(Node head)
    {
        if(head == null)
        {
            return null;
        }
        if(head.next == null)
        {
            return null;
        }
        Node temp = head;
        while(temp.next.next!=null)
        {
            temp = temp.next;
        }
        temp.next = null;
        return head;
    }

    public int findLength(Node head)
    {
        int count = 0;
        Node temp = head;
        while(temp!=null)
        {
            count++;
            temp = temp.next;

        }
        return count;
    }

    public int findLength(Node head,int count)
    {
        if(head==null)
        {
            return count;
        }
        count+=1;
        return findLength(head.next,count);
    }

    public void LLTraversal(Node head)
    {
        if(head==null)
        {
            return;
        }
        System.out.println(head.data);
        LLTraversal(head.next);
    }

    public void searchLL(Node head,int n)
    {
        Node temp = head;
        while(temp!=null)
        {
            if(temp.data==n)
            {
                System.out.println("Found");
                System.exit(0);
            }
            temp = temp.next;
        }
        System.out.println("Not Found");
        
    }

    public void reverseLL()
    {
        Stack<Integer> s = new Stack<>();
        Node temp = this.head;
        while(temp!=null)
        {
            s.push(temp.data);
            temp = temp.next;
        }
        temp = this.head;
        while(temp!=null)
        {
            temp.data = s.pop();
            temp=temp.next;
        }
    }

    public void reverseLLPointers()
    {
        if(this.head==null || this.head.next==null)
        {
            return;
        }
        Node prev = null;
        Node temp = this.head;
        while(temp!=null)
        {
            Node next = temp.next;
            temp.next = prev;
            prev = temp;
            temp = next;
        }
        this.head = prev;

    }

    public Node reverseLLRecursion(Node head)
    {
        if(head == null || head.next==null)
        {
            return head;
        }

        Node newHead = reverseLLRecursion(head.next);
        Node front = head.next;
        front.next = head;
        head.next = null;
        return newHead;
    }

    public boolean FindLoop(Node node)
    { 
        HashMap<Node,Integer> result = new HashMap<>();
        if(node==null)
        {
            return false;
        }
        Node temp = node;
        while(temp!=null)
        {
            if(result.containsKey(temp))
            {
                return true;
            }
            result.put(temp,1);
            temp = temp.next;
        }
        return false;

    }

    public boolean detectLoop(Node node)
    {
        Node slow = node;
        Node fast = node;
        
        while(fast!=null && fast.next!=null)
        {
            slow = slow.next;
            fast = fast.next.next;
            if(slow==fast)
            {
                return true;
            }
        }
        return false;
    }

    public Node findStartingpoint(Node head)
    {
        HashMap<Node,Integer> result = new HashMap<>();
        if(head==null || head.next==null)
        {
           return null;
        }

        Node temp = head;
        while(temp!=null)
        {
            if(result.containsKey(temp))
            {
                return temp;
            }
            result.put(temp,1);
            temp = temp.next;
        }

        return null;

    }

    public Node findStartOpt(Node node)
    {
        if(node==null || node.next == null)
        {
            return null;
        }
        Node slow = node;
        Node fast = node;
        while(fast!=null && fast.next!=null)
        {
            slow = slow.next;
            fast = fast.next.next;

            if(slow==fast)
            {
               slow = node;
               while(slow!=fast)
               {
                slow = slow.next;
                fast = fast.next;

               }
               return slow;
            }

        }
        return null;
    }

    public void findLoopLength(Node head)
    {
       if(head==null || head.next==null)
       {
         System.out.println(0);
       }
       HashMap<Node,Integer> result = new HashMap<>();
       int count = 0;
       Node temp = head;
       while(temp!=null)
       {
        if(result.containsKey(temp))
        {
            System.out.println(count-result.get(temp));
            break;
        }
        result.put(temp,count);
        count++;
        temp = temp.next;
       }
    }

    public void findLoopLengthPointers(Node head)
    {
        if(head == null || head.next == null)
        {
            return;
        }

        Node slow = head;
        Node fast = head;
        while(fast!=null && fast.next!=null)
        {
            slow = slow.next;
            fast = fast.next.next;
            if(slow==fast)
            {
                int count = 1;
                fast = fast.next;
                while(slow!=fast)
                {
                    count++;
                    fast=fast.next;
                }
                System.out.println(count);
                break;
            }
        }
    }
    
    public Node reverseLLPalindrome(Node head)
    {
        if(head==null || head.next==null)
        {
            return head;
        }
        Node newHead = reverseLLPalindrome(head.next);
        Node front = head.next;
        front.next = head;
        head.next = null;
        return newHead;
    }
    public boolean checkPalindromeOpt(Node node)
    {
        if(node==null || node.next==null)
        {
           return true;
        }
        Node first = node;
        Node slow = node;
        Node fast = node;
        while(fast.next!=null && fast.next.next!=null)
        {
            slow = slow.next;
            fast = fast.next.next;
        }
        
        Node newHead = reverseLLPalindrome(slow.next);
        Node temp = newHead;
        while(temp!=null)
        {
           if(temp.data!=first.data)
           {
              reverseLLPalindrome(newHead);
              return false;
           }
           temp = temp.next;
           first = first.next;
        }
        reverseLLPalindrome(newHead);
        return true;

    }

    public boolean checkPalindromeBrute(Node head)
    {
         if(head==null || head.next==null)
         {
            return true;
         }
         Stack<Integer> s = new Stack<>();
         Node temp = head;
         while(temp!=null)
         {
            s.push(temp.data);
            temp = temp.next;
         }

         temp = head;
         while(temp!=null)
         {
            if(temp.data!=s.pop())
            {
                return false;
            }
            temp = temp.next;
         }
         return true;
    }

    public Node oddEvenLL(Node node)
    {
        if(node==null || node.next==null)
        {
            return node;
        }

        ArrayList<Integer> result = new ArrayList<>();
        Node odd = node;
        while(odd!=null && odd.next!=null)
        {
            result.add(odd.data);
            odd = odd.next.next;
        }
        if(odd!=null)
        {
           result.add(odd.data);
        }
        Node even = node.next;
        while(even!=null && even.next!=null)
        {
           result.add(even.data);
           even = even.next.next;
        }
        if(even!=null)
        {
            result.add(even.data);
        }
        Node temp = node;
        int i = 0;
        while(temp!=null)
        {
            temp.data = (result.get(i));
            i++;
            temp = temp.next;
        }
        return node;
    }

    public Node oddEvenLLOpt(Node head)
    {
        if(head==null || head.next==null)
        {
            return head;
        }

        Node odd = head;
        Node even = head.next;
        Node evenHead = even;
        while(even!=null && even.next!=null)
        {
             odd.next = odd.next.next;
             odd = odd.next;
             even.next = even.next.next;
             even=even.next;
        }
        odd.next = evenHead;
        return head;
    }

    public Node removeKthElementBack(Node head,int k)
    {
       if(head==null)
       {
         return null;
       }
       int count = 0;
       Node temp = head;
       while(temp!=null)
       {
        count++;
        temp=temp.next;
       }
       if(count==k)
       {
         head = head.next;
         return head;
       }
       int res = count - k;
       temp = head;
       while(temp!=null)
       {
        res--;
        if(res==0)
        {
            break;
        }
        temp = temp.next;
       }
       Node deleteNode = temp.next;
       temp.next = temp.next.next;
       deleteNode.next = null;
       return head;
    }

    public Node removeKthElementOpt(Node head,int k)
    {
        if(head==null)
        {
            return null;
        }
        Node fast = head;
        Node slow = head;
        for(int i=0;i<k;i++)
        {
            fast = fast.next;
        }
        if(fast==null)
        {
            head = head.next;
            return head;
        }
        while(fast.next!=null)
        {
            fast = fast.next;
            slow = slow.next;
        }
        Node deleteNod = slow.next;
        slow.next = slow.next.next;
        deleteNod.next = null;
        return head;
    }

    public Node deleteMiddleNodeBrute(Node head)
    {
        if(head==null || head.next==null)
        {
            return null;
        }

        int count = 0;
        Node temp = head;
        while(temp!=null)
        {
            count++;
            temp = temp.next;
        }
        int mid = count/2;
        temp = head;
        while(temp!=null)
        {
            mid--;
            if(mid==0)
            {
                break;
            }
            temp = temp.next;
        }

        Node deleteNode = temp.next;
        temp.next = temp.next.next;
        deleteNode.next = null;
        return head;
    }

    public Node deleteMiddleNode(Node head)
    {
        if(head==null || head.next==null)
        {
            return null;
        }

        Node slow = head;
        Node fast = head;
        fast = fast.next.next;
        while(fast!=null && fast.next!=null)
        {
            fast = fast.next.next;
            slow = slow.next;
        }

        Node deleteNode = slow.next;
        slow.next = slow.next.next;
        deleteNode.next = null;
        return head;
    }

    public void mergeArray(ArrayList<Integer> arr,int left,int mid,int right)
    {
        int i = left;
        int j = mid+1;
        ArrayList<Integer> result = new ArrayList<>();
        while(i<=mid && j<=right)
        {
            if(arr.get(i)<=arr.get(j))
            {
                result.add(arr.get(i));
                i++;
            }
            else
            {
                result.add(arr.get(j));
                j++;
            }
        }

        while(i<=mid)
        {
            result.add(arr.get(i));
            i++; 
        }
        while(j<=right)
        {
            result.add(arr.get(j));
            j++;
        }
        i = 0;
        for(;i<result.size();i++)
        {
            arr.set(left+i,result.get(i));
        }
    }

    public void sortArray(ArrayList<Integer> arr,int left,int right)
    {
        if(left<right)
        {
            int mid = (left+right)/2;
            sortArray(arr, left, mid);
            sortArray(arr, mid+1, right);
            mergeArray(arr,left,mid,right);
        }
    }
    public Node sortLL(Node head)
    {
        if(head==null || head.next==null)
        {
            return head;
        }
        ArrayList<Integer> arr = new ArrayList<>();
        Node temp = head;
        while(temp!=null)
        {
            arr.add(temp.data);
            temp = temp.next;
        }
        sortArray(arr,0,arr.size()-1);
        temp = head;
        int i =0;
        while(temp!=null)
        {
            temp.data = arr.get(i);
            temp = temp.next;
            i++;
        }
        return head;
    }
    public Node findMiddle(Node head)
    {
        if(head==null||head.next==null)
        {
            return head;
        }
        Node slow = head;
        Node fast = head;
        while(fast.next!=null && fast.next.next!=null)
        {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    public Node mergeLL(Node left,Node right)
    {   
        Node dummyNode = new Node(-1);
        Node temp = dummyNode;
        while(left!=null && right!=null)
        {
            if(left.data<=right.data)
            {
                temp.next = left;
                left = left.next;
            }
            else
            {
                temp.next = right;
                right = right.next;
            }
            temp = temp.next;
        }

        while(left!=null)
        {
            temp.next = left;
            left = null;
        }
        while(right!=null)
        {
            temp.next = right;
            right = null;
        }
        return dummyNode.next;
    }
    public Node sortLLOpt(Node head)
    {
        if(head==null || head.next==null)
        {
            return head;
        }
        Node middleNode = findMiddle(head);
        Node leftHead = head;
        Node rightHead = middleNode.next;
        middleNode.next = null;
        leftHead = sortLLOpt(leftHead);
        rightHead = sortLLOpt(rightHead);
        // System.out.println("sushsnat");
        return mergeLL(leftHead,rightHead);
    }

    public Node sortZeroOnesTwos(Node head)
    {
        if(head==null || head.next==null)
        {
            return head;
        }

        int count0 = 0;
        int count1 = 0;
        int count2 = 0;
        Node temp = head;
        while(temp!=null)
        {
            if(temp.data==0) count0++;
            else if(temp.data==1) count1++;
            else count2++;
            temp=temp.next;
        }

        temp = head;
        while(temp!=null)
        {
            if(count0!=0)
            {
                temp.data=0;
                count0--;
            }
            else if(count1!=0)
            {
                temp.data = 1;
                count1--;
            }
            else
            {
                temp.data = 2;
                count2--;
            }
            temp=temp.next;
        }
        return head;
    }

    public Node sortOnesTwosOpt(Node head)
    {
        if(head==null || head.next==null)
        {
            return head;
        }
        Node zeroHead = new Node(-1);
        Node zero = zeroHead;
        Node oneHead = new Node(-1);
        Node one = oneHead;
        Node twoHead = new Node(-1);
        Node two = twoHead;
        Node temp = head;
        while(temp!=null)
        {
            if(temp.data==0)
            {
               zero.next = temp;
               zero = zero.next;
            }
            else if(temp.data==1)
            {
               one.next = temp;
               one = one.next;
            }
            else if(temp.data==2)
            {
               two.next = temp;
               two = two.next;
            }
            temp = temp.next;
        }

        zero.next = oneHead.next != null ? oneHead.next : twoHead.next;
        one.next = twoHead.next;
        two.next = null;
        return zeroHead.next;
    }

    public Node findIntersection(Node head1,Node head2)
    {
        if(head1==null||head2==null)
        {
            return null;
        }
        HashMap<Node,Integer> result = new HashMap<>();
        Node temp = head1;
        while(temp!=null)
        {
            result.put(temp,1);
            temp = temp.next;
        }
        temp = head2;
        while(temp!=null)
        {
            if(result.containsKey(temp))
            {
                return temp;
            }
            temp = temp.next;
        }
        return  null;
    }
    
    public Node findCollision(Node large,Node shorter,int d)
    {
        for(int i=0;i<d;i++)
        {
            large = large.next;
        }
        while(large!=null)
        {
            if(shorter==large)
            {
                return large;
            }
            shorter = shorter.next;
            large = large.next;
        }
        return null;
    }
    public Node findInteresectNodeBetter(Node head1,Node head2)
    {
        if(head1==null || head2==null)
        {
            return null;
        }

        int count1 = 0;
        int count2 = 0;
        Node temp1 = head1;
        Node temp2 = head2;
        while(temp1!=null)
        {
            count1++;
            temp1 = temp1.next;
        }
        while(temp2!=null)
        {
            count2++;
            temp2 = temp2.next;
        }

        if(count1>count2)
        {
            return findCollision(head1,head2,count1-count2);
        }
        return findCollision(head2,head1,count2-count1);
    }

    public Node findIntersectionNodeOpt(Node head1,Node head2)
    {
        if(head1==null || head2==null)
        {
            return head1;
        }
        Node temp1 = head1;
        Node temp2 = head2;
        while(temp1!=temp2)
        {
            
            temp1 = temp1.next;
            temp2 = temp2.next;
            if(temp1==temp2)
            {
                return temp1;
            }
            if(temp1==null)
            {
                temp1 = head2;
            }
            if(temp2==null)
            {
                temp2 = head1;
            }

        }
        return null;
    }
    public static void main(String[] args)
    {
        int[] arr = new int[]{4,5,6,7};
        int[] arr1 = new int[]{1,3};
        LinkedList l = new LinkedList();
        LinkedList l1 = new LinkedList();
        l.head = l.convertArrayLL(arr);
        l1.head = l1.convertArrayLL(arr1);
        l1.head.next.next = l.head.next.next;
        // l.head = l.sortLLOpt(l.head);
        // l.head = l.sortOnesTwosOpt(l.head);
        System.out.println(l.findIntersectionNodeOpt(l.head,l1.head));
        // l.printLL(l.head);
        // l.head = l.deleteMiddleNode(l.head);
        // l.head = l.convertArrayLL(arr);
        // l.head = l.oddEvenLLOpt(l.head);
        // int k;
        // Scanner sc = new Scanner(System.in);
        // k = sc.nextInt();
        // l.head = l.removeKthElementOpt(l.head,k);
       
        // Node n1 = new Node(0);
        // Node n2 = new Node(1);
        // Node n3 = new Node(2);
        // Node n4 = new Node(3);
        // Node n5 = new Node(4);
        // Node n6 = new Node(2);
        // l.head = n1;
        // n1.next = n2;
        // n2.next = n3;
        // n3.next = n4;
        // n4.next = n5;
        // n5.next = n6;
        // n6.next = n5;

        // int n;
        // Scanner sc = new Scanner(System.in);
        // n = sc.nextInt();
        // l.head = l.insertAtHead(l.head,n);
        // l.head = l.deleteTail(l.head);
        // l.LLTraversal(l.head);
        // int s = sc.nextInt();    
        // System.out.println("length: "+l.findLength(l.head,0));
        // l.searchLL(l.head,s);
        // l.reverseLLPointers();
        // l.head = l.reverseLLRecursion(l.head);
        // System.out.println();
        // l.findLoopLengthPointers(l.head);
        // l.printLL(l.head);
        // System.out.println(l.checkPalindromeOpt(l.head));
        // l.printLL(l.head);
    }
}
