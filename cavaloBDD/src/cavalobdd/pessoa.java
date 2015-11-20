package cavalobdd;

public class pessoa implements genericClass{
    
    private cavalo cavalo;
    
    public pessoa(){
        this.cavalo = new cavalo();
    }
    @Override
    public String getNome() {
        return "Nome";
    }
    
    public cavalo getCavalo(){
        return this.cavalo;
    }
}