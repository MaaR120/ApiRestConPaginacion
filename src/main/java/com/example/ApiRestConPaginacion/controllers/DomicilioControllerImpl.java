package com.example.ApiRestConPaginacion.controllers;

import com.example.ApiRestConPaginacion.entity.Domicilio;
import com.example.ApiRestConPaginacion.service.DomicilioServiceImpl;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping(path = "api/v1/domicilio")
public class DomicilioControllerImpl extends BaseControllerImpl<Domicilio, DomicilioServiceImpl> implements BaseController<Domicilio,Long>{
}
