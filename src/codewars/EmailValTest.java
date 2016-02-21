package codewars;

import org.junit.*;


public class EmailValTest{
public @Test void runTests(){
Assert.assertEquals("Didn't accept valid email", EmailValidator.validate("abc@example.com"), true);
Assert.assertEquals("Accepted invalid email", EmailValidator.validate("_bc@example.com"), false);
Assert.assertEquals("Didn't accept valid email", EmailValidator.validate("abc123@example-123.co.uk"), true);
Assert.assertEquals("Didn't accept valid email", EmailValidator.validate("abc_123@a-1_23.co.uk"), true);
Assert.assertEquals("Accepted invalid email", EmailValidator.validate("abc@abc"), false);
}
}