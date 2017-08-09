package hiwotab.springboot_02.controller;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

// controller class is used as intermidate to our model  to the data base
@Controller
public class HomeController {
        @RequestMapping("/")
        public String showHomePage() {

            return "hometemplate";
        }


        /*@RequestMapping("/")
        public String showHomePage(Model model) {
            model.addAttribute("myvar","Say hello to the people.");
            return "hometemplate";
        }*/
        /*@GetMapping("/")
        public String showIndexPage() {

        return "index";
         }*/

       /* // TO show the the form that is used to enter tv shows
        @GetMapping("/addName")
        public String addNameInfo(Model model) {
            model.addAttribute("newName", new PrintName());
            return "addName";
        }
        // TO submit the list of attribute values to the data base
        @PostMapping("/addTvShow")
        public String addNameInfo(@Valid @ModelAttribute("newName") PrintName printName, BindingResult bindingResult)throws ParseException {
            if (bindingResult.hasErrors()) {
                return "addName";
            }

            return "dispNameInfo";
        }*/
  }

