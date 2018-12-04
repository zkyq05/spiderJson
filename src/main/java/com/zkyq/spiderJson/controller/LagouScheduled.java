package com.zkyq.spiderJson.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;
import us.codecraft.webmagic.Spider;

import java.text.SimpleDateFormat;
import java.util.Date;

@Component
public class LagouScheduled {
    @Autowired
    private LagouPipe lagouPipe;
    /**
     * 简书
     */
    @Scheduled(cron = "* */3 * * * ?")//0 */1 * * * ?
    public void jianShuScheduled() {
        SimpleDateFormat df=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        System.out.println("----开始执行简书定时任务----:"+df.format(new Date()));
        Spider spider = Spider.create(new LaGouSpider());
        spider.addUrl("https://www.lagou.com/jobs/positionAjax.json?px=default&city=北京&needAddtionalResult=false&isSchoolJob=0");
        spider.addPipeline(lagouPipe);
        spider.thread(5);
        spider.setExitWhenComplete(true);
        spider.start();
        spider.stop();
    }
}
