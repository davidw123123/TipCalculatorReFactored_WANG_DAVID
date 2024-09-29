import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        // Variables needed
        System.out.print("Total bill amount ($): ");
        String x = s.nextLine();
        double billAmount = Double.parseDouble(x);
        System.out.print("Tip percent in whole number: ");
        String y = s.nextLine();
        double tipPercentage = Double.parseDouble(y);
        System.out.print("Amount of people: ");
        String z = s.nextLine();
        int peopleAmount = Integer.parseInt(z);
        double tipAmount;
        double tipPerson;
        System.out.println("---------------------------");

        // Calculations for the tip
        tipPercentage /= 100;
        tipAmount = tipPercentage * billAmount;
        String tipCost = String.format("%.2f", tipAmount); // Rounds to the hundredths
        System.out.println("Total Tip Amount: $" + tipCost);
        System.out.println("---------------------------");
        double tipAmounts = Double.parseDouble(tipCost); // Converts String to double

        // Total bill cost
        billAmount += tipAmounts;
        String billCost = String.format("%.2f", billAmount);  // Rounds to the hundredths
        System.out.println("Total Bill Cost: $" + billCost);
        System.out.println("---------------------------");
        double billAmounts = Double.parseDouble(billCost);  // Converts String to double

        //Tip per person
        tipPerson = tipAmounts/peopleAmount;
        String tipPerPerson = String.format("%.2f", tipPerson);  // Rounds to the hundredths
        System.out.println("Tip per person: $" + tipPerPerson);
        System.out.println("---------------------------");

        // Total Bill per person
        billAmounts /= peopleAmount;
        String totalBill = String.format("%.2f", billAmounts); // Rounds to the hundredths
        System.out.println("Total bill per person: $" + totalBill);
        System.out.println("---------------------------");

    }
}