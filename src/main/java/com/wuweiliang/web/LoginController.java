package com.wuweiliang.web;

import com.wuweiliang.common.BaseController;
import com.wuweiliang.common.Result;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin
public class LoginController extends BaseController {

    @GetMapping("/login")
    public Result login() {
        return ok();
    }

}
