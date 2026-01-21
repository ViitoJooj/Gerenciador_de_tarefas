package gerenciador_de_tarefas.gerenciador.de.tarefas.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import tools.jackson.databind.ObjectMapper;

import java.util.ArrayList;
import java.util.List;

@RestController
public class Tarefas_controller {

    private final List<String> tasks = new ArrayList<>();

    private final ObjectMapper objectMapper;

    public Tarefas_controller(ObjectMapper objectMapper) {
        this.objectMapper = objectMapper;
    }

    @GetMapping(path = "/pagina")
    public ResponseEntity<String> helloWorld() throws Exception {
        tasks.add("minha tarefa");
        return ResponseEntity.ok(objectMapper.writeValueAsString(tasks));
    }
}
