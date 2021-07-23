package com.aisha;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int f=0,s=1,num,n3,i;
        num=sc.nextInt();
        for(i=2;i<=num;i++) {
            System.out.print(f + "+");
            n3 = f + s;
            f = s;
            s = n3;
        }
        }
}
