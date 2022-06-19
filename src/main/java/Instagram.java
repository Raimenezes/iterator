import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Instagram implements Iterable<Seguidor> {

    private List<Seguidor> seguidores =  new ArrayList<Seguidor>();

    public Instagram(Seguidor... seguidores) {
        this.seguidores = Arrays.asList(seguidores);
    }

    @Override
    public Iterator<Seguidor> iterator() {
        return seguidores.iterator();
    }
}
