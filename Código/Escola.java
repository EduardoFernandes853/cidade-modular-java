public class Escola implements IModulo {
    @Override
    public void conectar() {
        System.out.println("ESCOLA: Conectada à rede de energia e estradas.");
    }

    @Override
    public void funcionar() {
        System.out.println("ESCOLA: Portões abertos, aulas iniciadas.");
    }
}