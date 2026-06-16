/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.giffoni.pedro.ingressocinema;

/**
 *
 * @author Pedro
 */
public class IngressoMeia extends Ingresso{

    public IngressoMeia(double valor, String nomeFilme, String tipoAudio){
        super(valor,nomeFilme, tipoAudio);
    }
    
    @Override
    public double getValorReal() {
        return valor / 2; // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

    
    
    
    
    
}
