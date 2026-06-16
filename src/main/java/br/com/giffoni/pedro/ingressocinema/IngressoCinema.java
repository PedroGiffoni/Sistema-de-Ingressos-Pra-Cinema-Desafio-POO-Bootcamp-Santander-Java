/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package br.com.giffoni.pedro.ingressocinema;

/**
 *
 * @author Pedro
 */
public class IngressoCinema {

    public static void main(String[] args) {
       
        Ingresso ingressoNormal = new Ingresso(30.00, "Avatar", "Dublado");
        IngressoMeia ingressoMeia = new IngressoMeia(30.00, "Avatar", "Legendado");
        IngressoFamilia ingressoFamilia = new IngressoFamilia(30.00, "Avatar", "Dublado", 4);
        
        System.out.println("INGRESSO NORMAL");
        ingressoNormal.exibirInformacoes();
        
        System.out.println("===================");

        System.out.println("INGRESSO MEIA");
        ingressoMeia.exibirInformacoes();        
        
        System.out.println("===================");

        System.out.println("INGRESSO FAMILIA");
        ingressoFamilia.exibirInformacoes();
    }
}
