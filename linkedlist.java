/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cat2;

/**
 *
 * @author adityamore
 */
public class LinkedList {

    // Node class represents each element in the list
    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    Node head;

    // Constructor to create an empty LinkedList
    public LinkedList() {
        head = null;
    }

    // Method to insert a node at the beginning
    public void insertAtBeginning(int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }

    // Method to insert a node at the end
    public void insertAtEnd(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }

        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newNode;
    }

    // Method to delete a node from the beginning
    public void deleteFromBeginning() {
        if (head == null) {
            System.out.println("List is empty.");
            return;
        }

        head = head.next;
    }

    // Method to print the linked list
    public void printList() {
        if (head == null) {
            System.out.println("List is empty.");
            return;
        }

        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        LinkedList list = new LinkedList();

        // Inserting nodes at the beginning
        list.insertAtBeginning(10);
        list.insertAtBeginning(20);
        list.insertAtBeginning(30);

        System.out.println("Linked List after inserting node at the beginning:");
        list.printList();
        System.out.println();

        // Inserting node at the end
        list.insertAtEnd(40);
        list.insertAtEnd(50);

        System.out.println("Linked List after inserting node at the end:");
        list.printList();
        System.out.println();

        // Deleting node from the beginning
        list.deleteFromBeginning();

        System.out.println("Linked List after deleting a node from the beginning:");
        list.printList();
    }
}