
package Calculadora_jframe;


public class Calculo extends Operacoes implements interfaceCalculo {
   
    double resultado;
    private String resp;
    public Calculo(){
        resultado = 0;
    }
    
    @Override
    public double Somar(double valor1,double valor2) {
        return resultado=valor1+valor2;
    }

    @Override
    public double Mult(double valor1,double valor2) {
       return resultado=valor1*valor2;
    }

    @Override
    public double Div(double valor1,double valor2) {
        if(valor2 == 0){
            resp="Error: Divisão por 0";
            
        }
        return resultado=valor1/valor2;
    }

    @Override
    public double Subtrair(double valor1,double valor2) {
        return resultado=valor1-valor2;
    }
   
   
    
}
