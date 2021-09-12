package com.nitincodes;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	// java program to find power of a number:
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the value of a");
        int a = sc.nextInt();
        System.out.println("enter the value of b");
        int b = sc.nextInt();
        double z = Math.pow(a,b);
        System.out.println(""+a+" to the power "+b+" is ");
        System.out.println(z);
    }
}
