public class Estrada implements IModulo {
    @Override
    public void conectar() {
        System.out.println("ESTRADA: Pavimentada e conectada aos bairros.");
    }

    @Override
    public void funcionar() {
        System.out.println("ESTRADA: Trânsito liberado para veículos.");
    }
}
