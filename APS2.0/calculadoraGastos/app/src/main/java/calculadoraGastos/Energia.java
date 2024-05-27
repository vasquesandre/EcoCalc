package calculadoraGastos;


/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author tulio.sarto
 */
public class Energia {

 
    private float diasDeUso;
    private float horasDeUso;
    private float wattsAparelho;
    private float kwhAparelho;
    private float custoKwh;
    private float gastoTotal;
    private String aparelho;

    public Energia() {
        
    }
    
    

    public float getDiasDeUso() {
        return diasDeUso;
    }

    public void setDiasDeUso(int diasDeUso) {
        this.diasDeUso = diasDeUso;
    }

    public float getHorasDeUso() {
        return horasDeUso;
    }

    public void setHorasDeUso(float horasDeUso) {
        this.horasDeUso = horasDeUso;
    }

    public float getWattsAparelho() {
        return wattsAparelho;
    }

    public void setWattsAparelho(float wattsAparelho) {
        this.wattsAparelho = wattsAparelho;
    }

    public float getKwhAparelho() {
        return kwhAparelho;
    }

    public void setKwhAparelho(float kwhAparelho) {
        this.kwhAparelho = kwhAparelho;
    }

    public float getCustoKwh() {
        return custoKwh;
    }

    public void setCustoKwh(float custoKwh) {
        this.custoKwh = custoKwh;
    }

    public float getGastoTotal() {
        return gastoTotal;
    }

    public void setGastoTotal(float gastoTotal) {
        this.gastoTotal = gastoTotal;
    }

    public String getAparelho() {
        return aparelho;
    }

    public void setAparelho(String aparelho) {
        this.aparelho = aparelho;
    }
    
    public float Calcular(float valorDias, float valorHoras, float valorWatts, float valorKwh) {
        float kwhAparelhoLocal = (valorWatts * valorHoras * valorDias) / 1000;
        float gastoTotalLocal = valorKwh * kwhAparelhoLocal;
    
        this.setKwhAparelho(kwhAparelhoLocal);
        this.setGastoTotal(gastoTotalLocal);
        
        return this.getGastoTotal();
    }
    
    
}




