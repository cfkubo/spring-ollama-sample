// src/main/java/web/example/ui/ChatUI.java

package web.example.ui;

import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.router.Route;

import web.example.service.OllamaService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
@Route("chat")
public class ChatUI extends VerticalLayout {

    @Autowired
    private OllamaService ollamaService;

    public ChatUI() {
        TextField userInput = new TextField("Type a message...");
        Button sendButton = new Button("Send");
        Div messages = new Div();

        sendButton.addClickListener(event -> {
            String input = userInput.getValue();
            String response = ollamaService.chat(input);
            messages.add(new Div(response));
            userInput.clear();
        });

        add(messages, userInput, sendButton);
    }
}