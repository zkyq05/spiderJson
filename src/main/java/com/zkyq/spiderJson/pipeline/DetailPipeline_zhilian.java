package com.zkyq.spiderJson.pipeline;

import com.zkyq.spiderJson.dao.ZhilianRepository;
import com.zkyq.spiderJson.modle.Zhilian;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import us.codecraft.webmagic.ResultItems;
import us.codecraft.webmagic.Task;
import us.codecraft.webmagic.pipeline.Pipeline;

import java.util.List;

@Repository
public class DetailPipeline_zhilian implements Pipeline {
    @Autowired
    ZhilianRepository zhilianRepository;
    @Override
    public void process(ResultItems resultItems, Task task) {
        String url=resultItems.get("url").toString();
        String pos=resultItems.get("pos").toString();
        String com=resultItems.get("com").toString();
        String sar=resultItems.get("sar").toString();
        Zhilian zhilian=zhilianRepository.findByPositionURL(url).get(0);
        if (zhilian!=null){
            try {
                zhilian.setDetail_position(pos);
                zhilian.setDetail_company(com);
                zhilian.setDetail_salary(sar);
                zhilianRepository.save(zhilian);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

//        zhilianRepository.updateDetail("314","314","314","https://jobs.zhaopin.com/CZ579073180J00095404112.htm");
    }
}
