import java.util.ArrayList;
import java.util.Scanner;

public class blackjack {
    public static Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {
        boolean running = true;
        Deck deck = new Deck();
        deck.shuffle();
        System.out.println("hi welcome to blackjack");
        System.out.println("you will be going against the computer");
        while (running == true) {
            boolean endGame = false;
            boolean bust = false;
            boolean playerwin = false;
            boolean compwin = false;
            boolean hitOrStay = true;
            System.out.println("here's the computer's cards:");
            ArrayList<Card> compHand = new ArrayList<Card>();
            ArrayList<Card> playerHand = new ArrayList<Card>();
            compHand.add(deck.draw());
            compHand.add(deck.draw());
            aceIs11(compHand);
            System.out.println("Unknown Card");
            System.out.println(compHand.get(1));
            if (listValue(compHand) == 21) {
                System.out.println("the computer checked his cards and got black jack:");
                System.out.println(compHand.get(0));
                System.out.println(compHand.get(1));
                endGame = true;
                hitOrStay = false;
                compwin = true;
            }
            System.out.println();
            System.out.println("Here are your cards:");
            playerHand.add(deck.draw());
            playerHand.add(deck.draw());
            aceIs11(playerHand);
            System.out.println(playerHand.get(0));
            System.out.println(playerHand.get(1));
            if (listValue(playerHand) == 21) {
                System.out.println("you got black jack!");
                endGame = true;
                hitOrStay = false;
                playerwin = true;
            }
            
            while (hitOrStay==true) {
                System.out.println("would you like to 'hit' or 'stay'?");
                String hos = scan.nextLine();
                if (hos.equals("hit")) {
                    Card save = deck.draw();
                    playerHand.add(save);
                    System.out.println(save);
                    aceIs11(playerHand);
                    if (listValue(playerHand) == 21) {
                        System.out.println("woah you hit 21 dude");
                        System.out.println("you win");
                        endGame = true;
                        playerwin = true;
                        running = false;
                        break;
                    }
                    if (listValue(playerHand) > 21) {
                        System.out.println("you bust");
                        bust = true;
                        endGame = true;
                        compwin = true;
                        running = false;
                        break;
                    }
                }
                else if (hos.equals("stay")) {
                    System.out.println("alright here is the current value of your hand: "+ listValue(playerHand));
                    hitOrStay = false;
                }
                else {
                    System.out.println("try again");
                }
            }
            System.out.println();
            System.out.println("here's the computers two cards:");
            System.out.println(compHand.get(0));
            System.out.println(compHand.get(1));
            if (bust == false && playerwin == false) {
                System.out.println("dealer/computers turn:");
                while (listValue(compHand) < 17 ) {
                    System.out.println();
                    System.out.println("card drawn:");;
                    Card temp = deck.draw();
                    compHand.add(temp);
                    System.out.println(temp);
                    if (listValue(compHand) > 21) {
                        System.out.println("the computer busts!");
                        bust = true;
                        playerwin = true;
                        hitOrStay = false;
                        endGame = true;
                        break;
                    }
                    else if (listValue(compHand) == 21) {
                        System.out.println("the computer hit 21");
                        compwin = true;
                        hitOrStay = false;
                        endGame = true;
                        break;
                    }
                }
            }
            if (bust == false) {
                if (listValue(playerHand) > listValue(compHand)) {
                    System.out.println();
                    System.out.println("you have a higher value than the computer!");
                    System.out.println("your value:"+listValue(playerHand));
                    System.out.println("computer's value:"+listValue(compHand));
                    running = false;
                    playerwin =  true;
                    endGame = true;
                }
                else if (listValue(playerHand) < listValue(compHand)) {
                    System.out.println();
                    System.out.println("the computer has a higher value than you");
                    System.out.println("your value:"+listValue(playerHand));
                    System.out.println("computer's value:"+listValue(compHand));
                    running = false;
                    compwin =  true;
                    endGame = true;
                }
                else {
                    System.out.println();
                    System.out.println("you two tie");
                    System.out.println("your value:"+listValue(playerHand));
                    System.out.println("computer's value:"+listValue(compHand));
                    running = false;
                    compwin =  true;
                    playerwin = true;
                    endGame = true;
                }
            }
            while (endGame == true) {
                if (playerwin == true && compwin == true) {
                    System.out.println();
                    System.out.println("you tied the computer! good game");
                }
                else if (playerwin == true) {
                    System.out.println();
                    System.out.println("you won against the computer!! good game");
                }
                else if (compwin == true) {
                    System.out.println();
                    System.out.println("no way you lost to a computer LL");
                }
                System.out.println("do you want to play again? 'yes' or 'no'");
                    String again = scan.nextLine();
                    if (again.equals("yes")) {
                        System.out.println("alright have fun");
                        System.out.println();
                        System.out.println();
                        running = true;
                        endGame = false;
                    }
                    else if (again.equals("no")) {
                        System.out.println("see ya");
                        running = false;
                        endGame = false; 
                        break;
                    }
                    else {
                        System.out.println("that is not yes or no, try again");
                    }
            }
        }
    }
    public static int listValue(ArrayList<Card> list) {
        int total = 0;
        for (int i = 0; i < list.size(); i++ ) {
            total += list.get(i).getValue();
        }
        return total;
    }
    public static void aceIs11(ArrayList<Card> list) { //USE THJS OMG
        for (int i = 0; i < list.size(); i++ ) {
            if (list.get(i).value == 1 && listValue(list) < 11) {
                list.get(i).value = 14;
                break;
            }
            
        }
    }
}
