package com.example.backend.pojo;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class GlobalApiResponse<T> {
    private int status;
    private String message;
    private T data;
}