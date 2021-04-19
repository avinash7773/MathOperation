package com.math;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.function.Consumer;

public class NumberPlayList {
    public static void main(String[] argv){
        List<Integer> myNumberList = new ArrayList<Integer>();
        for (int i=0; i<5; i++) myNumberList.add(i);

        //method 1: traversing using iterator
        Iterator<Integer> iterator = myNumberList.iterator();
        while (iterator.hasNext()) {
            Integer i = iterator.next();
            System.out.println("Iterator value::"+i);
        }

        //method 2: traversing with consumer interface implementation
        class MyConsumer implements Consumer<Integer> {
            public void accept(Integer t) {
                System.out.println("Mth2 : Consumer impl value::"+t);
            }
        }

        MyConsumer action = new MyConsumer();
        myNumberList.forEach(action);

        //Method 3 Traversing with Anonymous consumer interface implementation
        myNumberList.forEach(new Consumer<Integer>() {
            @Override
            public void accept(Integer t) {
                System.out.println("Mt3: forEach Anonymous class value::"+t);
            }
        });

        //Method 4 Explicit Lambda Function
        Consumer<Integer> myListAction = n-> {
            System.out.println("Mt4:: forEach lambda expli value::"+n);
        };

        myNumberList.forEach(myListAction);

        //Method 5 Implicit lambda Function
        myNumberList.forEach(n-> {
            System.out.println("Method5:: forEach Lambda impl value::" + n);
        });
    }
}
