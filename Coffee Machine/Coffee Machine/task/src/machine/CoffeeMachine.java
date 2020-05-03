package machine;

import java.util.Scanner;

public class CoffeeMachine {
    private static int amountOfWater,amountOfMilk,amountOfBeans,amountOfCups,amountOfMoney;
    private static final Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        /*System.out.println("Starting to make a coffee\n" +
                "Grinding coffee beans\n" +
                "Boiling water\n" +
                "Mixing boiled water with crushed coffee beans\n" +
                "Pouring coffee into the cup\n" +
                "Pouring some milk into the cup\n" +
                "Coffee is ready!\n+" +
                "Write how many cups of coffee you will need: ");*/
        amountOfMilk=540;
        amountOfBeans=120;
        amountOfCups=9;
        amountOfMoney=550;
        amountOfWater = 400;
        boolean isExit=false;
        while(!isExit) {
            System.out.println("\nWrite action (buy, fill, take, remaining, exit): ");
            String choose=in.next();
            switch (choose) {
                case "buy":
                    buy();
                    break;
                case "fill":
                    fill();
                    break;
                case "take":
                    take();
                    break;
                case "remaining":
                    remaining();
                    break;
                case "exit":
                    isExit = true;
                    break;
            }
        }
        /*System.out.println("Write how many ml of water the coffee machine has: ");
        int amountOfWater = in.nextInt();
        int maxAmountOfWater = amountOfWater/200;
        System.out.println("Write how many ml of milk the coffee machine has: ");
        int amountOfMilk = in.nextInt();
        int maxAmountOfMilk= amountOfMilk/50;
        System.out.println("Write how many grams of coffee beans the coffee machine has: ");
        int numberOfCoffeeBeans = in.nextInt();
        int maxNumberOfCoffeeBeans = numberOfCoffeeBeans/15;
        System.out.println("Write how many cups of coffee you will need: ");
        int numberOfCoffee = in.nextInt();
        int averageMax=0;
        if(maxAmountOfWater>=maxAmountOfMilk && maxAmountOfMilk<=maxNumberOfCoffeeBeans)
            averageMax=maxAmountOfMilk;
        else if(maxAmountOfWater<=maxAmountOfMilk && maxAmountOfWater<=maxNumberOfCoffeeBeans)
            averageMax=maxAmountOfWater;
        else
            averageMax=maxNumberOfCoffeeBeans;
        if(maxAmountOfWater >=numberOfCoffee  && maxAmountOfMilk >= numberOfCoffee && maxNumberOfCoffeeBeans >= numberOfCoffee){
            System.out.print("Yes, I can make that amount of coffee ");
            if(averageMax>1){
                System.out.println("(and even " + (averageMax-1) + " more than that)");
            }
        }
        else
            System.out.println("No, I can make only " + averageMax  + "cup(s) of coffee");
        int cupsOfCoffee=in.nextInt();
        System.out.println("For "+cupsOfCoffee+" cups of coffee you will need:\n" +
                200*cupsOfCoffee+ " ml of water\n" +
                50*cupsOfCoffee+ " ml of milk\n" +
                15*cupsOfCoffee+ " g of coffee beans");*/
    }
    static void showEverything(){
        System.out.println("The coffee machine has:\n" +
                amountOfWater +" of water\n" +
                amountOfMilk +" of milk\n" +
                amountOfBeans +" of coffee beans\n" +
                amountOfCups +" of disposable cups\n" +
                amountOfMoney +"$ of money");

    }
    static void buy(){
        System.out.print("What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino: \n");
        String chooseCoffee = in.next();
        if (chooseCoffee.equals("1")) {
            if(amountOfWater<250)
                System.out.println("Sorry, not enough water!");
            else {
                System.out.println("I have enough resources, making you a coffee!");
                amountOfWater -= 250;
                amountOfBeans -= 16;
                amountOfMoney += 4;
                amountOfCups -= 1;
            }
        }
        else if (chooseCoffee.equals("2")) {
            if(amountOfWater<350)
                System.out.println("Sorry, not enough water!");
            else {
                System.out.println("I have enough resources, making you a coffee!");
                amountOfWater -= 350;
                amountOfMilk -= 75;
                amountOfBeans -= 20;
                amountOfMoney += 7;
                amountOfCups-=1;
            }
        }
        else if (chooseCoffee.equals("3")) {
            if(amountOfWater<200)
                System.out.println("Sorry, not enough water!");
            else {
                System.out.println("I have enough resources, making you a coffee!");
                amountOfWater -= 200;
                amountOfMilk -= 100;
                amountOfBeans -= 12;
                amountOfMoney += 6;
                amountOfCups -= 1;
            }
        }


    }
    static void fill(){
        System.out.println("Write how many ml of water do you want to add: ");
        amountOfWater += in.nextInt();
        System.out.println("Write how many ml of milk do you want to add: ");
        amountOfMilk += in.nextInt();
        System.out.println("Write how many grams of coffee beans do you want to add: ");
        amountOfBeans += in.nextInt();
        System.out.println("Write how many disposable cups of coffee do you want to add: ");
        amountOfCups += in.nextInt();
    }
    static void take(){
        System.out.println("I gave you $" + amountOfMoney);
        amountOfMoney = 0;
    }
    static void remaining(){
        showEverything();
    }
}
