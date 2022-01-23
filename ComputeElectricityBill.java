// Here the code to compute Electricity bill
// you way chaanges the cost value according to your area.


import java.util.Scanner;

public class ComputeElectricityBill {
    public static void main(String[] args) {
        long units;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number of units : ");

        units = sc.nextInt();
        double billpay = 0;
        if(units < 100) billpay = units * 1.20;
        else if (units < 300) billpay = 100*1.20 + (units-100)*2;
        else  if (units > 300) billpay = 100*1.20 + 200 *2+(units-300)*3;

        System.out.println("Bill to pay : " + billpay);
    }
}
