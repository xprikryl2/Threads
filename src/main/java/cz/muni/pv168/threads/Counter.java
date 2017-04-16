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
public class Counter {  
    
    private volatile int value;
    
    public Counter(int value) {
        this.value = value;
    }
 
    public synchronized int getAndIncrement() {
        return ++value;
    }
    
    public int getValue() {
        return this.value;
    }
}
