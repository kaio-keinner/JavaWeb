package com.mycompany.trabalho;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSF/JSFManagedBean.java to edit this template
 */

import javax.inject.Named;
import javax.enterprise.context.Dependent;

/**
 *
 * @author Kaio
 */
@Named(value = "exer1c")
@Dependent
public class exer1c {

    /**
     * Creates a new instance of exer1c
     */
    private double investimentoInicial;
    private double taxaJurosAnual;
    private int periodo;
    private String resultado;

    // getters e setters

    public void calculodocapeta() {
        resultado = (investimentoInicial <= 0 || taxaJurosAnual <= 0 || periodo <= 0) ? 
            "insira valore investimento inicial " :
            "O valor do investimento depois " + periodo + " anos é " + 
            Math.round(investimentoInicial * Math.pow(1 + taxaJurosAnual / 100, periodo) * 100.0) / 100.0;
    }
   

    public double getInvestimentoInicial() {
        return investimentoInicial;
    }

    public void setInvestimentoInicial(double investimentoInicial) {
        this.investimentoInicial = investimentoInicial;
    }

    public double getTaxaJurosAnual() {
        return taxaJurosAnual;
    }

    public void setTaxaJurosAnual(double taxaJurosAnual) {
        this.taxaJurosAnual = taxaJurosAnual;
    }

    public int getPeriodo() {
        return periodo;
    }

    public void setPeriodo(int periodo) {
        this.periodo = periodo;
    }

    public String getResultado() {
        return resultado;
    }

    public void setResultado(String resultado) {
        this.resultado = resultado;
    }
    
    
}