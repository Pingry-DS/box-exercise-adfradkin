// To run this with a default runner try
// java org.junit.runner.JUnitCore TestBox

// static import gives us access to assert methods without class name/
import static org.junit.Assert.*;
import org.junit.Test;

public class TestBox {

  @Test
  public void testNewEmpty() {
    Box b = new Box();
    assertFalse(b.isFull());
  }

  @Test
  public void testNewFull() {
    Box<String> b = new Box<String>("Hello");
    assertTrue(b.isFull());
  }

  @Test
  public void testNewContents() {
    Integer i = new Integer(5);
    Box<Integer> b = new Box<Integer>(5);
    assertEquals(b.getContents(), i);
  }
}