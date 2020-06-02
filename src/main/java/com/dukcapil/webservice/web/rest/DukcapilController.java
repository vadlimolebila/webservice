package com.dukcapil.webservice.web.rest;

/*
 * @author by Johannes Agus Subagio
 * 02/06/2020 10:47
 */

import com.dukcapil.webservice.dto.Request;
import com.dukcapil.webservice.dto.Response;
import com.dukcapil.webservice.dto.ResponseTwo;
import com.dukcapil.webservice.service.DukcapilService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;


@RestController
@RequestMapping(path = "/api/v1/dukcapil")
public class DukcapilController {

    @Autowired
    private DukcapilService dukcapilService;

    @PostMapping(value = "/", consumes = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public Page<HashMap<String, String>> getData(@RequestBody Request request, Pageable pageable) {
        return dukcapilService.getAnything(request, pageable);

    }

}
