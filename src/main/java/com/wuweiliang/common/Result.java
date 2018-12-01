package com.wuweiliang.common;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Result {
    private int state;
    private String msg;
    private Object data;
}
