package com.JavaSpringEmpresa2223.EmpresaS.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController //puedo agregar anotaciones adicionales para agregar diferentes páginas para varios finales de URL
public class ControladorRest {
    @GetMapping("/") //me permite definir Cual va a ser la ruta para que responda el método en esta caso le colocamos home
    public String saludar(){
        return "Mamá estoy triunfando con mi primera página en spring boot";
    }
}
