import com.chatRobot.model.Replay;
import com.chatRobot.service.ReplayService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring-mybatis.xml")


public class TestReplayService {

    @Autowired
    private ReplayService replayService;


    @Test
    public void testInsert(){
        Replay replay=new Replay();
        replay.setMessageId(1);
        replay.setName("很久很久");
        replay.setContent("很久很久斤斤计较");
        replay.setCreateAt((long) 12);
        replay.setUpdateAt((long) 12);
        replay.setCopyreader("黑客江湖");
        replayService.insert(replay);
    }

    @Test
    public void testDelete(){int i=replayService.deleteByPrimaryKey(3);}

    @Test
    public void testUpdate(){
        Replay replay=new Replay();
        replay.setMessageId(1);
        replay.setName("很久很久");
        replay.setContent("很久很久斤斤计较");
        replay.setCreateAt((long) 12);
        replay.setUpdateAt((long) 12);
        replay.setCopyreader("黑客江湖");
        replay.setId(1);
        replayService.updateByPrimaryKey(replay);
    }

    @Test
    public void testSelect(){

        List<Replay> replays=replayService.selectReplay(null);
        for (Replay replay:replays){
            System.out.println("replay = " + replay);
        }
    }

}
