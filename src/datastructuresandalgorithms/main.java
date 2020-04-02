/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datastructuresandalgorithms;

/**
 *
 * @author Cameron
 */
public class main {
    
    public static void main(String[] args) {
    trackList<String> MyList = new trackList<>();
    MyList.addFirst("random");
    MyList.addFirst("random");
    MyList.addFirst("random");
    MyList.addLast("song 4");
    MyList.addLast("song 5");
    MyList.addLast("song 6");
    while(!MyList.isEmpty()) {
        MyList.removeFirst();
    }
    }
    
}
