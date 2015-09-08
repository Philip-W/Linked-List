


import java.io.*;
import java.util.*;

public class testLink{

  public static void main(String[] args){
      linkList list = new linkList();
      Scanner in = new Scanner(System.in);
      int n = in.nextInt();

      list.addToTail(5);
      list.addToTail(7);
      list.addToTail(19);
      list.addToTail(25);
      list.addToTail(12);

      System.out.println(list);

      System.out.println("testing remove Node");

      list.removeNode(n);
      System.out.println(list);


  }


}
