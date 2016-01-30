package rysi.web.holaweb.repositorios;

import rysi.web.holaweb.entidades.Articulo;

/**
 *
 * @author jaguilar
 */
public interface ArticulosRepository {

    Articulo getArticulo(String clave);
    
}
