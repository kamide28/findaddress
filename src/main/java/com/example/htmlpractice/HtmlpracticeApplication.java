package com.example.htmlpractice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.http.MediaType;
import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;

@SpringBootApplication
public class HtmlpracticeApplication {

    public static void main(String[] args) {
        SpringApplication.run(HtmlpracticeApplication.class, args);
    }

    @Bean
    public RestTemplate getRestTemplate() {
        RestTemplate r = new RestTemplate();
        MappingJackson2HttpMessageConverter mappingJackson2HttpMessageConverter = new MappingJackson2HttpMessageConverter();
        mappingJackson2HttpMessageConverter.setSupportedMediaTypes(Arrays.asList(MediaType.TEXT_PLAIN));
        r.getMessageConverters().add(mappingJackson2HttpMessageConverter);
        return r;
    }
}
