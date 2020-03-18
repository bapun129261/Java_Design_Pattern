package com.pkg.pattern;

import com.pkg.pattern.iterator.Iiterator;
import com.pkg.pattern.streams.impl.Arts;
import com.pkg.pattern.streams.impl.Science;

import java.util.ArrayList;
import java.util.List;

public class IteratorPatternTest {
    public static void main(String[] args) {
        List<String> scienceSubject = new ArrayList<>();
        String[] artsSubject = new String[5];
        for (int i = 0; i < 5; i++) {
            scienceSubject.add("ScienceSubject" + (i + 1));
        }
        for (int i = 0; i < 5; i++) {
            artsSubject[i] = "ArtsSubject" + (i + 1);
        }
        Science<String> science = new Science<>(scienceSubject);
        Arts<String> arts = new Arts<>(artsSubject);
        Iiterator<String> artsIterator =arts.getIterator();
        Iiterator<String> scienceIterator =science.getIterator();

        System.out.println("------Arts Subjects----");
        while (artsIterator.isDone()){
            System.out.println(artsIterator.next());
            System.out.println("Arts current item"+artsIterator.currentItem());
        }

        System.out.println("-----Science Subjects-----");

        while (scienceIterator.isDone()){
            System.out.println(scienceIterator.next());
            System.out.println("Science current item"+scienceIterator.currentItem());
        }



    }
}
