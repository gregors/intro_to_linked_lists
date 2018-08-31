class Node {
  private int value;
  private Node next;

  public Node(int value, Node node) {
    this.value = value;
    this.next = node;
  }

  public int getValue() {
    return this.value;
  }

  public void setValue(int value) {
    this.value = value;
  }

  public Node getNext() {
    return this.next;
  }

  public void setNext(Node node) {
    this.next = node;
  }
}
