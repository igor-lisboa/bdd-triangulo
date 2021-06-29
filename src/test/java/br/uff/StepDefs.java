package br.uff;

import static org.junit.jupiter.api.Assertions.assertEquals;

import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;

public class StepDefs {
    private Triangulo trianguloClass = new Triangulo();
    private int num1, num2, num3;
    private String retorno;

    @Dado("Que os ints escolhidos foram {int}, {int} e {int}")
    public void que_os_ints_escolhidos_foram_e(Integer int1, Integer int2, Integer int3) {
        this.num1 = int1;
        this.num2 = int2;
        this.num3 = int3;
    }

    @Quando("Eu verifico o triangulo")
    public void eu_verifico_o_triangulo() {
        this.retorno = trianguloClass.verificaTriangulo(this.num1, this.num2, this.num3);
    }

    @Entao("Eu confirmo que eh equilatero lendo a mensagem {string}")
    public void eu_confirmo_que_eh_equilatero_lendo_a_mensagem(String string) {
        assertEquals("O triangulo eh equilatero", this.retorno);
    }

    @Entao("Eu confirmo que eh isosceles lendo a mensagem {string}")
    public void eu_confirmo_que_eh_isosceles_lendo_a_mensagem(String string) {
        assertEquals("O triangulo eh isosceles", this.retorno);
    }

    @Entao("Eu confirmo que eh escaleno lendo a mensagem {string}")
    public void eu_confirmo_que_eh_escaleno_lendo_a_mensagem(String string) {
        assertEquals("O triangulo eh escaleno", this.retorno);
    }

    @Entao("Eu confirmo que nao eh triangulo lendo a mensagem {string}")
    public void eu_confirmo_que_nao_eh_triangulo_lendo_a_mensagem(String string) {
        assertEquals("Nao eh um triangulo", this.retorno);
    }
}
