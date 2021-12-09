package com.bridgelabz;

public class Gambler {
    /*
     * Creating a gamblerSimulator
     * Created a method startGambling to store initial capital and risk per game
     * */
    public void startGambling() {
        int startingAmount = 100;
        int bet_Per_Game = 1;

        int bet_result = (int) (Math.random() * 10) % 2;
        if (bet_result == 0){
            startingAmount-=1;
        }
        else startingAmount+=1;

    }

    public static void main(String[] args) {
        Gambler play = new Gambler();
        play.startGambling();
    }
}