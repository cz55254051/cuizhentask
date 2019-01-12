import com.chatRobot.model.User;
import com.chatRobot.service.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring-mybatis.xml")
public class TestUserService {
    @Autowired
    private UserService userService;

    @Test
    public void testInsert(){
        User user=new User();
        user.setName("hhhh");
        user.setPassword("hhjhhhuu");
        user.setRole("hhh");
        user.setPermission(1);
        user.setCreateAt((long)12);
        user.setUpdateAt((long)12);
        user.setCopyreader("fghh");
        userService.insert(user);
    }

    @Test
    public void testDelete() {int i=userService.deleteByPrimaryKey(3); }

    @Test
    public void testUpdate(){
        User user=new User();
        user.setName("hhhh");
        user.setPassword("hhjhhhuu");
        user.setRole("hhh");
        user.setPermission(1);
        user.setCreateAt((long)12);
        user.setUpdateAt((long)12);
        user.setCopyreader("fghh");
        user.setId(1);
        userService.updateByPrimaryKey(user);
    }

    @Test
    public void testSelect(){
        List<User> users=userService.selectUser(null,null);
        for (User user:users){
            System.out.println("user = " + user);
        }
    }
}
