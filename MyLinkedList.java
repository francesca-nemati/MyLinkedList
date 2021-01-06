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
   }
   else {
     Node n = new Node(value);
     n.setPrev(end);
     end.setNext(n);
     end = n;
   }
   size++;
   return true;
 }

 public boolean add(int index, String value) {
   if (index < 0 || index > size()) {
     throw new IndexOutOfBoundsException("No such index in this List");
   }
   else if (index == size()) return add(value);
   else {
     Node n = new Node(value);
     n.setPrev(findElement(index).getPrev());
     findElement(index).setPrev(n);
     n.setNext(findElement(index));
     if (index > 0) findElement(index-1).setNext(n);
     else start = n;
   }
   size++;
   return true;
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
   String old;
   if (index == 0) {
     Node n = new Node(value);
     old = start.getData();
     n.setNext(start.getNext());
     start = n;
   }
   else if (index == size()) {
     Node n = new Node(value);
     old = end.getData();
     n.setPrev(end.getPrev());
     end = n;
   }
   else {
     Node n = new Node(value);
     old = findElement(index).getData();
     n.setPrev(findElement(index).getPrev());
     n.setNext(findElement(index).getNext());
     findElement(index-1).setNext(n);
     findElement(index+1).setPrev(n);
   }
   return old;
 }

 public String toString() {
   String ans = "";
   for (int i = 0; i < size(); i++) {
     if (i < size()-1) ans = ans + get(i) + ", ";
     else ans = ans + get(i);
   }
   return ans;
 }

//Any helper method that returns a Node object MUST BE PRIVATE!
 private Node findElement(int index) {
   Node n1 = start.getNext();
   if (index == 0) return start;
   if (index == size()) return end;
   else {
     Node n2 = n1.getNext();
     int i = 1;
     while (i < index) {
       n2 = n1.getNext();
       n1 = n2;
       i++;
     }
     return n1;
   }
 }

}
