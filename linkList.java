
public class linkList{

  private Node head;
  private int size;

  public linkList(){
    head = new Node(null);
    size = 0;
  }

  public addNode(Object o){}

  public addNode(Object o, int index){}
  
  public removeNode(int index){}
  
  public String toString(){
      Node n = head;
      String s = "" + n.toString();
      while (n.Next() != null){
          s = s + ", " + n.Next().toString();
          n = n.Next();
      }
      return s;
  }
 
  
}
