import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class TestNode {

   @Test
   public void test_node_returns_values() {
     Node node  = new Node(5, null);
     assertEquals(node.getValue(), 5);
     assertEquals(node.getNext(), null);
   }
}
