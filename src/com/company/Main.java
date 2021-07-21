package com.company;

public class Main {

    public static void main(String[] args) throws InterruptedException {
	// write your code here
        Shark shark = new Shark();

        LittleFish fish = new LittleFish();
        for (int i = 0; i < 140; i++){
            System.out.println(new String(new char[50]).replace("\0", "\r\n"));
            fish.space += " ";
            System.out.println(fish.space + fish);
            Thread.sleep(60);


        }
        Thread.sleep(60);
        for (int i = 0; i < 150; i++){
            System.out.println(new String(new char[50]).replace("\0", "\r\n"));
            shark.space += "\b";
            for (int j = 0; j < 14; j++)
                System.out.println(shark.space + shark.sharkImg[j]);
            Thread.sleep(60);


        }

    }
}
