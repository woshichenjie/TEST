import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.liu.pojo.GirlInfo;
import com.liu.service.GirlServiceImpl;

public class test {

    public static void main(String[] args) {
        ApplicationContext ac = new ClassPathXmlApplicationContext("spring.xml");
        GirlServiceImpl sqlSessionFactoryBean = (GirlServiceImpl) ac.getBean("girlServiceImpl");

        GirlInfo girl = new GirlInfo();
        girl.setAge("18");
        girl.setCup_size("P");

        boolean l = sqlSessionFactoryBean.addGirl(girl);
        System.out.println(l);
    }

}
