package ru.netology.services;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

public class FreelancerServiceTest {

    @Test
    public void testCalculateVacationMonths() {
        FreelancerVacationService service = new FreelancerVacationService();
        int income = 10_000;
        int expenses = 3_000;
        int threshold = 20_000;
        int expectedVacationMonths = 3;
        int actualVacationMonths = service.calculate(income, expenses, threshold);
        Assertions.assertEquals(expectedVacationMonths, actualVacationMonths);
    }

    @Test
    public void testCalculateVacationMonthsWithDifferentValues() {
        FreelancerVacationService service = new FreelancerVacationService();
        int income = 100_000;
        int expenses = 60_000;
        int threshold = 150_000;
        int expectedVacationMonths = 2;
        int actualVacationMonths = service.calculate(income, expenses, threshold);
        Assertions.assertEquals(expectedVacationMonths, actualVacationMonths);
    }


}