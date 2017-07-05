package com.victoryisours.orenengine.service;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Dan on 7/5/2017.
 */
@RestController
public class Controller {

    @ResponseStatus(value = HttpStatus.OK)
    @RequestMapping(value = "/", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public String hello() {
        return "Dango";
    }
}
