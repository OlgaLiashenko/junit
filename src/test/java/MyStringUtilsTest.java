import liashenko.MyStringUtils;
import org.junit.*;

public class MyStringUtilsTest {

    @BeforeClass
    public static void beforeClass() {
        System.out.println("Test suit started!");
    }

    @AfterClass
    public static void afterClass() {
        System.out.println("Test suit finished!");
    }

    @Before
    public void before() {
        System.out.println("Test started!");
    }

    @After
    public void after() {
        System.out.println("Test finished.");
    }

    @Test
    public void testReverseStringPositive() {
        MyStringUtils myStringUtils = new MyStringUtils();
        String actual = myStringUtils.reverseString("123");

        Assert.assertEquals("321", actual);
    }

    @Test
    public void testReverseStringWithNull() {
        MyStringUtils myStringUtils = new MyStringUtils();
        myStringUtils.reverseString(null);
    }
}
