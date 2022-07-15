

import java.util.ArrayList;
import java.util.Scanner;

public class war {
    public static Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {
        boolean running = true;
        // boolean p1turn = true;
        boolean war = false;
        Deck tempdeck = new Deck();
        tempdeck.shuffle();
        ArrayList<Card> d1 = new ArrayList<Card>();
        ArrayList<Card> d2 = new ArrayList<Card>();
        for(int e = 0; e < 26; e++) {
            d1.add(tempdeck.draw());
            d2.add(tempdeck.draw());
        }
        System.out.println("hey this is war");
        System.out.println("what's player 1's name?");
        String p1 = scan.nextLine();
        System.out.println("welcome, "+p1+"!");  // REMEMEBER TO SAVE BEFORE RUNNING
        System.out.println("what's player 2's name?");
        String p2 = scan.nextLine();
        System.out.println("welcome, "+p2+"!");
        // System.out.println(d1);
        
        while(running == true) {  
            if (d1.size()==0) {
                System.out.println(p1+" has unfortunately ran out of cards. "+p2+" wins!!!");
                break;
            }
            if (d2.size()==0)  {
                System.out.println(p2+" has unfortunately ran out of cards. "+p1+" wins!!!");
                break;
            }
            System.out.println("draw your cards.. 321");
            scan.nextLine();
            Card acard = d1.remove(0);
            Card bcard = d2.remove(0);
            System.out.println(p1+"'s card:"+acard);
            System.out.println(p2+"'s card:"+bcard);
            if (acard.value > bcard.value) {
                System.out.println("player 1 takes the cards!");
                d1.add(acard);
                d1.add(bcard);
                scan.nextLine();
            }
            else if (acard.value == bcard.value) {
                System.out.println("WAR!!!");
                war = true;
                ArrayList<Card> war1 = new ArrayList<Card>();
                ArrayList<Card> war2 = new ArrayList<Card>();
                while (war==true) {          
                    if (d1.size() < 4) {
                        System.out.println(p1+" loses. congrats "+p2+"!");
                        running = false;
                        war = false;
                    }
                    else if (d2.size() < 4) {
                        System.out.println(p2+" loses. congrats "+p1+"!");
                        running = false;
                        war = false;
                    }
                    else {
                        for(int x = 0; x<3; x++) {
                            war1.add(d1.remove(0));
                            war2.add(d2.remove(0));
                        }
                        for(int x = 0; x<6; x++) {
                            System.out.println("upside down card");
                        }
                        System.out.println("3 cards were dealt... one flip decides it all");
                        System.out.println("draw your cards.. 321");
                        scan.nextLine();
                        Card ccard = d1.remove(0);
                        Card dcard = d2.remove(0);

                        war1.add(ccard);
                        war2.add(dcard);
                        System.out.println(p1+"'s card:"+ccard);
                        System.out.println(p2+"'s card:"+dcard);
                        if (ccard.value > dcard.value) {
                            System.out.println("player 1 takes the cards!");
                            d1.add(acard);
                            d1.add(bcard);
                            while (war1.size() > 0) {
                                d1.add(war1.remove(0));
                            }
                            while (war2.size() > 0) {
                                d1.add(war2.remove(0));
                            }
                            

                            scan.nextLine();
                            war = false;
                        }
                        else if (ccard.value < dcard.value ) {
                            System.out.println("player 2 takes the cards!");
                            d2.add(acard);
                            d2.add(bcard);
                            while (war1.size() > 0) {
                                d2.add(war1.remove(0));
                            }
                            while (war2.size() > 0) {
                                d2.add(war2.remove(0));
                            }
                            war = false;
                        }
                    }
                }
            }
            else {
                System.out.println("player 2 takes the cards!");
                d2.add(acard);
                d2.add(bcard);
                scan.nextLine();
            }

        }

    }
}
