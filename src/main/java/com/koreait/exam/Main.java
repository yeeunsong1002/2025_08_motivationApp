package com.koreait.exam;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Container.init();
     //   Scanner sc = new Scanner(System.in);

        new App().run();

        Container.close();
     //   sc.close();

    }
}
