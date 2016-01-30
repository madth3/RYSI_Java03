package rysi.web.holaweb.control;

import java.math.BigDecimal;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import rysi.web.holaweb.entidades.Articulo;

/**
 *
 * @author jaguilar
 */
@Controller
public class HolaController {
    
    @RequestMapping("/hola")
    public ModelAndView decirHola() {
        ModelAndView mav = new ModelAndView("saludo.jsp");
        mav.addObject("mensaje", "Hola mundo en Spring MVC");
        
        Articulo art = new Articulo();
        art.setClave("ABCD0001");
        art.setNombre("Articulo de Prueba");
        art.setPrecioUnitario(new BigDecimal("123.99"));
        art.setFechaIntroduccion(new Date(115, 9, 12));
        mav.addObject("articulo", art);
        return mav;
    }
    
    @RequestMapping(value = "/agregarArticulo", 
            method = RequestMethod.POST)
    public ModelAndView agregarArticulo(
            @RequestParam("clave") String clave,
            @RequestParam("nombre") String nombre,
            @RequestParam("precio") BigDecimal precioUnitario,
            @DateTimeFormat(pattern = "dd/MM/yyyy")
            @RequestParam("fechaIntroduccion") Date fechaIntroduccion) {
        ModelAndView mav = new ModelAndView("resultado.jsp");
        
        Articulo art = new Articulo();
        art.setClave(clave);
        art.setNombre(nombre);
        art.setPrecioUnitario(precioUnitario);
        art.setFechaIntroduccion(fechaIntroduccion);
        art.setExistencia(0);
        mav.addObject("articulo", art);
        return mav;
    }
}







