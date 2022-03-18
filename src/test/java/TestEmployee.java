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
    public void checkGetUniqueIDTest2() {
        int actual2 = testObject2.getUniqueID();

        int expected1 = actual2 - 1;
        int expected3 = actual2 + 1;

        int actual1 = testObject1.getUniqueID();
        int actual3 = testObject3.getUniqueID();

        Assertions.assertEquals(expected1, actual1);
        Assertions.assertEquals(expected3, actual3);
    }