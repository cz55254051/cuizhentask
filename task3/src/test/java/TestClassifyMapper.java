import com.chatRobot.model.Classify;
import com.chatRobot.service.ClassifyService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring-mybatis.xml")
public class TestClassifyMapper {
    @Autowired
    private ClassifyService classifyService;

    @Test
    public void testInsert(){
        Classify classify=new Classify();
        classify.setShowreelId(1);
        classify.setName("好好");
        classify.setStatus(true);
        classify.setCreateAt((long) 12);
        classify.setUpdateAt((long) 12);
        classify.setCopyreader("解决");
        classifyService.insert(classify);
    }

    @Test
    public void testDelete(){ int i=classifyService.deleteByPrimaryKey(5); }

    @Test
    public void testUpdate(){
        Classify classify=new Classify();
        classify.setShowreelId(1);
        classify.setName("一个月");
        classify.setStatus(true);
        classify.setCreateAt((long) 12);
        classify.setUpdateAt((long) 12);
        classify.setCopyreader("环境");
        classify.setId(2);
        classifyService.updateByPrimaryKey(classify);
    }

    @Test
    public void testSelect(){
        List<Classify> classifies=classifyService.selectClassify(null,true);
        for(Classify classify:classifies){
            System.out.println("classify = " + classify);
        }
    }

}
