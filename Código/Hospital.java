public class Hospital implements IModulo {
    @Override
    public void conectar() {
        System.out.println("HOSPITAL: Conectado à rede de emergência.");
    }

    @Override
    public void funcionar() {
        System.out.println("HOSPITAL: Pronto-socorro aberto para pacientes.");
    }
}