import com.chatRobot.model.Studio;
import com.chatRobot.service.StudioService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring-mybatis.xml")
public class TestStudioService {
    @Autowired
    private StudioService studioService;

    @Test
    public void testInsert(){
        Studio studio=new Studio();
        studio.setName("环境和环境");
        studio.setStatus(true);
        studio.setCreateAt((long) 11);
        studio.setUpdateAt((long) 11);
        studio.setCopyreader("宏观经济");
        studioService.insert(studio);
    }

    @Test
    public void testDelete() {int i=studioService.deleteByPrimaryKey(3); }

    @Test
    public void testUpdate(){
        Studio studio=new Studio();
        studio.setName("环境和环境");
        studio.setStatus(true);
        studio.setCreateAt((long) 11);
        studio.setUpdateAt((long) 11);
        studio.setCopyreader("宏观经济");
        studio.setId(1);
        studioService.updateByPrimaryKey(studio);

    }

    @Test
    public void testSelect(){
        List<Studio> studios=studioService.selectStudio(null,null);
        for (Studio studio:studios){
            System.out.println("studio = " + studio);
        }
    }
}
