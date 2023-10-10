package com.example.ApiRestConPaginacion.controllers;

import com.example.ApiRestConPaginacion.entity.Persona;
import com.example.ApiRestConPaginacion.service.PersonaServiceImpl;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping(path = "api/v1/persona")
public class PersonaControllerImpl extends BaseControllerImpl<Persona, PersonaServiceImpl> implements BaseController<Persona,Long> {


    @GetMapping("/search")
    public ResponseEntity<?> search(@RequestParam String filtro) {
        try {
            return ResponseEntity.status(HttpStatus.OK).body(service.search(filtro));
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("{\"error\":\"Error. Por favor intente más tarde.\"}");
        }
    }

    @GetMapping("/searchNative")
    public ResponseEntity<?> searchNative(@RequestParam String filtro) {
        try {
            return ResponseEntity.status(HttpStatus.OK).body(service.searchNative(filtro));
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("{\"error\":\"Error. Por favor intente más tarde.\"}");
        }
    }

    @GetMapping("/searchQuery")
    public ResponseEntity<?> searchQuery(@RequestParam String nombre,@RequestParam String apellido ) {
        try {
            return ResponseEntity.status(HttpStatus.OK).body(service.searchQuery(nombre,apellido));
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("{\"error\":\"Error. Por favor intente más tarde.\"}");
        }
    }
}