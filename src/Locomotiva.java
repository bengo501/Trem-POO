//clase Locomotiva
//essa classe representa as locomotivas
//que farão parte do Trem
public class Locomotiva {
    //atributos da clase Locomotiva
    private int identificador; //identificador de uma locomotiva
    private double pesoMaximo; //peso máximo que a locomotiva consegue puxar
    private int numeroMaximoVagoes; //número máximo de vagões que uma locomotiva consegue tracionar
    private Trem trem; //referência ao trem


    //método construtor da clase Locomotiva
    public Locomotiva(int identificador, double pesoMaximo, int nroMaxVagoes) {
        this.identificador = identificador;
        this.pesoMaximo = pesoMaximo;
        this.numeroMaximoVagoes = numeroMaximoVagoes;
        this.trem = null;
    }


    //método getter do Identificador das locomotivas
    public int getIdentificador() {
        return identificador;
    }


    //método getter do Peso Máximo que
    //uma locomotiva poderá puxar
    public double getPesoMaximo() {
        return pesoMaximo;
    }


    //método getter do Número máximo de Vagões que
    //uma locomotiva poderá tracionar
    public int getNumeroMaximoVagoes() {
        return numeroMaximoVagoes;
    }


    //método getter do Trem
    public Trem getTrem() {
        return trem;
    }


    //método Vincula
    public void vincular(Trem trem){
        this.trem = trem;
    }

    @Override
    public String toString() {
        return "Locomotiva [identificador=" + identificador + ", numeroMaximoVagoes=" + numeroMaximoVagoes + ", pesoMaximo="
                + pesoMaximo + "]";
    }
}
