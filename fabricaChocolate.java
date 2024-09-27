public class fabricaChocolate{
    public static void main(String[] args){
        Caldeira caldeira = Caldeira.getInstancia();
// funçao para testar os métodos
    //A função não deve funcionar se a caldeira estiver vazia
        caldeira.drenar();
    //A funçao não deve funcionar se a caldeira estiver vazia    
        caldeira.drenar();
    //Se a caldeira estiver vazia vai encher    
        caldeira.encher();
    //se a caldeira estiver cheia não deve encher   
        caldeira.encher();
    //Se a caldeira estiver cheia vai ferver    
        caldeira.ferver();
    //Se a caldeira estiver vazia não deve ferver
        caldeira.ferver();
    }
} 