package service;

import com.kevin.entity.User;
import com.kevin.service.UserService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class TestUserService {
    @Test
    public void testGetUser(){
        ApplicationContext applicationContext=
                new ClassPathXmlApplicationContext(new String[]{"spring.xml","spring-mybatis.xml"});
        UserService userService = (UserService) applicationContext.getBean("userServiceImpl");
        User user = userService.getUser(1);
    }

}
