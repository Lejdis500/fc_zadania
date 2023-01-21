package Lesson3Task3;

public class Manager extends BaseEmployee {
    private static final int baseSalary = 5000;
    private static final int baseBonus = 500;
    private int bonus;

    public Manager(String name, String surname, int employmentYear, int salary) {
        super(name, surname, employmentYear, salary);
        this.bonus = baseBonus;
    }
    @Override
    public int calculateMonthlySalary() {
        return this.getSalary() + bonus;
    }

    public void setBonus(int bonus) {
        this.bonus = bonus;
    }
}
