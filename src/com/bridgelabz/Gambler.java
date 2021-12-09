package com.bridgelabz;

public class Gambler {
    /*
    store initial capital and risk per game
     * */


    public void startGambling() {
        int startingAmount=100;
        int bet_Per_Game = 1;
        while ( startingAmount != 150 || startingAmount !=50) {
            int bet_result = (int) (Math.random() * 10) % 2;
            if (bet_result == 0) {
                startingAmount -= bet_Per_Game;
            } else {
                startingAmount += bet_Per_Game;
            }
            if(startingAmount == 150) {
                System.out.println("Won 50% of the stake ");
                break;}
            else if (startingAmount == 50)
            {
                System.out.println("Lost 50 % of the stake");
                break;}
        }
    }
    public static void main (String[]args){
        Gambler play = new Gambler();
        play.startGambling();
    }
}