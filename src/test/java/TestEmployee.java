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
        testObject3 = new Employee("Vladmir", "Putin", 66, 1.00);

    }

    @Test
    public void checkGetFirstNameTest() {
        String expected = "Dawid";
        String actual = testObject1.getFirstName();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void checkSetFirstNameTest() {
        String expected = "Bilbo";

        testObject1.setFirstName(expected);
    }

    @Test
    public void checkSetLastNameTest() {
        String expected = "Bagger";

        testObject1.setLastName(expected);
    }

    @Test
    public void checkGetLastNameTest() {
        String expected = "Chec";

        String actual = testObject1.getLastName();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void checkGetAgeTest() {
        int expected = 25;

        int actual = testObject1.getAge();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void checkSetAgeTest() {
        int expected = 71;

        testObject1.setAge(expected);

        int actual = testObject1.getAge();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void checkGetSalaryTest() {
        double expected = 50.00;

        double actual = testObject1.getSalary();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void checkSetSalaryTest() {
        double expected = 123456.00;

        testObject1.setSalary(expected);

        double actual = testObject1.getSalary();

        Assertions.assertEquals(expected, actual);
    }
}