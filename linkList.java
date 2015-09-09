
//Singly Linked List which MUST be initialised with an object
//for the head to be created properly.

public class linkList{

  private Node head;
  private int size;

  public linkList(Object o){
    head = new Node(o);
    size = 1;
  }

  public void  addToTail(Object o){
    Node end = head;
    Node n = new Node(o);
    while (end.Next() != null){end = end.Next();}
    end.setNext(n);
    n.setNext(null);
    size += 1;

  }

  public void addNode(Object o, int index){
    //adds a Node after the given index, where 0 is the first.
    Node add = new Node(o);
    if (index < 0 || index > size) { return; }
    Node current = head;
    int i = 0;
    while (i != index){
      current = current.Next();
      i++;
    }
    add.setNext(current.Next());
    current.setNext(add);
    size--;
  }

  public void removeNode(int index){
    //where head index = 0;

    if (index < 1 || index > size){ return; }

    Node current = head;
    int count = 0;
    while (count != index - 1 ){ current = current.Next(); count += 1;}


    current.setNext(current.Next().Next());
    size--;

    }

  public Node getHead(){ return head; }

  public String toString(){
      Node n = head;
      StringBuffer l = new StringBuffer();
      String s = "";
      do {
          s = "" + n.getData().toString() + " ";
          l.append(s);
          n = n.Next();
      } while( n != null);
      return  l.toString();
  }
}
