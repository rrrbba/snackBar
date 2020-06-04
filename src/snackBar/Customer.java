package snackBar;

public class Customer
{
    private static int maxId = 0;

    public int id;
    public String name;
    public double cashOnHand;

    public Customer(String name, double cashOnHand){

        maxId++;
        id = maxId;

        this.name = name;
        this.cashOnHand = cashOnHand;
    }

    //Getter methods
    public int getId(){
        return id;
    }
    public String getName(){
        return name;
    }
    public double getCashOnHand(){
        return cashOnHand;
    }

    //Setters
    public void setName(String name){
        this.name = name;
    }
    public void cashAdd(double cashAdded){
        this.cashOnHand = this.cashOnHand + cashAdded;
    }
    public void cashReduce(double reduce){
        this.cashOnHand = this.cashOnHand - reduce;
    }
}
