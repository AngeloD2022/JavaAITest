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
    
    
    
}
