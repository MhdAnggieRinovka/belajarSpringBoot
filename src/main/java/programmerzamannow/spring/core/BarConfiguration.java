package programmerzamannow.spring.core;

import org.springframework.context.annotation.Bean;
import programmerzamannow.spring.core.data.Bar;

public class BarConfiguration {

    @Bean
    public Bar bar() {
        return new Bar();
    }
}
