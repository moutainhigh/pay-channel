package com.dream.pay.channel.access.impl;

import com.dream.pay.channel.Demo;
import lombok.extern.slf4j.Slf4j;

import javax.ws.rs.GET;
import javax.ws.rs.Path;


@Path("/demo")
@Slf4j
public class DemoImpl implements Demo {

    @Path("/test")
    @GET
    public String test() {
        return "success";
    }
}