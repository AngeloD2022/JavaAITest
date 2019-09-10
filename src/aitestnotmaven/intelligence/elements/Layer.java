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
public class Layer {
    private Neuron[] neurons;
    
    public Layer(int neuronCount, int weightsPerNeuron){
        neurons = new Neuron[neuronCount];
        for(int i = 0; i < neuronCount; i++){
            neurons[i] = new Neuron(weightsPerNeuron);
        }
    }
    
    public Neuron getNeuron(int index){
        return neurons[index];
    }
    
    public int getNeuronCount(){
        return neurons.length;
    }
    
    public void setInputActivations(double[] activations){
        
        if(activations.length != neurons.length){
            //throw error
        }else{
            for(int i = 0; i< neurons.length; i++){
                neurons[i].setActivation(activations[i]);
            }
        }
        
        
    }
    
    public void computeActivations(Layer previousLayer){
        for(int i = 0; i < neurons.length; i++){
            neurons[i].computeActivation(previousLayer);
        }
    }
    
    public double[] getActivations(){
        double[] result = new double[neurons.length];
        for(int i = 0; i < neurons.length; i++){
            result[i] = neurons[i].getActivation();
        }
        return result;
    }
    
    
    
}
