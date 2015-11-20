package cavaloBDD;

public class veterinario implements genericClass{
      
    @Override
    public String getNome(){
        return "Veterinario";
    }
    
    public double cobraConsulta(double valorConsulta){
        return valorConsulta;
    }
}
