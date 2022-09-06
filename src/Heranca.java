/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author christhofer.vieira
 */
public class Heranca {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Automovel carro = new Automovel();
        Automovel moto = new Automovel();
        
        carro.setNumPlaca("GRO-9585");
        carro.setNumPortas(3);
        carro.setNumRodas(4);
        carro.setCapacidade(5);
        
        moto.setNumPlaca("AVA-6699");
        moto.setCapacidade(2);
        moto.setNumPortas(0);
        moto.setNumRodas(2);
        
        
        carro.ImprimeDadosCarro();
    }
    
}
