package thinkanumber;

import java.util.Random;
import java.util.Scanner;

public class ThinkANumber {

    private static int alja, teteje, gondolt, tipp;
    private static Scanner sc;

    public static void main(String[] args) {
        alja = 1;
        teteje = 100;
        sc = new Scanner(System.in);
        gondolt = Generate();

        System.out.println("Gondoltam egy számot " + alja + " és " + teteje + " között, találd ki!");
        System.out.println("Az én tippem: ");        
        tipp = sc.nextInt();
        while(tipp < alja || tipp > teteje){
            System.out.println("A tippelt szám a megadott intervallumon kívül esik. Tippeljen újra!");
            tipp = sc.nextInt();
        }
        while(tipp != gondolt){
            if(tipp < gondolt){
                
            }else{
                
            }
        }        
        
        //TODO: Megvizsgálni a tipp értékét, aztán ennek megfelelően válaszoljon a program.

    }

    private static int Generate() {
        Random rnd = new Random();
        return rnd.nextInt(teteje) + alja;
    }

}
