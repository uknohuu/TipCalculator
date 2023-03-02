// Program: Tip calculator GUI
// Written by: Andrew Nguyen
// Description: Will calculate the tip needed with price of meal and if you want to split with anyone at the table.
// Challenges::Formatting the decimals right for the situation with money.
// Time Spent: 1 Hour 30 Mins
//
//                   Revision History
// Date:                   By:               Action:
// ---------------------------------------------------
// 05/31/2018         (initals)       Created
 
 
/* filename must be: Anyname.java */
import javax.swing.JOptionPane;
import java.text.DecimalFormat;
public class A2GUI 
{ 
public static void main(String args [ ] ) 
{ 
// Your Java statements here 
String mealCost;
mealCost = JOptionPane.showInputDialog("Please Enter the cost of your meal?");
double a = Double.parseDouble(mealCost);
String percentage;
percentage = JOptionPane.showInputDialog("What percentage would you like to tip (15 or 18 or 20)?");
int b = Integer.parseInt(percentage);
double totalTip = a/100*b;
DecimalFormat dFormatter = new DecimalFormat("0.00");
String fTotalTip = dFormatter.format(totalTip);
JOptionPane.showMessageDialog(null, "Your tip amount: $" +fTotalTip);
double mealTip = totalTip+a;
String f2TotalTip = dFormatter.format(mealTip);
JOptionPane.showMessageDialog(null, "Your BIll + tip amount: $" +f2TotalTip);
String people;
people = JOptionPane.showInputDialog("How many people would you like to split this bill with?");
int c = Integer.parseInt(people);
double f3TotalTip = mealTip/c;
DecimalFormat dFormatter2 = new DecimalFormat("0.00");
String finalBill = dFormatter2.format(f3TotalTip);
JOptionPane.showMessageDialog(null, "Each person’s share is: $" +finalBill);

}/*end main method */ 
}/*end class Anyname*/
