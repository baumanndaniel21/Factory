//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        FabricaVW golf = new LinhaMontagemGolf();
        golf.testarCarro();
        FabricaVW fusca1 = new LinhaMontagemFusca();
        fusca1.testarCarro();
    }
}