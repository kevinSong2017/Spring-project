package service.springtest;


import com.kevin.entity.User;
import com.kevin.service.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Spring 自带的测试工具：Spring Test
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:spring.xml","classpath:spring-mybatis.xml"})
public class TestSpring {

    @Autowired
    private UserService userService;

    @Test
    public void test1(){
        User user=userService.getUser(1);
        System.out.println(user.getUserName());
    }



}
