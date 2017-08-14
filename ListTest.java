public class ListTest{
   public static void main(String[] args){
      List A = new List();
      List B = new List();
      
      for(int i=1; i<=20; i++){
         A.append(i);
         B.prepend(i);
      }
//      A.append(100);
//      A.prepend(100);
//      B.append(100);
//      B.prepend(100);
//      A.moveFront();
//      B.moveBack();
//      A.moveNext();
//      B.movePrev();
//      System.out.println(A.get());
//      System.out.println(B.get());
      //B.deleteBack();
      //A.deleteFront();
      //System.out.println(A.equals(B));
//      A.delete();
//      B.delete();
      A.moveFront();
      A.insertBefore(0);
      
      System.out.println(A);
      System.out.println(B);
   }
}