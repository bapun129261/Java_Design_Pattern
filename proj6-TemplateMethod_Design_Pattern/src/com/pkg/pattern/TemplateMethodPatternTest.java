package com.pkg.pattern;

import com.pkg.pattern.engineering.branch.branchPaper.ComputerScience;
import com.pkg.pattern.engineering.branch.branchPaper.Etc;
import com.pkg.pattern.engineering.paper.BasicPaper;

public class TemplateMethodPatternTest {

    public static void main(String[] args) {
        BasicPaper paper=null;
        System.out.println("For ComputerScience");
        System.out.println("----------------------------------------");
        paper=new ComputerScience();
        paper.papers();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println("For ETC");
        System.out.println("----------------------------------------");
        paper=new Etc();
        paper.papers();


    }

}
