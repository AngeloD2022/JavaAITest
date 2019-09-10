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
    
    public static double cost(double[] x, int index, int value){
        double result = 0.00;
        
        //x are the values that are utter trash
        
        for(int i = 0; i < x.length; i++){
            if(i == index){
                result += Math.pow((x[i] - value), 2);
            }else{
                result += Math.pow((x[i] - 0), 2);
            }
        }
        
        return result;
        
    }
}
