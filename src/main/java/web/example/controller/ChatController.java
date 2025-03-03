// src/main/java/web/example/controller/ChatController.java

package web.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ChatController {

    @GetMapping("/chat")
    public String showChat(Model model) {
        // You can pass any necessary data to the view here
        return "chat";
    }
}