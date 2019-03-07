package com.my.bizuser.config;

import com.my.bizuser.controller.TestController;
import com.my.bizuser.controller.UserController;
import org.glassfish.jersey.server.ResourceConfig;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import javax.ws.rs.ApplicationPath;

@Component
@Configuration
@ApplicationPath("/rest")
public class JerseyConfig extends ResourceConfig {

    public JerseyConfig() {
        register(UserController.class);
        register(TestController.class);
    }

}
