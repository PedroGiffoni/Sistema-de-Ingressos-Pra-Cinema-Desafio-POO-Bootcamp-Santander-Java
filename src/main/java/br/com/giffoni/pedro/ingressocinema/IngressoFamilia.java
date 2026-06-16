/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.giffoni.pedro.ingressocinema;

/**
 *
 * @author Pedro
 */
public class IngressoFamilia extends Ingresso{
    
    private int numeroPessoas;
    public IngressoFamilia(double valor, String nomeFilme, String tipoAudio , int numeroPessoas){
        super(valor, nomeFilme, tipoAudio);
        this.numeroPessoas = numeroPessoas;
    }

@Override
    public double getValorReal() {
        double total = valor * numeroPessoas; 
        
        if( numeroPessoas >= 3){
            total = total * 0.95;
        }
        return total;
    }

}