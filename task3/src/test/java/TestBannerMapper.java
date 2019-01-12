import com.chatRobot.dao.BannerMapper;
import com.chatRobot.model.Banner;
import com.chatRobot.service.BannerService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;
import java.util.logging.Logger;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring-mybatis.xml")

public class TestBannerMapper {
//    @Autowired
//    private BannerMapper bannerMapper;
    @Autowired
    private BannerService bannerService;

    private static Logger logger = Logger.getLogger(String.valueOf(TestBannerMapper.class));

    @Test
    public void testInsert(){

        Banner banner=new Banner();
        banner.setCover("sdfsad");
        banner.setUrl("adsfsd");
        banner.setStatus(true);
        banner.setCreateAt((long) 7);
        banner.setUpdateAt((long) 7);
        banner.setCopyreader("sddf");
        bannerService.insertSelective(banner);
    }

    @Test
    public void testDelete(){
        int i= bannerService.deleteByPrimaryKey(3);
    }

    @Test
    public void testUpdate(){
        Banner banner=new Banner();
        banner.setCover("花季护航");
        banner.setUrl("客户空间");
        banner.setStatus(true);
        banner.setCreateAt((long) 7);
        banner.setUpdateAt((long) 7);
        banner.setCopyreader("画江湖");
        banner.setId(2);
        bannerService.updateByPrimaryKey(banner);
    }

    @Test
    public void testSelect() {
        List<Banner> banners = bannerService.selectBanner(null, true);
        for (Banner banner  : banners)
        {
            System.out.println(banner);
        }
    }
}
