package com.company;

public class Main {

    private static Buttlove bush;
    private static Game textBasedRPG;

    public static void main(String[] args) {
        bush = new Buttlove();
        bush.mario();
        textBasedRPG = new Game();
        textBasedRPG.runRPG();
        System.out.println("Dumb");
        }
    }
