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
@Named(value = "exer1b")
@Dependent
public class exer1b {

    /**
     * Creates a new instance of exer1b
     */
    
    private double peso;
    private double altura;
    private String resultado;
    public double imc;


    public void calcula() {
        if (peso <= 0 || altura <= 0) {
            resultado = "insira valores peso e altura.";
        } else {
            imc = peso / (altura * altura);
            imc = Math.round(imc * 100.0) / 100.0;
            resultado = " IMC é " + imc + ", que é considerado " +
                (imc < 18.5 ? "abaixo do peso" :
                (imc < 24.9 ? "peso normal" :
                (imc < 29.9 ? "sobrepeso" :
                (imc < 34.9 ? "obesidade grau 1" :
                (imc < 39.9 ? "obesidade grau 2" : "obesidade grau 3")))));
        }
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public String getResultado() {
        return resultado;
    }

    public void setResultado(String resultado) {
        this.resultado = resultado;
    }
}
