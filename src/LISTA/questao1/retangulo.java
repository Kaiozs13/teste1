package LISTA.questao1;

public class retangulo {
    double largura;
    double altura;

    public retangulo(double largura, double altura) {
        this.largura = largura;
        this.altura = altura;
    }
    
    
    
    double calculararea(){   
      return largura*altura;
      }
    
    double calcularperimetro(){   
      return 2*(largura+altura);
      }
    
    

    public double getLargura() {
        return largura;
    }

    public void setLargura(double largura) {
        this.largura = largura;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
    
}
