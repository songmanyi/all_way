package com.my.bizuser.data.signature;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Data
@Component
@ConfigurationProperties(prefix = "client")
public class ClientSubject {

    private String clientId;
    private String base64Secret;
    private String name;
    private int expiresSecond;

}
