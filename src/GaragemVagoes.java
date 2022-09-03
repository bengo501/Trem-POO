//importação da clase ArrayList
import java.util.ArrayList;


//clase Garagem Vagões
//Essa classe representa o lugar onde
//os vagões serão estacionadas
public class GaragemVagoes{


    //atributos da clase Garagem Locomotivas
    private ArrayList<Vagao> vagoes; //lista de arranjos dos vagões


    //método construtor da classe Garagem Vagões
    public GaragemVagoes(){
        vagoes = new ArrayList<>(20);
    }


    //método Entrar
    //Esse método adiciona um vagão a garagem
    //utilizando o método entrar da clase ArrayList da biblioteca do Java
    public void entrar(Vagao vagao){
        vagoes.add(vagao);
    }


    //método Sair
    //Esse método retira um vagão da garagem
    public Vagao sair(int id){
        Vagao removida = null;
        for(int i=0;i<vagoes.size();i++){
            //se o vagão 'i' tiver o id igual ao
            //que o usuário escreveu, então o vagão
            //será removida
            if (vagoes.get(i).getId() == id){
                removida = vagoes.remove(i);
                break;
            }
        }
        return removida;
    }


    //método getter das informações dos vagões
    //estacionadas na garagem
    public static String getInfoVagoes(){
        return null;
    }


    //método toString da clase Garage Vagões
    @Override
    public String toString() {
        String aux = "Garagem dos vagões\n\n";
        for(Vagao l:vagoes){
            aux += l.toString()+"\n";
        }
        return aux;
    }
}