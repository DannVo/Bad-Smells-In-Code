
public class TaxCalculation {
    private float income;
    private float taxRate;
    private float deduction;
    
    public TaxCalculation(float income, float taxRate, float deduction) {
        this.income = income;
        this.taxRate = taxRate;
        this.deduction = deduction;
    }

    // getters and setters
}

public float calculateTax(TaxCalculation taxCalculation) {
    float taxableIncome = taxCalculation.getIncome() - taxCalculation.getDeduction();
    float tax = taxableIncome * taxCalculation.getTaxRate();
    return tax;
}
