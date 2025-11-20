import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class userController {

    @Autowired
    private userDAO userDAO;

    @GetMapping("/register")
    public String showForm(Model model) {
        model.addAttribute("user", new user());
        return "register";
    }

    @PostMapping("/register")
    public String saveUser(@ModelAttribute("user") user user, Model model) {
        userDAO.saveUser(user);
        model.addAttribute("message", "User added successfully!");
        return "success";
    }
}