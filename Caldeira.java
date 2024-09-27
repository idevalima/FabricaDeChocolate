public class Caldeira {
    private boolean vazia;
    private boolean ferver;
    private static Caldeira instancia;
// O construtor tem que ser privado para que haja uma só instancia da caldeira
   private Caldeira(){
    this.vazia = true;
    this.ferver = false;
   }
//criar um método para retornar uma unica instancia, O método getinstancia e estatico
    public static Caldeira getInstancia(){
        if(instancia == null){
        instancia = new Caldeira();
         }
        return instancia;
}  
//Esse e o método para encher a caldeira
     public void encher(){
        if(vazia){ 
        System.out.println("A caldeira está sendo cheia com chocolate e leite ");
        vazia = false;
        ferver = false;
        } else {
        System.out.println("A caldeira já está cheia! ");
    }
}
//Criar um método para ferver a mistura 
    public void ferver(){
        if(!vazia && !ferver){
        System.out.println("A Mistura está sendo fervida! ");
        ferver = true;
        }else if(vazia){
        System.out.println("A caldeira está vazia, não é possivel ferver a mistura");
        }else{
        System.out.println("A mistura já está fervida");
        }
}
// criar o método drenar a mistura
    public void drenar(){
        if(!vazia && ferver){
            System.out.println("A mistura está sendo drenada");
            vazia = true;
            ferver= false;
        }else if(vazia){
            System.out.println("A caldeira está vazia, não há oque Drenar");
        }else{
            System.out.println("Ainda não foi fervido, não pode drenar!");
        }
    }
//Esses dois métodos e para verificar o estado da caldeira
    public boolean Vazia(){
        return vazia;
    }
    public boolean Ferver(){
        return ferver;
    }
}
