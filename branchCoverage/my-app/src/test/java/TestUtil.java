import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import org.junit.Before;
import org.junit.Test;

public class TestUtil {
  Util c;

  @Before
  public void setUp() { c = new Util(); }

  @Test
  public void example() { assertTrue(true); }
  @Test
 public void testLength1(){
   int[] array=new int[1];
   assertFalse(c.compute(array));
 }
 @Test
  public void testMode2(){
    int[] array=new int[2];
    assertFalse(c.compute(array));
  }
  @Test(expected=RuntimeException.class)
  public void testArrayHaveZero(){
    int[] array=new int[3];
    array[0]=0;
    array[1]=1;
    array[2]=2;
    c.compute(array);
  }
}
