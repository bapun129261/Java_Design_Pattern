package com.pkg.pattern;

import com.pkg.pattern.choice.FirstChoice;
import com.pkg.pattern.choice.MyChoice;
import com.pkg.pattern.choice.SecondChoice;
import com.pkg.pattern.context.MyContext;

import java.util.Scanner;

public class StrategyPatternTest {
    public static void main(String[] args) {
        Scanner scanner = null;
        String choiceInput1 = null, choiceInput2 = null, clientChoice = null;
        MyChoice choice = null;
        MyContext myContext = new MyContext();

        try {
            scanner = new Scanner(System.in);
            System.out.print("Enter First Input :");
            choiceInput1 = scanner.nextLine();
            System.out.print("Enter Second Input :");
            choiceInput2 = scanner.nextLine();
            System.out.println("Enter you choice[1 / 2]");
            System.out.println("1:Addtion");
            System.out.println("2:Concatination");

            clientChoice = scanner.nextLine().trim();
            if (clientChoice.equals("1")) {
                choice = new FirstChoice();
            } else {
                choice = new SecondChoice();
            }
            myContext.setChice(choice);
            myContext.showChoice(choiceInput1,choiceInput2);
        } finally {
            scanner.close();
        }

    }

}
