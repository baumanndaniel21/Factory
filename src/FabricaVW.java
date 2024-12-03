abstract class FabricaVW {
    public abstract Carro criarCarro();

    public void testarCarro(){
        Carro carro = criarCarro();
        carro.dirigir();

    }

}
