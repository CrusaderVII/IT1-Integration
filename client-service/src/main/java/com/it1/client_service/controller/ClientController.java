package com.it1.client_service.controller;

import com.it1.client_service.dto.ClientDto;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/client")
@Slf4j
public class ClientController {

    public ClientDto getRandomClient() {
        log.info("AAA");
        return ClientDto.builder()
                .email("aa")
                .phone("bbb")
                .build();
    }
}
