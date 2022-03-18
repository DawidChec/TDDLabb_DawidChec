
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;

import java.util.ArrayList;

public class TestEmployeeSystem {
    Employee testObject1;
    Employee testObject2;
    Employee testObject3;

    EmployeeSystem testObjectSystem;


    @BeforeAll
    public static void beforeAll() {
        System.out.println("Nu körs testsviten för Labb1 i TDD!");
    }

    @AfterAll
    public static void afterAll() {
        System.out.println("Nu avslutas testsviten!");
    }

    @AfterEach
    public void afterEach() {
        System.out.println("Testet har avslutats!");
    }

    @BeforeEach
    public void beforeEach() {
        System.out.println("Testet har startats!");

        testObject1 = new Employee("Dawid", "Chec", 25, 50.00);
        testObjectSystem = new EmployeeSystem();
    }

    @Test


}
