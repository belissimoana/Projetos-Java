
package Modelo;

public class Fahrenheit extends absPropriedades
{
    
    public Fahrenheit(Double valorTemperatura) 
    {
        super(valorTemperatura);
    }
    
      @Override
    public void Executar() 
    {
        this.resultado = (this.valorTemperatura - 32) / 1.8;
    }
    
    
}
