/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.raiyugi.bst;

import java.util.Scanner;

/**
 *
 * @author Raiku
 */
public class BST {
    Node<Student> root;

    public BST() {
        this.root = null;
    }
    
    public boolean insert(Student x){
        if (root == null) root = new Node(x);
        else{
            Node p = root;
            while (p != null){
                if (x.compareTo((Student)p.value) == 0) {
                    return false;
                }
                else if (x.compareTo((Student)p.value) > 0) {
                    if (p.right == null){
                        p.right = new Node(x);
                        return true;
                    }
                    p = p.right;
                }
                else {
                    if (p.left == null){
                        p.left = new Node(x);
                        return true;
                    }
                    p = p.left;
                }
            }
        }
        return true;
    }
    
    public void visit(Node n){
        System.out.println(n.value+" ");
    }
    
    public void preOrder(Node n){
        if (n != null){
            visit(n);
            preOrder(n.left);
            preOrder(n.right);
        }
        
    }
    
    public void inOrder(Node n){
        if (n != null){
            inOrder(n.left);
            visit(n);
            inOrder(n.right);
        } 
    }
    
    public void postOrder(Node n){
        if (n != null){
            postOrder(n.left);
            postOrder(n.right);
            visit(n);
        } 
    }
    
    public Node search(Student x){
        Node p = root;
        while (p != null){
            if (x.compareTo((Student)p.value) == 0)
                return p;
            else if (x.compareTo((Student)p.value) > 0)
                p = p.right;
            else 
                p = p.left;
        }
        return null;
    }
    
    public Node<Student> deleteByCopying(Node<Student> current, Student st){
        if (current == null)
            return current;
        if (st.compareTo(current.value) < 0)
            current.left = deleteByCopying(current.left, st);
        else if (st.compareTo(current.value) > 0)
            current.right = deleteByCopying(current.right, st);
        else {
            if (current.left == null)
                return current.right;
            else if (current.right == null)
                return current.left;
            current.value = minValue(current.right);
            current.right = deleteByCopying(current.right, current.value);
        }
        return current;
    }
 
    Student minValue(Node<Student> current)
    {
        Student s = current.value;
        while (current.left != null) {
            s = current.left.value;
            current = current.left;
        }
        return s;
    }
    
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        BST bst = new BST();
        while(true){
            System.out.println("--------------------------------------");
            System.out.println("Binary Search Tree");
            System.out.println("--------------------------------------");
            System.out.println("1. Insert Student");
            System.out.println("2. Delete Student");
            System.out.println("3. Edit mark");
            System.out.println("4. Print list student folow preOrder");
            System.out.println("5. Print list student folow inOrder");
            System.out.println("6. Print list student folow postOrder");
            int choice = Integer.valueOf(sc.nextLine());
            Student st = new Student();
            Node<Student> n;
            switch(choice){
                case 1:
                    while(true){
                        st = new Student();
                        while(true){
                            try{
                            System.out.println("Enter Student's code: ");
                                st.setCode(sc.nextLine().toUpperCase());
                                break;
                            }catch(Exception e){
                                System.out.println("ERROR: "+e.getMessage());
                            }
                        }
                        while(true){
                            try{
                                System.out.println("Enter Student's name");
                                st.setName(sc.nextLine());
                                break;
                            }catch(Exception e){
                                System.out.println("ERROR: "+e.getMessage());
                            }
                        }
                        while(true){
                            try{
                                System.out.println("Enter Student's mark");
                                st.setMark(Float.valueOf(sc.nextLine()));
                                break;
                            }catch(Exception e){
                                System.out.println("ERROR: "+e.getMessage());
                                break;
                            }
                        }
                        if (bst.insert(st)) System.out.println("Insert successful!!");
                        else System.out.println("Insert fail!! Student exist!!");
                        System.out.println("Continue?(Y/N)");
                        String s = sc.nextLine().toLowerCase();
                        if (s.equals("n") || s.equals("no")) break;
                    }
                    break;
                case 2:
                    while(true){
                        try{
                            System.out.println("Enter Student's code: ");
                            st.setCode(sc.nextLine().toUpperCase());
                            break;
                        }catch(Exception e){
                            System.out.println("ERROR: "+e.getMessage());
                        }
                    }
                    if (bst.search(st) != null) {
                        bst.root = bst.deleteByCopying(bst.root, st);
                        System.out.println("Delete successful!!");
                    }
                    else System.out.println("Delete failed!!Not Found!!!");
                    break;
                case 3:
                    while(true){
                        try{
                            System.out.println("Enter Student's code: ");
                            st.setCode(sc.nextLine().toUpperCase());
                            n = bst.search(st);
                            break;
                        }catch(Exception e){
                            System.out.println("ERROR: "+e.getMessage());
                        }
                    }
                    if (n == null) {
                        System.out.println("Not Found!");
                        break;
                    }
                    while(true){
                        try{
                            System.out.println("Enter new Student's mark");
                            n.value.setMark(Float.valueOf(sc.nextLine()));
                            break;
                        }catch(Exception e){
                            System.out.println("ERROR: "+e.getMessage());
                        }
                    }
                    break;
                case 4:
                    bst.preOrder(bst.root);
                    break;
                case 5:
                    bst.inOrder(bst.root);
                    break;
                case 6:
                    bst.postOrder(bst.root);
                    break;
                default:
                    System.exit(0);
            }
        }
    }
}
