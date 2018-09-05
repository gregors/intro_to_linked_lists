import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class TestLinkedList {
  @Test

  public void test_newly_created_list_is_empty() {
    LinkedList list = new LinkedList();
    list.add(5);
    assertEquals(list.getSize(), 1);
  }
}
