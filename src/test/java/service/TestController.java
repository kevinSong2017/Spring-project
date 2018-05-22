package service;

import com.kevin.controller.UserController;
import com.kevin.entity.User;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestController {

    @Test
    public void  testC(){
        ApplicationContext applicationContext=
                new ClassPathXmlApplicationContext(new String[]{"spring.xml","spring-mybatis.xml"});
        UserController userController= (UserController) applicationContext.getBean("userControllerImpl");
        User user = userController.getUser(1);
        System.out.println(user.getUserName());
    }
}
