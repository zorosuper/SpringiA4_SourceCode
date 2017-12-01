package soundsystem;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CDConfig {
  @Bean
  //默认情况下bean的id与带有@Bean注解方法名是一致的
  public CompactDisc compactDisc() {
    return new SgtPeppers();
  }
}