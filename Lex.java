import java.util.Scanner;
import java.io.*;

public class Lex {
  
  public static void main(String args[]) throws FileNotFoundException, java.io.IOException {
    int n=0;
    if(args.length != 2) {
      System.err.println("EXIT 1");
      System.exit(1);
    }
    Scanner in = new Scanner(new File(args[0]));
    Scanner in2 = new Scanner(new File(args[0]));
    PrintWriter out = new PrintWriter(new FileWriter(args[1]));
    String test = "";
    while( in.hasNextLine() ){
      n++;
      test = in.nextLine();
    }

    String[] array = new String[n];
    int indice = 0;

    while(in2.hasNextLine() ) {
      String line = in2.nextLine();
      array[indice] = line;
      indice++;
    }
    List L = new List();    
    
    for( int j=1; j<n; j++) {
      String temp = array[j];
      int i = j-1;
      if(L.length() == 0 ) {
        L.prepend(0);
      }
      if( L.length() > 0 ) {
        L.moveFront();
        while( L.index() != i) {
          L.moveNext();
        }
      }
      while( i>=0 && temp.compareTo(array[ L.get() ]) < 0 ) {
        //array[i+1] = array[i];
        L.movePrev();
        i = i - 1;
      }
      //array[i+1] = temp;
      if(L.index() == -1) {
        L.prepend(j);
      }
      else {
        L.insertAfter(j);
      }
    }
    
    L.moveFront();
    for(int i=0; i< n; i++) {
      out.println( array[L.get()] );
      L.moveNext();
    }
    in.close();
    out.close();
  }
}









