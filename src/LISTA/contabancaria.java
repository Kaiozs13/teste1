package LISTA;
public class contabancaria {
    
    private double numero;
    private double saldo;
    private String titular;
    private double valor;

    public contabancaria(double numero, double saldo, String titular, double valor) {
        this.numero = numero;
        this.saldo = saldo;
        this.titular = titular;
        this.valor = valor;
    }

    public double getNumero() {
        return numero;
    }

    public void setNumero(double numero) {
        this.numero = numero;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }
    
    
    
    void depositar(){
        System.out.println(valor+"Valor depositado");
      
    }
    
    
    
    
}