package Lesson7Task8;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

class SalaryCalculatorTest {

    @Test
    void shouldGetSalary() {
        // given
        BaseSalaryProvider baseSalaryProvider = Mockito.mock(BaseSalaryProvider.class);
        Mockito.when(baseSalaryProvider.getBaseSalary()).thenReturn(1000.0);

        SaturdayBonusProvider saturdayBonusProvider = Mockito.mock(SaturdayBonusProvider.class);
        Mockito.when(saturdayBonusProvider.getSaturdayBonus()).thenReturn(50.0);

        SalaryCalculator salaryCalculator = new SalaryCalculator(baseSalaryProvider, saturdayBonusProvider);

        // when
        double salary = salaryCalculator.getSalary(500, 2);

        // then
        Assertions.assertEquals(1600, salary);
    }
}