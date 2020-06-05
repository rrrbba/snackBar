package snackBar;

public class VendingMachine {

    private static int maxId = 0;

    public int id;
    public String name;

    public VendingMachine(String name){
        maxId++;
        id = maxId;

        this.name = name;
    }
    //Getters
    public int getId(){
        return id;
    }
    public String getName(){
        return name;
    }

    //Setter
    public void setName(String name){
        this.name = name;
    }
}