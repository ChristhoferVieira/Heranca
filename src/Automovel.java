/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author christhofer.vieira
 */
public class Automovel extends Terrestre{
    private String numPlaca;
    private int numPortas;
    
    public void ImprimeDadosCarro(){
        System.out.println("Placa: "+numPlaca);
        System.out.println("Nº de Portas: "+numPortas);
        System.out.println("Nº de rodas: "+numRodas);
        System.out.println("Capacidade: "+capacidade);
        
    }
    

    public String getNumPlaca() {
        return numPlaca;
    }

    public void setNumPlaca(String numPlaca) {
        this.numPlaca = numPlaca;
    }

    public int getNumPortas() {
        return numPortas;
    }

    public void setNumPortas(int numPortas) {
        this.numPortas = numPortas;
    }
}
