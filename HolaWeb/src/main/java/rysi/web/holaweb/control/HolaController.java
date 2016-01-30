package rysi.web.holaweb.control;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

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
        return mav;
    }
}







