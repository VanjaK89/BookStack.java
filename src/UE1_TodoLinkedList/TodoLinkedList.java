package UE1_TodoLinkedList;

public class TodoLinkedList {
    // *** Membervariablen ***
    private Node first;
    private Node last;

    // *** Get-Methoden (Set-Methoden nicht notwendig) ***

    public Node getFirst() {
        return first;
    }

    public Node getLast() {
        return last;
    }

    // *** Operationen ***

    public void appendTodoText(String todoText) {
        Node newNode = new Node();
        newNode.setTodoText(todoText);

        Node currentNode = first;
        currentNode = currentNode.getNext();

        currentNode.setNext(newNode);
        newNode.setNext(last);


    }


    public void deleteLastTodoText() {
        // TODO: Implementierung vervollständigen
    }

    public String getTodoTextAtIndex(int index) {
        // TODO: Implementierung vervollständigen
        return null;
    }
}
