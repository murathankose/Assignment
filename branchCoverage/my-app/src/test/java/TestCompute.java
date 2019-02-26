import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.*;

import org.junit.Test;

public class TestCompute {
  Compute c;

  @Test
  public void example() {
    MessageQueue mq = mock(MessageQueue.class);
    c = new Compute(mq);
    assertTrue(true);
  }
 @Test
  public void testNotHave(){
    MessageQueue mq = mock(MessageQueue.class);
    c = new Compute(mq);
    when(c.mq.size()).thenReturn(0);
    assertEquals(-1,c.countNumberOfOccurrences("a"));
  }
 @Test
  public void testHave(){
    MessageQueue mq = mock(MessageQueue.class);
    c = new Compute(mq);
    when(c.mq.size()).thenReturn(2);
    assertEquals(0,c.countNumberOfOccurrences(""));
  }
@Test
 public void testmqContains() {
   MessageQueue mq = mock(MessageQueue.class);
   c = new Compute(mq);
   String e = "1";
   when(c.mq.size()).thenReturn(2);
   when(c.mq.contains(e)).thenReturn(true);
   assertEquals(0, c.countNumberOfOccurrences(e));
 }
 @Test
 public void testLastIf() {
   MessageQueue mq = mock(MessageQueue.class);
   c = new Compute(mq);
   String e = "1";
   when(c.mq.size()).thenReturn(1);
   when(c.mq.contains(e)).thenReturn(true);
   when(c.mq.getAt(0)).thenReturn(e);

   assertEquals(1, c.countNumberOfOccurrences(e));
 }
}
