/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cz.muni.pv168.threads;



/**
 *
 * @author Ondrej Prikryl
 */
public class Main {
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Runnable counter = new MyThread();
        //Runnable counter2 = new MyThread();
        //Runnable counter3 = new MyThread();

        Thread counterThread1 = new Thread(counter, "Vlakno 1: ");
        Thread counterThread2 = new Thread(counter, "Vlakno 2: ");
        Thread counterThread3 = new Thread(counter, "Vlakno 3: ");
        
        counterThread1.start();
        counterThread2.start();
        counterThread3.start();
    }
    
}
