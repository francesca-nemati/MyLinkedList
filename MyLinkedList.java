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
     end.setNext(n);
     n.setPrev(end);
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
   else {
     return findElement(index).getData();
   }
 }
 public String set(int index, String value) {
   if (index < 0 || index > size()) {
     throw new IndexOutOfBoundsException("No such index in this List");
   }
 }
 public String toString();

 private Node findElement(int index) {
   Node n1 = new Node(start.getNext());
   if (index == 0) return start;
   if (index == size()) return end;
   int i = 1;
   while (i < index) {
     Node n2 = new Node(n1.getNext());
     n1 = n2;
   }
   return n1;
 }
 //Any helper method that returns a Node object MUST BE PRIVATE!
}
