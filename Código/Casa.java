public class Casa implements IModulo {
    @Override
    public void conectar() {
        System.out.println("CASA: Conectada à rede de água e esgoto.");
    }

    @Override
    public void funcionar() {
        System.out.println("CASA: Moradores instalados.");
    }
}
