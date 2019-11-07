/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unus;

/**
 *
 * @author duran
 */
public class Singleton {
    private static Singleton uniqueInstance = new Singleton();
 
    private Singleton() {
    }
 
    public static Singleton getInstance() {
        return uniqueInstance;
    }
}
