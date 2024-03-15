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
@Named(value = "bean")
@Dependent
public class Bean {
    
    /**
     * Creates a new instance of Bean
     */

    private int num1;
    private int num2;
    private int num3;
    private String resultado;
    public double media;
    public String fuitapeado;
    

    
    // ##################################### EXER 1 a ###############################################
      public void verificar() {
        int maior = Math.max(Math.max(num1, num2), num3);
        
        media = (num1 + num2 + num3) / 3.0;
        
        fuitapeado = (num1 + num2 + num3) % 2 == 0 ? "par" : "ímpar";
        resultado = "Maior número: " + maior + ", Média: " + media + ", A soma é " + fuitapeado;        
    }
    // ##################################### EXER 1 a ###############################################

// ##################################### EXER 1 a ###############################################
    public int getNum1() {
        return num1;
    }

    public void setNum1(int num1) {
        this.num1 = num1;
    }

    public int getNum2() {
        return num2;
    }

    public void setNum2(int num2) {
        this.num2 = num2;
    }

    public int getNum3() {
        return num3;
    }

    public void setNum3(int num3) {
        this.num3 = num3;
    }

    public String getResultado() {
        return resultado;
    }

    public void setResultado(String resultado) {
        this.resultado = resultado;
    }
// ##################################### EXER 1 a ###############################################
  
}