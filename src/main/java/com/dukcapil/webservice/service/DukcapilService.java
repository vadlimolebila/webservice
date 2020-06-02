package com.dukcapil.webservice.service;

import com.dukcapil.webservice.dto.Request;
import com.dukcapil.webservice.dto.Response;
import com.dukcapil.webservice.dto.ResponseTwo;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.jaxb.SpringDataJaxb.PageDto;

import java.util.HashMap;

/*
 * @author by Johannes Agus Subagio
 * 02/06/2020 10:30
 */
public interface DukcapilService {

    Page<Response> getData(Request request, Pageable pageable);

    Page<ResponseTwo> getSomething(Request request, Pageable pageable);

    Page<HashMap<String, String>> getAnything(Request request, Pageable pageable);

}
