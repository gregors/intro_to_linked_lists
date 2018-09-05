public class ExampleProgram {

  public static void main(String args[]) {
    Node one = new Node(5, null);
    Node two = new Node(10, one);
    Node three = new Node(15, two);
    Node four = new Node(20, three);
    Node five = new Node(25, four);
    Node head = five;
    printOutList(head);
  }

  public static void printOutList(Node start) {
    Node temp = start;
    while(temp != null) {
      System.out.print("[ " + temp.getValue() + "] -> ");
      temp = temp.getNext();
    }
    System.out.println("null");
  }
}
