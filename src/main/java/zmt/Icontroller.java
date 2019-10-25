package zmt;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("user")
public class Icontroller {

    @RequestMapping("asd")
    public String Haha(String name,Model model){
        System.out.print(name);
        System.out.print(name);
        model.addAttribute("name",name);
        return "chenggong";
    }
}
