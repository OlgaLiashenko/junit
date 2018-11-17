import liashenko.MyStringUtils;
import org.junit.Assert;
import org.junit.Test;

public class MyStringUtilsTest {

    @Test
    public void testReverseString(){
        System.out.println("Test start!");

        MyStringUtils myStringUtils = new MyStringUtils();
        String actual = myStringUtils.reverseString("123");

        Assert.assertEquals("321", actual);
    }
}
