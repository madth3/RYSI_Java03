package rysi.web.holaweb.repositorios;

import java.util.List;
import rysi.web.holaweb.entidades.Articulo;

/**
 *
 * @author jaguilar
 */
public interface ArticulosRepository {

    Articulo getArticulo(String clave);
    
    List<Articulo> getTodos();
    
}
