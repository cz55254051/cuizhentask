import com.chatRobot.model.Work;
import com.chatRobot.service.WorkService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring-mybatis.xml")
public class TestWorkService {
    @Autowired
    private WorkService workService;

    @Test
    public void testInsert(){
        Work work=new Work();
        work.setName("hjhjw我");
        work.setShowreelId(1);
        work.setClassifyId(1);
        work.setIntro("很久很久斤斤计较");
        work.setPicture("hjhuj所");
        work.setVideo("hjhhjh");
        work.setArticle("jhhjj");
        work.setCreateAt((long) 12);
        work.setUpdateAt((long) 12);
        work.setCopyreader("hhhh");
        workService.insert(work);
    }

    @Test
    public void testDelete() {int i= workService.deleteByPrimaryKey(3); }

    @Test
    public void testUpdate(){
        Work work=new Work();
        work.setName("hjhjw我");
        work.setShowreelId(1);
        work.setClassifyId(1);
        work.setIntro("很久很久斤斤计较");
        work.setPicture("hjhuj所");
        work.setVideo("hjhhjh");
        work.setArticle("jhhjj");
        work.setCreateAt((long) 12);
        work.setUpdateAt((long) 12);
        work.setCopyreader("hhhh");
        work.setId(1);
        workService.updateByPrimaryKey(work);

    }

    @Test
    public void testSelect(){
        List<Work> works=workService.selectWork(null,null);
        for (Work work:works){
            System.out.println("work = " + work);
        }
    }
}
