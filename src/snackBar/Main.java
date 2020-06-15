package snackBar;

public class Main {

    private static void opensnackBar()
    {
        System.out.println("Test");

        Customer c1 = new Customer("Jane", 45.25);
        Customer c2 = new Customer("Bob", 33.14);

        VendingMachine v1 = new VendingMachine("Food");
        VendingMachine v2 = new VendingMachine("Drink");
        VendingMachine v3 = new VendingMachine("Office");


        Snack s1 = new Snack("Chips", 36, 1.75, v1.getId());
        Snack s2 = new Snack("Chocolate Bar", 36, 1.00, v1.getId());
        Snack s3 = new Snack("Pretzel", 30, 2.00, v1.getId());

        Snack s4 = new Snack("Soda", 24, 2.50, v2.getId());
        Snack s5 = new Snack("Water", 20, 2.75, v2.getId());

        System.out.println("***Processing");

        c1.cashReduce(s4.getCost() * 3);
        s4.reduceQuantity(3);
        System.out.print("Customer 1 cash on hand " + c1.cashOnHand);
        System.out.println();
        System.out.println("Quantity of snack 4 is " + s4.getQuantity());

        System.out.println();

        c1.cashReduce(s3.getCost());
        s3.reduceQuantity(1);
        System.out.print("Customer 1 cash on hand " + c1.cashOnHand);
        System.out.println();
        System.out.println("Quantity of snack 3 is " + s3.getQuantity());

        System.out.println();

        c2.cashReduce(s4.getCost() * 2);
        s4.reduceQuantity(2);
        System.out.print("Customer 2 cash on hand " + c2.cashOnHand);
        System.out.println();
        System.out.println("Quantity of snack 4 is " + s4.getQuantity());

        System.out.println();

        c1.cashAdd(10.00);
        System.out.print("Customer 1 cash on hand " + c1.cashOnHand);

        System.out.println();

        c1.cashReduce(s2.getCost());
        s2.reduceQuantity(1);
        System.out.print("Customer 1 cash on hand " + c1.cashOnHand);
        System.out.println();
        System.out.println("Quantity of snack 2 is " + s2.getQuantity());

        System.out.println();

        s3.addQuantity(12);
        System.out.println("Quantity of snack 3 is " + s3.getQuantity());

        System.out.println();

        c2.cashReduce(s3.getCost() * 3);
        s3.reduceQuantity(3);
        System.out.print("Customer 2 cash on hand " + c2.cashOnHand);
        System.out.println();
        System.out.println("Quantity of snack 3 is " + s3.getQuantity());

    }






    public static void main(String[] args){
        opensnackBar();
    }

}