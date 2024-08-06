class DoublyLinkedList{

    class Node{

        int data;

        Node prev,next;

        Node(int data){

            this.data=data;

        }

    }

    Node head;

    public void insert(int data){

        Node newNode = new Node(data);

        if (head == null){

            head=newNode;

            return;

        }

        Node last = head;

        while (last.next !=null){

            last =last.next;

        }

        last.next=newNode ;

        newNode.prev = last;

    }

    public void display(){

        Node temp=head;

        while (temp != null){

            System.out.print(temp.data + " ");

            temp = temp.next;

        }

        System.out.println();

    }

    public void delete (int data){

        Node temp=head;

        while (temp != null && temp.data != data){

            temp=temp.next;

        }

        if (temp == null) return ;

        if (temp.prev != null) temp.prev.next = temp.next;

        if (temp.next != null) temp.next.prev = temp.prev;

        if (temp==head) head =temp.next;

    }

    public boolean search (int data){

        Node temp= head;

        while (temp != null){

            if (temp.data ==data) return true;

            temp=temp.next;

        }

        return false;

    }

}

public class Main
{

	public static void main(String[] args) {

	DoublyLinkedList dll = new DoublyLinkedList();

	dll.insert(10);

	dll.insert(20);

	dll.insert(22);

	dll.insert(33);

	dll.display();

	dll.delete(20);

	dll.display();

	System.out.println(dll.search(11));

	System.out.println(dll.search(33));

	}

}
