package com.pkg.pattern;

import com.pkg.pattern.component.Person;
import com.pkg.pattern.component.impl.Student;
import com.pkg.pattern.component.impl.Teacher;
import com.pkg.pattern.component.impl.colleague;
import com.pkg.pattern.mediator.Mediator;
import com.pkg.pattern.mediator.impl.MessageMediator;

import javax.security.auth.Subject;

public class MediatorPatternTest {
    public static void main(String[] args) {
        Mediator mediator=new MessageMediator();
        Person teacher=new Teacher(mediator);
        Person student=new Student(mediator);
        Person colleague=new colleague(mediator);
        mediator.registerPerson(teacher);
        mediator.registerPerson(student);
        mediator.registerPerson(colleague);

        teacher.send("Hi..!");
        student.send("hello sir..");
        colleague.send("hi durga sir..!");


    }
}
