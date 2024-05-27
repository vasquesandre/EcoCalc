/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package calculadoraGastos;

/**
 *
 * @author andre
 */
public class Combustivel {
    
    private float distancia;
    private float precoCombustivel;
    private float mediaConsumo;
    private float gastoFinal;
    
    public Combustivel() {
    
    }

    public float getDistancia() {
        return distancia;
    }

    public void setDistancia(float distancia) {
        this.distancia = distancia;
    }

    public float getPrecoCombustivel() {
        return precoCombustivel;
    }

    public void setPrecoCombustivel(float precoCombustivel) {
        this.precoCombustivel = precoCombustivel;
    }

    public float getMediaConsumo() {
        return mediaConsumo;
    }

    public void setMediaConsumo(float mediaConsumo) {
        this.mediaConsumo = mediaConsumo;
    }

    public float getGastoFinal() {
        return gastoFinal;
    }

    public void setGastoFinal(float gastoFinal) {
        this.gastoFinal = gastoFinal;
    }
    
    public float CalcularGastoCombustivel(float distancia, float precoCombustivel, float mediaConsumo) {
        float litros = distancia / mediaConsumo;
        float gastoTotal = precoCombustivel * litros;
        
        this.setGastoFinal(gastoTotal);
        
        return this.getGastoFinal();
    }
}
