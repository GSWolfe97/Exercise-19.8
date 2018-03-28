/*
 *  Program:    Exercise 19.8
 *  Date:       3/24/18
 *  Developer:  Garrett Wolfe
 *  Purpose:    (Shuffle ArrayList) Write the following method that shuffles an ArrayList:
 *              public static <E> void shuffle(ArrayList<E> list)  
 */
package exercise.pkg19_8;

import java.util.ArrayList;
public class Exercise19_8 {
     public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            list.add(i);
        }
        System.out.println("Original: " + list);
        shuffle(list);
        System.out.println("Shuffled: " + list);
    }

    public static <E> void shuffle(ArrayList<E> list) {
        for (int i = 0; i < list.size(); i++) {
            int random = (int) (Math.random() * list.size());
            E tmp = list.get(random);
            list.set(random, list.get(i));
            list.set(i, tmp);
        }
    }
}