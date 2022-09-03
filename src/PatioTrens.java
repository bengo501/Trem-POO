//importação da clase ArrayList
import java.util.ArrayList;


//clase Patio Trens
//Essa classe representa o lugar onde
//os trens serão estacionadas
public class PatioTrens{


    //atributos da clase Patio Trens
    private ArrayList<Trem> trens; //Lista de arranjos dos trens


    //método construtor da classe Patio Trens
    public PatioTrens(){
        trens = new ArrayList<>(20);
    }


    //método Entrar
    //Esse método adiciona um trem ao pátio
    //utilizando o método entrar da clase ArrayList da biblioteca do Java
    public void entrar(Trem trem){
        trens.add(trem);
    }


    //método Sair
    //Esse método retira um trem do pátio
    public Trem sair(int id){
        Trem removida = null;
        for(int i=0;i<trens.size();i++){
            //se o trem 'i' tiver o id igual ao
            //que o usuário escreveu, então o trem
            //será removida
            if (trens.get(i).getIdent() == id){
                removida = trens.remove(i);
                break;
            }
        }
        return removida;
    }


    //método getter das informações dos trens
    //estacionadas no pátio
    public String getInfoTrens(){
        return null;
    }


    //método toString da clase Pátio Trens
    @Override
    public String toString() {
        String aux = "Pátio dos Trens\n\n";
        for(Trem l:trens){
            aux += l.toString()+"\n";
        }
        return aux;
    }
}