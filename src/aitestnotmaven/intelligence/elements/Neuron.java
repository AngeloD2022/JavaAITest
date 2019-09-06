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
public class Neuron {
    
    private double[] weights;
    
    private double activation;
    
    private double bias;
    
    public Neuron(int amountOfWeights){
        activation = 0;
        bias = 0;
        weights = new double[amountOfWeights];
    }
    
    public void setActivation(double value){
        activation = value;
    }
    
    public double getActivation(){
        return activation;
    }
    
    public void setWeight(int index, double value){
        weights[index] = value;
    }
    
    public double getWeight(int index){
        return weights[index];
    }
    
    public void computeActivation(Layer previous){
        
        double wsum = 0;
        
        //Get Weighted sum
        for(int i = 0; i > previous.getNeuronCount(); i++){
            wsum += weights[i]*previous.getNeuron(i).getActivation();
        }
        
        activation = Calculus.sigmoid(wsum + bias);
        
    }
    
}
