package controllerquery;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1")
public class QueryController {
    @GetMapping("/ciao")
    public String hello(@RequestParam String name,@RequestParam String location){
        return "Ciao " + name + ", com'è il tempo in " + location + "?";
    }
}
