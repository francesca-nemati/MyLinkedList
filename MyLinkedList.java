public class MyLinkedList{
 private int size;
 private Node start,end;

 public MyLinkedList(){
   size = 0;
 }

 public int size() {
   return size;
 }

 public boolean add(String value) {
   if (size() == 0) {
     Node n = new Node(value);
     start = n;
     end = n;
     size++;
   }
   else {
     Node n = new Node(value);
     n.setNext(end);
     end.setPrev(n);
     end = n;
     size++;
   }
   return true;
 }

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
