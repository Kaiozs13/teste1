
package kaiobas;

public class pessoa {
    private String nome;
    private int idade;
    
    
   

    public pessoa(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
    
     void apresentar(){
        
       System.out.println("O profesorr"+ nome+",tem "+idade+ "e da aula da disciplina"+displina)
        
    
    }
    
    
}
