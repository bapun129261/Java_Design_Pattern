package com.pkg.pattern.engineering.paper;

public abstract class BasicPaper {
    public void papers() {
        math();
        softSkill();
        specialPaper();
    }

    private void softSkill() {
        System.out.println("SoftSkill");
    }

    private void math() {
        System.out.println("Math");
    }

    public abstract void specialPaper();

}
