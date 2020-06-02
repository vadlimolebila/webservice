package com.dukcapil.webservice.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

/*
 * @author by Johannes Agus Subagio
 * 02/06/2020 10:09
 */
@Data
public class Request {

    private String nik;

    private String userid;

    private String password;

    @JsonProperty("IP_USER")
    private String IP_USER;

}
