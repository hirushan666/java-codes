package test5;
public class LinkedList {
    Node head; // The starting point of the list

    // Node Blueprint
    static class Node {
        int data;
        Node next;

        Node(int d) {
            data = d;
            next = null;
        }
    }

    // 1. Insert at the end
    public void insert(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
        } else {
            Node last = head;
            while (last.next != null) {
                last = last.next;
            }
            last.next = newNode;
        }
    }

    // 2. Delete a node by value
    public void delete(int key) {
        Node temp = head, prev = null;

        // If head node itself holds the key
        if (temp != null && temp.data == key) {
            head = temp.next;
            return;
        }

        // Search for the key to be deleted
        while (temp != null && temp.data != key) {
            prev = temp;
            temp = temp.next;
        }

        // If key was not present
        if (temp == null) return;

        // Unlink the node from linked list
        prev.next = temp.next;
    }

    // 3. Print the list
    public void display() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        LinkedList list = new LinkedList();

        list.insert(10);
        list.insert(20);
        list.insert(30);

        System.out.print("Current List: ");
        list.display();

        list.delete(20);
        System.out.print("After Deleting 20: ");
        list.display();
    }
}