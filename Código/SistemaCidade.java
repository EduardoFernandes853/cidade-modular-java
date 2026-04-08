import java.util.ArrayList;
import java.util.List;

public class SistemaCidade {
    public static void main(String[] args) {
        System.out.println("=== INICIANDO O SISTEMA DA CIDADE ===\n");

        IModulo estrada = new Estrada();
        IModulo escola = new Escola();
        IModulo casa = new Casa();
        IModulo ponte = new Ponte();
        IModulo hospital = new Hospital();

        List<IModulo> modulosDaCidade = new ArrayList<>();
        modulosDaCidade.add(estrada);
        modulosDaCidade.add(escola);
        modulosDaCidade.add(casa);
        modulosDaCidade.add(ponte);
        modulosDaCidade.add(hospital);

        System.out.println(">> ETAPA 1: Conectando os Módulos...");
        for (IModulo modulo : modulosDaCidade) {
            modulo.conectar();
        }

        System.out.println("\n>> ETAPA 2: Colocando a cidade para funcionar...");
        for (IModulo modulo : modulosDaCidade) {
            modulo.funcionar();
        }
    }
}