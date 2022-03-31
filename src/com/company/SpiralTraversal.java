package com.company;

import java.util.*;

public class SpiralTraversal {
    static Scanner sc=null;
    public static  void  main(String [] args)
    {
        sc=new Scanner(System.in);
        Node root=createTree();
        Spiral g= new Spiral();
        List<List<Integer>> ar= g.findSpiral(root);
        for(List<Integer> value: ar)
            System.out.print(value +" ");

    }
    static  Node createTree(){
        Node root = null;
        System.out.println("enter the data");
        int data= sc.nextInt();
        if(data== -1)
            return null;
        root= new Node(data);
        System.out.println("enter left for ="+ data);
        root.left=createTree();
        System.out.println("enter right for ="+ data);
        root.right=createTree();
        return root;
    }
}
class Node{

    Node left;
    Node right;
    int data;

    public Node(int data) {
        this.data=data;
        left=null;
        right= null;
    }
}
class Spiral
{
    static List<List<Integer>> findSpiral(Node root){
        Queue<Node> queue = new LinkedList<>();
        List<List<Integer>> l=new LinkedList<>();
        if(root==null)
            return null;
        queue.offer( root);
        boolean flag= true;
        while (!queue.isEmpty()){
            int levelNum=queue.size();
            List<Integer> sl= new ArrayList<>(levelNum);
            for (int i = 0; i < levelNum; i++) {
                int index=i;
                if(queue.peek().left !=null)
                       queue.offer(queue.peek().left);
                if(queue.peek().right !=null)
                    queue.offer(queue.peek().right);
                if(flag == true)
                {
                    sl.add(queue.poll().data);
                }
                else
                {
                    sl.add(0,queue.poll().data);
                }
                flag = !flag;
                l.add(sl);
            }
        }
        return l;
    }
}


