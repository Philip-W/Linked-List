
public class linkList{

  private Node head;
  private int size;

  public linkList(){
    head = new Node(null);
    size = 0;
  }

  public void  addToTail(Object o){
    Node end = head;
    Node n = new Node(o);
    while (end.Next() != null){end = end.Next();}
    end.setNext(n);
    n.setNext(null);
    size += 1;

  }

  public void addNode(Object o, int index){}

  public void removeNode(int index){
    //where head index = 1;

    if (index < 1 || index > size - 1){ return; }

    Node current = head;
    int count = 0;
    while (count != index - 1 ){ current = current.Next(); count += 1;}


    current.setNext(current.Next().Next());
    size--;

    }

  public String toString(){
      Node n = head;
      StringBuffer l = new StringBuffer();
      String s = "";
      while (n.Next() != null){
          s = "" + n.Next().getData().toString() + " ";
          l.append(s);
          n = n.Next();
      }
      return  l.toString();
  }
}
