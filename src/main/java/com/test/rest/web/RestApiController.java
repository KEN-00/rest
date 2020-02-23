package com.test.rest.web;

import com.test.rest.dto.TestMethodRequest;
import com.test.rest.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RestApiController {

    @Autowired
    TestService testService;

    @GetMapping("/get")
    public void testMethod(@RequestBody TestMethodRequest request) {
        testService.test(request);
    }


}
