package br.senac.sp.aula3;

public class Carro {

    private static String fabricante;
    private String[] rodas;
    private String cor;
    private String modelo;
    private int velAtual;
    private int max_gasolina;
    private int gasolina;

    public int getMax_gasolina() {
        return max_gasolina;
    }

    public void setMax_gasolina(int max_gasolina) {
        this.max_gasolina = max_gasolina;
    }

    public int getGasolina() {
        return gasolina;
    }

    public void setGasolina(int gasolina) {
        this.gasolina = gasolina;
    }

    public static String getFabricante() {
        return fabricante;
    }

    public static void setFabricante(String fabricante) {
        Carro.fabricante = fabricante;
    }

    public String[] getRodas() {
        return rodas;
    }

    public void setRodas(String[] rodas) {
        this.rodas = rodas;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getVelAtual() {
        return velAtual;
    }

    public void setVelAtual(int velAtual) {
        this.velAtual = velAtual;
    }

    public Carro() {
        this.max_gasolina = 40;
        this.gasolina = 20;

    }

    public Carro(int gas) {
        this.max_gasolina = gas;

    }

    public void abastece(int a) {

        if (gasolina + a <= max_gasolina) {
            gasolina += a;
            //System.out.printf("Abastecimento concluído. Qtde de gasolina: %d litros %n", gasolina + a);
        } else {
            gasolina = 40;

        }

    }

    public String descreve() {

        String msg = "";

        if (modelo != null && cor != null) {
            msg = "Um " + modelo + " na cor " + cor;
        }

        if (cor == null) {

            msg = "Um " + modelo;
        }

        if (modelo == null) {

            msg = "Um carro";
        }

        return msg;
    }

}
