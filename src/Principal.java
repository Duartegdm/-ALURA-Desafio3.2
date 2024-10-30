public class Principal {

    public static void main(String[] args) {
        Cachorro baruk = new Cachorro();
        Gato belinha = new Gato();
        Animal animal = new Animal();

        baruk.emitirSom();
        belinha.emitirSom();
        animal.emitirSom();

        baruk.roerOsso();
        belinha.arranharMoveis();
    }
}
