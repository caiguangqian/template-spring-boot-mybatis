package com.onion.template.spring.boot.mybatis.config.swagger;

public @interface ApiResponseProperty {

    String name();

    String description() default "";

    String type();

}

