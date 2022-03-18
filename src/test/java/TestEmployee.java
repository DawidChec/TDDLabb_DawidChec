import org.junit.jupiter.api.*;

public class TestEmployee {
    Employee testObject1;
    Employee testObject2;
    Employee testObject3;

    @BeforeAll
    public static void beforeAll() {
        System.out.println("Nu kör vi: ");
    }

    @AfterAll
    public static void afterAll() {
        System.out.println("Nu avslutar vi: ");
    }

    @AfterEach
    public void afterEach() {
        System.out.println("Slut: ");
    }

    @BeforeEach
    public void beforeEach() {
        System.out.println("Start: ");

        testObject1 = new Employee("Dawid", "Chec", 25, 50.00);
        testObject2 = new Employee("Donald", "Trump", 56, 31050.00);
        testObject1 = new Employee("Vladmir", "Putin", 66, 1.00);

}


    @Test
    public void checkGetFirstNameTest() {
        String expected = "Dawid";
        String actual = testObject1.getFirstName();

        Assertions.assertEquals(expected, actual);
        }
    }