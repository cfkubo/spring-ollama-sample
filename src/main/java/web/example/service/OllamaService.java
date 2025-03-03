// src/main/java/web/example/service/OllamaService.java

package web.example.service;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class OllamaService {

    private final RestTemplate restTemplate = new RestTemplate();

    public String chat(String input) {
        // Make a request to the Ollama model API here
        // For example:
        return restTemplate.postForObject("https://api.ollama.com/chat", input, String.class);

        // Placeholder implementation
        // return "Response from Ollama: " + input;
    }
}
