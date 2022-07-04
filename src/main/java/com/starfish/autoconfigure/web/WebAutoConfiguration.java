package com.starfish.autoconfigure.web;

import com.starfish.autoconfigure.swagger.SwaggerAutoConfiguration;
import com.starfish.autoconfigure.time.ElapsedTimeAutoConfiguration;
import com.starfish.autoconfigure.trace.TraceAutoConfiguration;
import org.springframework.boot.autoconfigure.AutoConfiguration;
import org.springframework.context.annotation.Import;

/**
 * WebAutoConfiguration
 *
 * @author sunkolin
 * @version 1.0.0
 * @since 2019-07-04
 */
@Import({TraceAutoConfiguration.class, ElapsedTimeAutoConfiguration.class, SwaggerAutoConfiguration.class})
@AutoConfiguration(after = {TraceAutoConfiguration.class, ElapsedTimeAutoConfiguration.class, SwaggerAutoConfiguration.class})
public class WebAutoConfiguration {

//    @Bean
//    public WebConfig createWebConfig(TraceInterceptor traceInterceptor, ElapsedTimeInterceptor elapsedTimeInterceptor, SwaggerInterceptor swaggerInterceptor) {
//        return new WebConfig(traceInterceptor, elapsedTimeInterceptor, swaggerInterceptor);
//    }

}
