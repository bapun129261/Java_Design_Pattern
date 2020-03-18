package com.pkg.pattern;

import com.pkg.pattern.Invoker.RemoteInvoker;
import com.pkg.pattern.command.impl.LightDownCommand;
import com.pkg.pattern.command.impl.LightOffCommand;
import com.pkg.pattern.command.impl.LightOnCommand;
import com.pkg.pattern.command.impl.LightUpCommand;
import com.pkg.pattern.receiver.LightBulb;



public class CommandPatternTest {
    public static void main(String[] args) {
        RemoteInvoker remote = new RemoteInvoker(new LightOnCommand(new LightBulb()), new LightOffCommand(new LightBulb()), new LightUpCommand(new LightBulb()), new LightDownCommand(new LightBulb()));
        remote.lightOn();
       remote.lightOff();
       remote.lightDown();
        remote.lightOn();
        remote.lightDown();
        remote.lightOff();
        remote.lightUp();
    }
}
