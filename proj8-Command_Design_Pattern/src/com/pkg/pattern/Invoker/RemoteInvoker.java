package com.pkg.pattern.Invoker;

import com.pkg.pattern.command.Icommand;

public class RemoteInvoker {
    private Icommand lightOn;
    private Icommand lightOff;
    private Icommand lightUp;
    private Icommand lightDown;
    private boolean on = true;
    private boolean off = true;

    public RemoteInvoker(Icommand lightOn, Icommand lightOff, Icommand lightUp, Icommand lightDown) {
        this.lightOn = lightOn;
        this.lightOff = lightOff;
        this.lightUp = lightUp;
        this.lightDown = lightDown;
    }

    public void lightOn() {
        if (off) {
            this.lightOn.execute();
            this.on = true;
            this.off = false;
        } else
            lightOff();
    }

    public void lightOff() {
        if (on) {
            this.lightOff.unExecute();
            this.on = false;
            this.off = true;
        } else
            lightOn();
    }

    public void lightUp() {
        if (on)
            this.lightUp.execute();
        else
            System.out.println("First Switch On Light..!");
    }

    public void lightDown() {
        if (on)
            this.lightDown.execute();
        else
            System.out.println("First Switch On Light..!");
    }
}
