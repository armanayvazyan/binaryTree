package com.company;

public class BinaryTree {

    private Node head;

    public BinaryTree() {
        head = null;
    }

    public void add(int value) {
        recursiveAddition(new Node(value));
    }

    private void recursiveAddition(Node node) {
        Node iterativeNode = head;
        if(head == null) {
            head = node;
            return;
        }
        while(true) {
            if(iterativeNode.value > node.value) {
                if(iterativeNode.left == null) {
                    iterativeNode.left = node;
                    return;
                } else {
                   iterativeNode = iterativeNode.left;
                }
            } else {
                if(iterativeNode.right == null) {
                    iterativeNode.right = node;
                    return;
                } else {
                    iterativeNode = iterativeNode.right;
                }
            }
        }
    }


}
