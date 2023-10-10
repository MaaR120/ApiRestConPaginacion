package com.example.ApiRestConPaginacion.controllers;

import com.example.ApiRestConPaginacion.entity.Autor;
import com.example.ApiRestConPaginacion.service.AutorServiceImpl;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping(path = "api/v1/autor")
public class AutorControllerImpl extends BaseControllerImpl<Autor, AutorServiceImpl> implements BaseController<Autor,Long>{
}