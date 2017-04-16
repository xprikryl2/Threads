/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cz.muni.pv168.threads;

import java.util.concurrent.atomic.AtomicInteger;

/**
 *
 * @author Ondrej Prikryl
 */
public class MyThread implements Runnable{

    private static final Object LOCK = new Object();
    private static AtomicInteger atom = new AtomicInteger(0);

    // if we cannot use atomicInteger, we can use Counter class instead
    //private static Counter counter = new Counter(0);
    
    @Override
    public void run() {
      
        
        while(true) {
            synchronized(LOCK) {
                if(atom.get() > 50) {
                    return;
                }
                System.out.println(Thread.currentThread().getName() + atom.getAndIncrement());
            }
            for (long l = 0l; l < 1000000; l++) {}
        }
        
        // use this in case that we cannot use atomicInteger
        /*
        int value;
        
        while(true) {
            synchronized(LOCK) {
                value = counter.getValue();
                if(value > 50) {
                    return;
                }
                System.out.println(Thread.currentThread().getName() + value);
                counter.getAndIncrement();
            }
            for (long l = 0l; l < 1000000; l++) {}
        }
        */
    }
}