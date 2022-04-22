package COP_3337.Formative;

public class FederalTaxRate {
    /*
     * Calculate the federal tax rate based on the image (FedTaxRateTable.png)
     */
    public double calcTax(double income, boolean married) {
        int div = married ? 64000 : 32000;
        if (income <= div) return income * .1;
        return ((income - div) * .25) + (div * .1);
    }
}
