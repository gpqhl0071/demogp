package com.gp.demogp;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * @author gao peng
 * @date 2018/8/14 17:42
 */
@Configuration
@EnableSwagger2
public class Swagger2 {
  @Bean
  public Docket createRestApi() {
    return new Docket(DocumentationType.SWAGGER_2)
      .apiInfo(apiInfo())
      .select()
      .apis(RequestHandlerSelectors.basePackage("com.gp.demogp.web"))
      .paths(PathSelectors.any())
      .build();
  }

  private ApiInfo apiInfo() {
    return new ApiInfoBuilder()
      .title("demogp中使用Swagger2构建RESTful APIs")
      .description("demogp中使用Swagger2构建RESTful APIs")
//      .termsOfServiceUrl("http://blog.didispace.com/")
//      .contact("程序猿DD")
      .version("1.0")
      .build();
  }
}
