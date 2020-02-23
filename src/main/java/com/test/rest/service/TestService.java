package com.test.rest.service;

import com.test.rest.dto.TestMethodRequest;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class TestService {
    public void test(TestMethodRequest request) {
        log.info("user name: {}", request.getUserName());
        log.info("user id: {}", request.getUserId());
    }
}
