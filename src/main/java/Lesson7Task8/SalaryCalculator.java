package Lesson7Task8;

public class SalaryCalculator {
    private final BaseSalaryProvider baseSalaryProvider;
    private final SaturdayBonusProvider saturdayBonusProvider;

    public SalaryCalculator(BaseSalaryProvider baseSalaryProvider, SaturdayBonusProvider saturdayBonusProvider) {
        this.baseSalaryProvider = baseSalaryProvider;
        this.saturdayBonusProvider = saturdayBonusProvider;
    }

    double getSalary(double bonus, int numberOfSaturdays) {
        return baseSalaryProvider.getBaseSalary() + bonus + (saturdayBonusProvider.getSaturdayBonus() * numberOfSaturdays);
    }
}

