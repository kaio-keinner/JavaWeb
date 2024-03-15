package seila;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

/**
 *
 * @author Kaio
 */
public class exe03bla {
    private int num1;
    private int num2;
    private int num3;
    private String resultado;

    // getters e setters

    public void verificar() {
        int maior = Math.max(Math.max(num1, num2), num3);
        double media = (num1 + num2 + num3) / 3.0;
        String paridade = (num1 + num2 + num3) % 2 == 0 ? "par" : "ímpar";
        resultado = "Maior número: " + maior + ", Média: " + media + ", A soma é " + paridade;
    }
}