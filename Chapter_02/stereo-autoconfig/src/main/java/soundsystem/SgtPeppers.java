package soundsystem;
import org.springframework.stereotype.Component;

/**
 * @Component注解表示此类是一个组件，Spring会自动将其识别为一个Bean
 * 但是这需要一个前提，就是开启了组件自动扫描，默认情况下组件扫描是不开启的
 * 开启方式有Java版和xml配置版
 * Java版参见CDPlayerConfig类
 *
 */

//用@Named的java注解规范也是支持的
@Component
public class SgtPeppers implements CompactDisc {

  private String title = "Sgt. Pepper's Lonely Hearts Club Band";  
  private String artist = "The Beatles";
  
  public void play() {
    System.out.println("Playing " + title + " by " + artist);
  }
  
}
