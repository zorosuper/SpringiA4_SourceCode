package soundsystem;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CDPlayerConfig {

  //bean注解会告诉Spring这个方法会返回一个对象，该对象要注册为
  //Spring 应用上下文中的bean。方法体中包含了最终产生bean实例的逻辑
  @Bean
  public CompactDisc compactDisc() {
    return new SgtPeppers();
  }

  //借助JavaConfig实现注入
  //当Spring调用cdPlayer方法创建CDPlayer bean实例的时候，它会自动装配一个
  //CompactDisc到配置方法之中
  @Bean
  public CDPlayer cdPlayer(CompactDisc compactDisc) {
    return new CDPlayer(compactDisc);
  }

}
