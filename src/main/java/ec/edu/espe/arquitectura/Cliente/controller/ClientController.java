package ec.edu.espe.arquitectura.Cliente.controller;

import ec.edu.espe.arquitectura.Cliente.service.ClientService;
import ec.edu.espe.arquitectura.Cliente.soap.*;
import lombok.Data;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@Slf4j
@RestController
@Data
@RequestMapping("/api/v1/user")
public class ClientController {

    @Autowired
    private ClientService clientService;


    @PostMapping("/login")
    public ResponseEntity login(@RequestBody LoginSerializer loginSerializer){
        try {
            LoginResponse response = this.clientService.login(loginSerializer);
            return ResponseEntity.ok(response.getUserSerializer());
        }catch (Exception e){
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(e.getMessage());
        }


    }


    @PostMapping("/")
    public ResponseEntity create(@RequestBody UserCreationSerializer userSerializer){
        try {
            CreateResponse response = this.clientService.create(userSerializer);
            return ResponseEntity.ok(response.getUser());
        }catch (Exception e){
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(e.getMessage());
        }
    }


    @DeleteMapping("/{id}/")
    public ResponseEntity remove(@PathVariable Long id){
        try {
            RemoveResponse response = this.clientService.remove(id);
            return ResponseEntity.ok(response.getStatus());
        }catch (Exception e){
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(e.getMessage());
        }
    }
}