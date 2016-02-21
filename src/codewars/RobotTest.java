package codewars;

import org.junit.*;
import static org.junit.Assert.assertEquals;

class RobotTest
{
 @Test
 public void haha() throws Exception
 {
  Robot obj = new Robot();
  assertEquals(obj.reverse("emma"),"amme");
 } 
 
 @Test
 public void hehe()throws Exception
 {
  Robot obj = new Robot();
  assertEquals(obj.reverse("Alphonse"),"esnohplA");
 } 
} 
  