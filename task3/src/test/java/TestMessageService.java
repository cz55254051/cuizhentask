import com.chatRobot.dao.MessageMapper;
import com.chatRobot.model.Message;
import com.chatRobot.service.MessageService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring-mybatis.xml")
public class TestMessageService {
    @Autowired
    private MessageService messageService;

    @Test
    public void testInsert() {
        Message message=new Message();
        message.setWorkId(1);
        message.setName("jjj");
        message.setContent("jjjj");
        message.setStatus(true);
        message.setCreateAt((long) 11);
        message.setUpdateAt((long) 11);
        message.setCopyreader("jjjj");
        messageService.insert(message);
    }

    @Test
    public void testDelete() {int i=messageService.deleteByPrimaryKey(3); }


    @Test
    public void testUpdate() {
        Message message=new Message();
        message.setWorkId(1);
        message.setName("jjj");
        message.setContent("jjjj");
        message.setStatus(true);
        message.setCreateAt((long) 11);
        message.setUpdateAt((long) 11);
        message.setCopyreader("结婚");
        message.setId(1);
        messageService.updateByPrimaryKey(message);
    }

    @Test
    public void testSelect() {
        List<Message> messages=messageService.selectMessage(null,null);
        for(Message message:messages){
            System.out.println(message);
        }
    }
}