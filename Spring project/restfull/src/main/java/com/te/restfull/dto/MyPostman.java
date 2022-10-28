package com.te.restfull.dto;

import com.fasterxml.jackson.annotation.JsonInclude;

import lombok.Data;

@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class MyPostman {
private String msg;
private String statusCode;
private String describe;
private Object object;
}
