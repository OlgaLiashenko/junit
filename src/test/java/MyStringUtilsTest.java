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

        Assert.assertEquals("String was not reversed", "321", actual);
    }

    @Test
    public void testReverseStringWithNull() {
        MyStringUtils myStringUtils = new MyStringUtils();
        Assert.assertNull("Returned string was not null for null input.", myStringUtils.reverseString(null));
    }

    @Test
    public void testReverseStringWithEmptyString() {
        MyStringUtils myStringUtils = new MyStringUtils();
        Assert.assertEquals("Returned string was not empty for empty input.",
                "", myStringUtils.reverseString(""));
    }
}
