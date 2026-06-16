/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.giffoni.pedro.ingressocinema;

/**
 *
 * @author Pedro
 */
public class Ingresso {
    protected double valor;
    protected String nomeFilme;
    protected String tipoAudio;


    public Ingresso(double valor, String nomeFilme, String tipoAudio) {
        this.valor = valor;
        this.nomeFilme = nomeFilme;
        this.tipoAudio = tipoAudio;
    }
    public double getValorReal(){
        return valor;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public String getNomeFilme() {
        return nomeFilme;
    }

    public void setNomeFilme(String nomeFilme) {
        this.nomeFilme = nomeFilme;
    }

    public String getTipoAudio() {
        return tipoAudio;
    }

    public void setTipoAudio(String tipoAudio) {
        this.tipoAudio = tipoAudio;
    }



    public void exibirInformacoes(){
        System.out.println("Filme: " + nomeFilme);
        System.out.println("Audio: " + tipoAudio);
        System.out.println("Valor real: R$ " + String.format("%.2f", getValorReal()));
    
    }
}


