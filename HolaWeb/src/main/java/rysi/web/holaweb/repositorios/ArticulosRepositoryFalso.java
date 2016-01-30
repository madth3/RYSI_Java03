package rysi.web.holaweb.repositorios;

import java.math.BigDecimal;
import java.util.Date;
import org.springframework.stereotype.Repository;
import rysi.web.holaweb.entidades.Articulo;

/**
 *
 * @author jaguilar
 */
@Repository
public class ArticulosRepositoryFalso implements ArticulosRepository {

    @Override
    public Articulo getArticulo(String clave) {
        Articulo art = new Articulo();
        art.setClave(clave);
        art.setNombre("Articulo de Prueba");
        art.setPrecioUnitario(new BigDecimal("123.99"));
        art.setFechaIntroduccion(new Date(115, 9, 12));
        return art;
    }
}
