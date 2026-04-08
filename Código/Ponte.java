public class Ponte implements IModulo {
    @Override
    public void conectar() {
        System.out.println("PONTE: Estrutura finalizada sobre o rio.");
    }

    @Override
    public void funcionar() {
        System.out.println("PONTE: Passagem segura garantida.");
    }
}