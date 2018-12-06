package com.zkyq.spiderJson.controller;


import com.zkyq.spiderJson.pipeline.LagouPipe;
import com.zkyq.spiderJson.pipeline.NewPipeline;
import com.zkyq.spiderJson.processor.NewSpider;
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
    @Autowired
    private NewPipeline newPipeline;
    /**
     * 简书
     */
//    @Scheduled(cron = "* */3 * * * ?")//0 */1 * * * ?
//    public void jianShuScheduled() {
//        SimpleDateFormat df=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
//        System.out.println("----开始执行简书定时任务----:"+df.format(new Date()));
//        Spider spider = Spider.create(new LaGouSpider());
//        spider.addUrl("https://www.lagou.com/jobs/positionAjax.json?px=default&city=北京&needAddtionalResult=false&isSchoolJob=0");
//        spider.addPipeline(lagouPipe);
//        spider.thread(5);
//        spider.setExitWhenComplete(true);
//        spider.start();
//        spider.stop();
//    }
    @Scheduled(cron = "0 6 16 * * ?")//0 */1 * * * ?
    public void NewScheduled() {
        SimpleDateFormat df=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        System.out.println("----开始执行New定时任务----:"+df.format(new Date()));
        Spider spider = Spider.create(new NewSpider());
//        spider.addUrl("https://fe-api.zhaopin.com");
        spider.addUrl("https://fe-api.zhaopin.com/c/i/sou?start=0&pageSize=100&cityId=%e7%9f%b3%e5%ae%b6%e5%ba%84&workExperience=-1&education=-1&companyType=-1&employmentType=-1&jobWelfareTag=-1&kw=Java%e5%bc%80%e5%8f%91&kt=3&=15001&at=be409702c01649b1b83acdd2509a1369&rt=3a6e92f8188d42d680372c783352441b&_v=0.01035474&userCode=655156486&x-zp-page-request-id=88f0ca643bcd48f0b235a9d4ba20810d-1543900478483-202141");
        spider.addPipeline(newPipeline);
        spider.thread(1);
        spider.setExitWhenComplete(true);
        spider.start();
        spider.stop();
    }
}
