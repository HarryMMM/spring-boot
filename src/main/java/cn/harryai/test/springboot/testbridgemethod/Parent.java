package cn.harryai.test.springboot.testbridgemethod;

/**
 * @author Harry
 * @since 2020/02/16 14:10
 **/
public interface Parent<T> {
    T getName(T name);
}
