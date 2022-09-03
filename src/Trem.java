//importação da classe ArrayList
import java.util.ArrayList;

//clase Trem
public class Trem {
    //O Trem funciona a partir de agrupamentos de 
    //Locomotivas e Vagões
    //Essa classe trabalha com arranjos destes elementos
    //que formam um trem.
    //É utilizada a classe ArrayList da biblioteca do java.
    

    //atributos da clase Trem
    private int id; //identificador do Trem
    private ArrayList<Locomotiva> locomotivas; //lista de arranjos das locomotivas
    private ArrayList<Vagao> vagoes; //lista de arranjos dos vagões 


    //método construtor da clase Trem
    public Trem(int id,Locomotiva locomotiva){
        this.id = id;
        locomotivas = new ArrayList<>();
        vagoes = new ArrayList<>();
        engatarLocomotiva(locomotiva);
    }


    //método getter da identificação do Trem
    public int getIdent(){ 
        return id;
    }


    //método Engatar Locomotiva
    //esse método conecta as locomotivas 
    public boolean engatarLocomotiva(Locomotiva locomotiva){
        //se já tem algum vagão engatado, retornará falso
        if (vagoes.size()> 0){ 
            return false;
        }
        //se não tem nenhum vagão engatado, retornará true
        //e haverá a vinculação da locomotiva
        locomotivas.add(locomotiva);
        locomotiva.vincular(this);
        return true;
    }


    //método Engatar Vagão
    //esse método conecta os vagões 
    public boolean engatarVagao(Vagao vagao){
        //se o for atingido o limite de vagões ou o limite de peso máximo dos vagões
        //retornará false
        if (limiteDeVagoesAtingido() || pesoMaximoDosVagoesAtingido()){
            return false;
        }
        //se não, retornará true e haverá a vinculação do vagão
        vagoes.add(vagao);
        vagao.vincular(this);
        return true;
    }
    

    //método de Desengatar o vagão
    //Esse método desvincula o vagão do trem
    public Vagao desengatarVagao(){
        //se não existir algum vagão, retornará nulo
        if (vagoes.size() == 0){
            return null;
        }
        //se existir algum vagão
        //haverá a desvinculação do vagão selecionado
        Vagao aux = vagoes.remove(vagoes.size()-1);
        aux.desvincular();
        return aux;
    }


    //método toString da clase Trem
    public String toString(){
        String aux = "T"+id+"+";
        for(Locomotiva l:locomotivas){
            aux += "[L"+l.getIdentificador()+"]+";
        }
        for(Vagao v:vagoes){
            aux += "[V"+v.getId()+"]+";
        }
        return aux;
    }

    // Métodos auxiliares
    
    //méotodo Limite De Vagões Atingido
    //Esse método checa se o limite de vagões
    //foi atingido ou não
    private boolean limiteDeVagoesAtingido(){
        int qtdade = 0;
        for(Locomotiva l:locomotivas){
            qtdade += l.getNumeroMaximoVagoes();
        }
        return vagoes.size() >= qtdade;
    }

    private double pesoMaximoLocomotivasTracionam(){
        double peso = 0;
        double tx = 1.0;
        for(Locomotiva l:locomotivas){
            peso += l.getPesoMaximo() * tx;
            tx *= 0.9;
        }
        return peso;
    }

    private boolean pesoMaximoDosVagoesAtingido(){
        double peso = 0.0;
        for(Vagao v:vagoes){
            peso += v.getCargaMax();
        } 
        return peso >= pesoMaximoLocomotivasTracionam();
    }

}
