/*
 * Implementation of the Knapsack Algorithm using the Greedy Paradigm
 *
 * @name: G V Datta Adithya
 * @regno: 19BCE7119
 *
 */

import java.util.Scanner;

class item {
    // Defining properties of an item
    int profit;
    int weight;
    double ratio;
    boolean used = false;

    // Defining a constructor for the item
    item(int profit, int weight) {
        this.profit = profit;
        this.weight = weight;
        this.ratio = (double)profit/(double)weight;
    }

    // Retrieving the profit of the item
    int getProfit(){
        return this.profit;
    }
    
    // Retrieving the weight of the item
    int getWeight(){
        return this.weight;
    }

    // Retrieving the ratio of the item
    double getRatio(){
        return this.ratio;
    }

    // Retrieving the completion status
    // of the item
    boolean getCompletion(){
        return this.used;
    }

    // Setting the completion status
    // of the item
    void setCompletion(){
        this.used = true;
    }
}

class greedyKnapsack {
    // Defining the knapsack and the max profit
    static double knapsack;
    static double maxProfit = 0;

    public static void getMostProfitable(item[] items, int num){
        // Gets the most profitable ratio
        item[] tmpItems = new item[num];
        double maxRatio = 0;
        int maxRatioIndex = 0;

        // Iterate through the items and get the max ratio
        for(int i = 0; i < num; i++){
            if(items[i].getCompletion() == false && items[i].getRatio() > maxRatio){
                maxRatio = items[i].getRatio();
                maxRatioIndex = i;
            };
        }

        // Add to knapsack based on weight
        if(((double)knapsack - (double)items[maxRatioIndex].getWeight()) <= 0){
            maxProfit += items[maxRatioIndex].getRatio() * knapsack;
            knapsack = 0;
        } else {
            maxProfit += items[maxRatioIndex].getProfit();
            knapsack -= items[maxRatioIndex].getWeight();
        }

        // Setting the status of the current item to complete
        items[maxRatioIndex].setCompletion();
    }


    public static void main(String[] args){
        // Initializing a scanner object
        Scanner sc = new Scanner(System.in);

        // Taking the number of elements
        System.out.print("Enter the number of elements : ");
        int num = sc.nextInt();
        int[] W = new int[num];
        int[] V = new int[num];
        item[] items = new item[num];

        // Taking the weights and values
        for(int i = 0; i < num; i++){
            System.out.print("Enter the value of element " + (i + 1) + " : ");
            V[i] = sc.nextInt();

            System.out.print("Enter the weight of element " + (i + 1) + " : ");
            W[i] = sc.nextInt();

            items[i] = new item(V[i], W[i]);
        }

        // Enter the max weight
        System.out.print("Enter the max weight of the knapsack : ");
        knapsack = sc.nextInt();

        // Iterating through the items to get the 
        // most profitable item
        for(int i = 0; i < num; i++){
            if(knapsack != 0){
                getMostProfitable(items, num);
            }
        }


        // Displaying the maximum profit retrieved
        System.out.println("Maximum profit is : " + maxProfit);
    }
}
