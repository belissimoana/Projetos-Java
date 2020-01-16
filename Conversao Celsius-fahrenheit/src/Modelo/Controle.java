
package Modelo;

import java.text.DecimalFormat;

public class Controle extends absPropriedades
{
    
    public Controle(String valor, String tipoCalculo) 
    {
        super(valor, tipoCalculo);
    }
    
      @Override
    public void Executar() 
    {
        this.mensagem = "";
        Validacao validacao = new Validacao (this.valor);
        if(validacao.toString().equals(""))
        {
            DecimalFormat df = new DecimalFormat("0.##");
            if(this.tipoCalculo.equals("CF"))
            {
                Celsius celsius = new Celsius(validacao.valorTemperatura);
                this.resposta= df.format(celsius.resultado);
            }
            if(this.tipoCalculo.equals("FC"))
            {
                Fahrenheit fahrenheit =  new Fahrenheit(validacao.valorTemperatura);
                this.resposta = df.format(fahrenheit.resultado);
            }
            
             else
            {
                this.mensagem = validacao.toString();
            }
            
        }
        
        
    }
    
    
}
