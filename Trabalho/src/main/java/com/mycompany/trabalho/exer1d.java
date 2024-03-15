/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSF/JSFManagedBean.java to edit this template
 */
package com.mycompany.trabalho;

import javax.inject.Named;
import javax.enterprise.context.Dependent;

/**
 *
 * @author Kaio
 */
@Named(value = "exer1d")
@Dependent
public class exer1d {

    /**
     * Creates a new instance of exer1d
     */
    public double salario;
    private String resultado;
    public double aumento;
    public double novoSalario;

    // getters e setters

    public void calcularAumento() {
        if (salario <= 0) {
            resultado = "Por favor, insira um valor válido para o salário.";
        } else {
            aumento = (salario <= 1000) ? 0.20 :
                             (salario <= 3000) ? 0.15 : 0.10;
            novoSalario = salario * (1 + aumento);
            novoSalario = Math.round(novoSalario * 100.0) / 100.0;
            resultado = "O novo salário após o aumento é R$ " + novoSalario;
        }
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getResultado() {
        return resultado;
    }

    public void setResultado(String resultado) {
        this.resultado = resultado;
    }

    public double getAumento() {
        return aumento;
    }

    public void setAumento(double aumento) {
        this.aumento = aumento;
    }

    public double getNovoSalario() {
        return novoSalario;
    }

    public void setNovoSalario(double novoSalario) {
        this.novoSalario = novoSalario;
    }
    
    
}