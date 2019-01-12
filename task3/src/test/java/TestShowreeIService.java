import com.chatRobot.model.Showreel;
import com.chatRobot.service.ShowreelService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring-mybatis.xml")


public class TestShowreeIService {
    @Autowired
    private ShowreelService showreelService;


    @Test
    public void testInsert(){
        Showreel showreel=new Showreel();
        showreel.setName("环境");
        showreel.setStatus(true);
        showreel.setCreateAt((long) 12);
        showreel.setUpdateAt((long) 12);
        showreel.setCopyreader("投影");
        showreelService.insert(showreel);
    }

    @Test
    public void testDelete() {int i=showreelService.deleteByPrimaryKey(3); }

    @Test
    public void testUpdate(){
        Showreel showreel=new Showreel();
        showreel.setName("环境");
        showreel.setStatus(true);
        showreel.setCreateAt((long) 12);
        showreel.setUpdateAt((long) 12);
        showreel.setCopyreader("投影");
        showreel.setId(1);
        showreelService.updateByPrimaryKey(showreel);

    }

    @Test
    public void testSelect(){
        List<Showreel> showreels=showreelService.selectShowreel(null,null);
        for (Showreel showreel:showreels){
            System.out.println("showreel = " + showreel);
        }
    }
}
