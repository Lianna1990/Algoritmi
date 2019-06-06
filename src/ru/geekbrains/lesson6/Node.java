package ru.geekbrains.lesson6;
//
public class Node {
    public Cat cat;
    public Node leftChild;
    public Node rightChild;

    public void display() {
        System.out.println ("Name: " +cat.name+", age: "+cat.age);
    }

   /*public Node getSuccessor(Node node) {
        Node successorParent = node;
        Node successor = node;
        Node currant = node.rightChild;

        while (currant != null) {
            successorParent = successor;
            successor = currant;
            currant = currant.leftChild;
        }

        if (successor != node.rightChild) {
            successorParent.leftChild = successor.rightChild;
            successor.rightChild = node.rightChild;
        }

        return successor;
    }*/
}



