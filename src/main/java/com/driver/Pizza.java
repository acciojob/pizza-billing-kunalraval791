package com.driver;

public class Pizza {

    private int price;
    private Boolean isVeg;
    private String bill;

    private int basePrice;
    private int cheese;
    private int toppings;

    boolean isExtraCheese;
    boolean isExtraToppings;
    boolean istakeAway;
    boolean isBillGenerated;


    public Pizza(Boolean isVeg){
        this.isVeg = isVeg;
        this.isBillGenerated = false;
        this.isExtraCheese = false;
        this.isExtraToppings = false;
        this.istakeAway = false;
        this.bill = "";
        // your code goes here
        if(this.isVeg == true){
            this.price = 300;
            this.toppings = 70;
        }else{
            this.price = 400;
            this.toppings = 120;
        }
        this.cheese = 80;
        this.bill += "Base Price Of The Pizza: " + this.price + "\n";
    }

    public int getPrice(){
        return this.price;
    }

    public void addExtraCheese(){
        // your code goes here
        if(isExtraCheese == false){
            this.price += cheese;
//            System.out.println("Extra Cheese Added: 80");
            this.isExtraCheese = true;
        }
    }

    public void addExtraToppings(){
        // your code goes here
        if(isExtraToppings == false){
            this.price += toppings;
            isExtraToppings = true;
        }
    }

    public void addTakeaway(){
        // your code goes here
        if(istakeAway == false){
            this.price += 20;
            istakeAway = true;
        }
    }

    public String getBill(){
        // your code goes here
        if(!isBillGenerated){
            if(isExtraCheese) {
                this.bill += "Extra Cheese Added: "+this.cheese+"\n";
            }

            if(isExtraToppings) {
                this.bill += "Extra Toppings Added: "+this.toppings+"\n";
            }

            if(istakeAway) {
                this.bill += "Paperbag Added: 20" + "\n";
            }

            this.bill += "Total Price: " + this.price + "\n";
            isBillGenerated = true;
        }
        return this.bill;
    }
}
