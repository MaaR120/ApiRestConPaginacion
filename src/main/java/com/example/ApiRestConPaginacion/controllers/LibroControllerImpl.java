package com.example.ApiRestConPaginacion.controllers;

import com.example.ApiRestConPaginacion.entity.Libro;
import com.example.ApiRestConPaginacion.service.LibroServiceImpl;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping(path = "api/v1/libro")
public class LibroControllerImpl extends BaseControllerImpl<Libro, LibroServiceImpl> implements BaseController<Libro,Long>{
}
