import java.util.Iterator;

public class Censo {

    public static Integer contarSeguidoresAtivosInstagram(Instagram instagram) {
        int quantidade = 0;
        for (Seguidor seguidor : instagram) {
            if (seguidor.isAtivo()){
                quantidade++;
            }
        }
        return quantidade;
    }

    public static Integer contarTotalSeguidoresInstagram(Instagram instagram) {
        int quantidade = 0;
        for (Iterator a = instagram.iterator(); a.hasNext(); ) {
                quantidade++;
                a.next();
        }
        return quantidade;
    }
}
