public class notclean{

    //define variables..
    public float calculateTax(float income, float taxRate, float deduction) {
        float taxableIncome = income - deduction;
        float tax = taxableIncome * taxRate;
        return tax;
    }
}