
package Modelo;

public class Validacao extends absPropriedades
{
    
    public Validacao(String valor)
    {
        super(valor);
    }
    
      @Override
    public void Executar() 
    {
        this.mensagem = "";
        
        try 
        {
            this.valorTemperatura = Double.parseDouble(this.valor);
        } catch (Exception e) 
        {
            this.mensagem = "Número inválido";
            
        }
    }
    
    
}
