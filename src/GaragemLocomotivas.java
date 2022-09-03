//importação da clase ArrayList
import java.util.ArrayList;


//clase Garagem Locomotivas
//Essa classe representa o lugar onde
//as locomotivas serão estacionadas
public class GaragemLocomotivas{


    //atributos da clase Garagem Locomotivas
    private ArrayList<Locomotiva> locomotivas; //lista de arranjos das locomotivas


    //método construtor da classe Garagem Locomotivas
    public GaragemLocomotivas(){
        locomotivas = new ArrayList<>(20);
    }


    //método Entrar
    //Esse método adiciona uma locomotiva ao estacionamento
    //utilizando o método entrar da clase ArrayList da biblioteca do Java
    public void entrar(Locomotiva locomotiva){
        locomotivas.add(locomotiva);
    }


    //método Sair
    //Esse método retira uma locomotiva da garagem
    public Locomotiva sair(int id){
        Locomotiva removida = null;
        for(int i=0;i<locomotivas.size();i++){
            //se a locomotiva 'i' tiver o id igual ao
            //que o usuário escreveu, então a locomotiva
            //será removida
            if (locomotivas.get(i).getIdentificador() == id){
                removida = locomotivas.remove(i);
                break;
            }
        }
        return removida;
    }


    //método getter das informações das locomotivas
    //estacionadas na garagem
    public static String getInfoLocomotivas(){
        return null;
    }


    //método toString da clase Garage Locomotivas
    @Override
    public String toString() {
        String aux = "Garagem das locomotivas\n\n";
        for(Locomotiva l:locomotivas){
            aux += l.toString()+"\n";
        }
        return aux;
    }
}