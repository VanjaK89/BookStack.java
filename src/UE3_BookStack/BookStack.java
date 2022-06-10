package UE3_BookStack;

public class BookStack
{
    // *** Membervariablen ***
     private Node top;

    // *** Getter- und Setter-Methoden ***

    public Node getTop() {
        return top;
    }

    public void setTop(Node top) {
        this.top = top;
    }


    // *** Operationen ***

    public void push(String bookTitle)
    {
        Node newNode = new Node(bookTitle);
        newNode.setNext(top);
          top = newNode;

//       if(top == null){
//           top = newNode;
//       }
//       else{
//           newNode.setNext(top);
//           top = newNode;
//
//       }
    }

    public String pop() throws StackEmptyException
    {
       if(top == null){
           throw new StackEmptyException();
       }
       else {
           String returnString = top.getBookTitle();
           top = top.getNext();

           return returnString;
       }
    }

    public int getCount()
    {
       
        return 0;
    }
}
