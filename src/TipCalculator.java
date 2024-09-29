public class TipCalculator {
    //variables needed
    private int peopleAmount;
    private double tipAmount;
    private double billAmount;
    private double tipPercentage;
    private double tipPerson;

    //constructor for tip calculator
    public TipCalculator(double billAmount, int peopleAmount, double tipPercentage) {
        this.billAmount = billAmount;
        this.peopleAmount = peopleAmount;
        this.tipPercentage = tipPercentage;

        tipPercentage /= 100;
        this.tipAmount = tipPercentage * billAmount; //calculates tip amount
        this.tipPerson = tipAmount / peopleAmount; //calculates tip amount per person
        this.billAmount += tipAmount; //calculates total bill
    }

    //returns tip amount
    public double tip1() {

        return tipAmount;
    }

    //returns tip amount per person
    public double tips() {
        String.format("%2f", tip1());
        return tipPerson;
    }

    //returns total bill amount
    public double billAmount() {
        return billAmount;
    }

    //returns total bill amount per person
    public double bill() {
        return billAmount / peopleAmount;
    }

    //prints all the details
    public void printDetails() {
        System.out.println("Tip Amount: " + String.format("%.2f", tip1()));
        System.out.println("Tip Per Person: " + String.format("%.2f", tips()));
        System.out.println("Total Bill: " + String.format("%.2f", bill()));
        System.out.println("Bill Per Person: " + String.format("%.2f", billAmount()));
    }
}