  //Modiify so that it can be used for a double linked list (add preve())
  
private class Node {
  
  private Object data;
  Node next;
  
  public Node(Object o){
      next = null;
      data = o;
  }      

  public Node(Object o, Node nextVal){
    next = nextVal;
    data = o;
  }
  
  public Object getData() { return data; }
  
  public Node Next(){ return next; }

  public void setNext(Node k) { next = k; }
  

}
