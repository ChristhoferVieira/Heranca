/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author christhofer.vieira
 */
public class Moto extends Terrestre{
    private String placa;
    
    public void ImprimeDadosMoto(){
        System.out.println("Placa: "+placa);
        System.out.println("N° de rodas: "+numRodas);
        System.out.println("Capacidade: "+capacidade);
        
    
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }
    
    
}
