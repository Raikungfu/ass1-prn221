/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.raiyugi.bst;

/**
 *
 * @author Raiku
 */
public class Node <T>{
    T value;
    Node<T> left, right;

    public Node(T value) {
        this.value = value;
        left = right = null;
    }
}
