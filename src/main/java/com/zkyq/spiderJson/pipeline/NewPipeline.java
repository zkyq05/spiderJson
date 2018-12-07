package com.zkyq.spiderJson.pipeline;

import com.zkyq.spiderJson.bean.ZhilianBean;
import com.zkyq.spiderJson.dao.ZhilianRepository;
import com.zkyq.spiderJson.modle.Lagou;
import com.zkyq.spiderJson.modle.Zhilian;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import us.codecraft.webmagic.ResultItems;
import us.codecraft.webmagic.Task;
import us.codecraft.webmagic.pipeline.Pipeline;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@Repository
public class NewPipeline implements Pipeline {
    @Autowired
    ZhilianRepository zhilianRepository;
    @Override
    public void process(ResultItems resultItems, Task task) {
        int size=100;
        for (int j = 0; j < size; j++) {
            System.err.println(resultItems.get("zhilian"+j).toString());
            ZhilianBean zhilianBean = resultItems.get("zhilian"+j);
            size=zhilianBean.getData().getNumFound()/100;
            for (int i = 0; i <zhilianBean.getData().getResults().size() ; i++) {
                String positionURL=zhilianBean.getData().getResults().get(i).getPositionURL();
                System.err.println(j+":"+i+"---"+"positionURL:"+positionURL);
                List<Zhilian> res= null;
                try {
                    res = zhilianRepository.findByPositionURL(positionURL);
                    System.err.println("查询:"+res.toString());
                    if (res.size()==0){
                        SimpleDateFormat df=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

                        Zhilian zhilian=new Zhilian();
                        zhilian.setCityName(zhilianBean.getData().getResults().get(i).getCity().getDisplay());
                        zhilian.setCompanyName(zhilianBean.getData().getResults().get(i).getCompany().getName());
                        zhilian.setJobName(zhilianBean.getData().getResults().get(i).getJobName());
                        zhilian.setSalary(zhilianBean.getData().getResults().get(i).getSalary());
                        zhilian.setEmplType(zhilianBean.getData().getResults().get(i).getEmplType());

                        zhilian.setCreateDate(zhilianBean.getData().getResults().get(i).getCreateDate());
                        zhilian.setGetTime(df.format(new Date()));
                        zhilian.setPositionURL(zhilianBean.getData().getResults().get(i).getPositionURL());
                        zhilian.setCompanyURL(zhilianBean.getData().getResults().get(i).getCompany().getUrl());

                        zhilianRepository.save(zhilian);
                        System.err.println("CompanyName:"+zhilian.getCompanyName());
                    }else {
                        System.err.println("已经有此数据");
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                    System.err.println("err:"+e);
                }

            }
        }
    }
}
