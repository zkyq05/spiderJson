package com.zkyq.spiderJson.pipeline;

import com.zkyq.spiderJson.bean.TGirlBean;
import com.zkyq.spiderJson.dao.TGirlsRepository;
import com.zkyq.spiderJson.modle.TGirls;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import us.codecraft.webmagic.ResultItems;
import us.codecraft.webmagic.Task;
import us.codecraft.webmagic.pipeline.Pipeline;

import java.util.List;

@Repository
public class TaobaoPipeline implements Pipeline {
    @Autowired
    TGirlsRepository tGirlsRepository;
    @Override
    public void process(ResultItems resultItems, Task task) {
        TGirlBean tGirlBean = resultItems.get("TGirls");
        for (int i = 0; i <tGirlBean.getData().getAuctions().size() ; i++) {
            String detail_url=tGirlBean.getData().getAuctions().get(i).getTitle();
            List<TGirls> res=tGirlsRepository.findByTitle(detail_url);
            System.err.println("查询:"+res.toString());
            if (res.size()==0){
                TGirls tGirls=new TGirls();

                tGirls.setTitle(tGirlBean.getData().getAuctions().get(i).getTitle());
                tGirls.setRaw_title(tGirlBean.getData().getAuctions().get(i).getRaw_title());
                tGirls.setView_price(tGirlBean.getData().getAuctions().get(i).getView_price());
                tGirls.setView_fee(tGirlBean.getData().getAuctions().get(i).getView_fee());
                tGirls.setView_sales(tGirlBean.getData().getAuctions().get(i).getView_sales());

                tGirls.setItem_loc(tGirlBean.getData().getAuctions().get(i).getItem_loc());
                tGirls.setNick(tGirlBean.getData().getAuctions().get(i).getNick());
                tGirls.setPic_url(tGirlBean.getData().getAuctions().get(i).getPic_url());
                tGirls.setDetail_url(tGirlBean.getData().getAuctions().get(i).getDetail_url());

                tGirlsRepository.save(tGirls);
            }
        }
    }
}
