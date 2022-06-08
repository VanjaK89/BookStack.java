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
        //Fall1: lista je prazna
        if(first == null){
            first = newNode;
            last  = newNode;
        }
        // Fall2: ako ima jedan ili vise elemenata
        else
        {
            last.setNext(newNode); // connection between nodes
            last = newNode;        //and then we claim it as a new node
        }

    }

    public void deleteLastTodoText() {
        //Fall1: Liste ist leer
        if(first == null){
            return;
        }
        //Fall2: Ein Element
        else if(first == last){
            first = null;
            last = null;
        }
        else
        {
              Node prevNode = first;
             //bis zum vorletzten Knoten weiter hupfen
              while(prevNode.getNext() != last)
                  prevNode = prevNode.getNext();

                  prevNode.setNext(null);
                  last = prevNode;

        }

    }

    public String getTodoTextAtIndex(int index) {
        // TODO: Implementierung vervollständigen
        return null;
    }
}
