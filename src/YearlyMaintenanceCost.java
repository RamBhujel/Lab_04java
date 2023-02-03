public class YearlyMaintenanceCost {
    public static void main(String[] args)
    {
        double springCost = 450.61;
        double summerCost = 250.22;
        double fallCost = 300.0;
        double winterCost = 550.85;

        double totalYearlyCost= 0.0;

        totalYearlyCost = springCost + summerCost + fallCost + winterCost;
        System.out.println("The total yearly cost for Maintenance is: $ " + totalYearlyCost);

    }
}