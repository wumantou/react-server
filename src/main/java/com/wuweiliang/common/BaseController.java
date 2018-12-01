package com.wuweiliang.common;

public class BaseController {
    protected Result result(int state, String msg, Object data) {
        return new Result(state, msg, data);
    }

    protected Result error(int state, String msg) {
        return result(state, msg, null);
    }

    protected Result ok(Object data) {
        return result(200, "success", data);
    }

    protected Result ok() {
        return result(200, "success", null);
    }
}
