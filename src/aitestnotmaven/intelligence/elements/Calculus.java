/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aitestnotmaven.intelligence.elements;

/**
 *
 * @author asola
 */
public class Calculus {
    public static double sigmoid(double x){
        return (1/(1+Math.pow(Math.E, (-1*x))));
    }
}
