package soundsystem;
import extra.Hello;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * @ComponentScan注解表明开启组件扫描
 * 扫描对象为该类所在的包以及子包
 * 此处表示扫描soundsystem包以及子包下的所有java注解声明的组件类
 */
@Configuration
@ComponentScan
//下面通过字符串数组指定组件基础包的包名
//@ComponentScan(basePackages = {"soundsystem"})
//上面的方式是类型不安全的，如果代码重构的话，可能会带来不必要的麻烦
//下面这种注解是指定组件基础包中的一个类，该类最好不要是业务类，而是空标记接口
//@ComponentScan(basePackageClasses={CDPlayer.class})
public class CDPlayerConfig { 
}
