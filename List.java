package sample;

public class List {

    static Node root = null;

    static void createCircle(int N) {

        root = new Node(1);
        Node current = root;
        for (int i = 2; i < N+1; i++) {

            Node temp = new Node(i);
            current.next = temp;
            temp.previous = current;
            current = current.next;
        }
        current.next = root;
        root.previous = current;
    }

    static void deleteEveryK(int K){
        Node current = root;
        int check = 1;
        while(current.next != current){
            if(check == K){
                current.previous.next = current.next;
                current.next.previous = current.previous;
                check = 1;
            }else {
                check++;
            }
            current = current.next;
        }
        System.out.println("Last " + current.position);
    }

    static class Node {

        int position;
        Node next;
        Node previous;

        Node(int position) {
            this.position = position;
            next = null;
            previous = null;
        }
    }
}
