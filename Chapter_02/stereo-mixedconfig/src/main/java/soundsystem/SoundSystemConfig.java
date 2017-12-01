package soundsystem;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.ImportResource;

@Configuration
@Import(CDPlayerConfig.class)
//该注解将引入xml配置文件中的bean
@ImportResource("classpath:cd-config.xml")
public class SoundSystemConfig {

}
