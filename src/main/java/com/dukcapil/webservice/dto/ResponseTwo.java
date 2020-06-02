package com.dukcapil.webservice.dto;

import com.fasterxml.jackson.annotation.JsonAnySetter;
import lombok.Data;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 * @author Nurvadli
 */
@Data
public class ResponseTwo {

    Map<String, Object> details = new LinkedHashMap<>();

    @JsonAnySetter
    void setDetail(String key, Object value) {
        details.put(key, value);
    }
}
