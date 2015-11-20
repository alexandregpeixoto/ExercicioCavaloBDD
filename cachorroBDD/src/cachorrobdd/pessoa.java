package cachorrobdd;

public class pessoa implements genericClass{
    
    private cachorro dog;
    
    public pessoa(){
        this.dog = new cachorro();
    }
    @Override
    public String getNome() {
        return "Dave Atkins";
    }
    
    public cachorro getDog(){
        return this.dog;
    }
}