public class MyLinkedList{
 private int size;
 private Node start,end;

 public MyLinkedList(){
   size = 0;
 }

 public int size() {
   reutrn size;
 }

 public boolean add(String value);
 public boolean add(int index, String value) {
   if (index < 0 || index > size()) {
     throw new IndexOutOfBoundsException("No such index in this List");
   }
 }
 public String get(int index) {
   if (index < 0 || index > size()) {
     throw new IndexOutOfBoundsException("No such index in this List");
   }
 }
 public String set(int index, String value) {
   if (index < 0 || index > size()) {
     throw new IndexOutOfBoundsException("No such index in this List");
   }
 }
 public String toString();
 //Any helper method that returns a Node object MUST BE PRIVATE!
}
