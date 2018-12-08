package com.zkyq.spiderJson.controller;


import com.zkyq.spiderJson.dao.ZhilianRepository;
import com.zkyq.spiderJson.modle.Zhilian;
import com.zkyq.spiderJson.pipeline.DetailPipeline_zhilian;
import com.zkyq.spiderJson.pipeline.LagouPipe;
import com.zkyq.spiderJson.pipeline.NewPipeline;
import com.zkyq.spiderJson.pipeline.TaobaoPipeline;
import com.zkyq.spiderJson.processor.DetailProcessor_zhilian;
import com.zkyq.spiderJson.processor.NewSpider;
import com.zkyq.spiderJson.processor.TaobaoSpider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;
import us.codecraft.webmagic.Spider;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@Component
public class LagouScheduled {
    @Autowired
    private LagouPipe lagouPipe;
    @Autowired
    private NewPipeline newPipeline;
    @Autowired
    private TaobaoPipeline taobaoPipeline;
    @Autowired
    private DetailPipeline_zhilian detailPipeline_zhilian;
    @Autowired
    public ZhilianRepository zhilianRepository;
    public static List<Zhilian> res;
    public static String url;
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
    @Scheduled(cron = "10 21 15 * * ?")//0 */1 * * * ?
    public void NewScheduled() {
        SimpleDateFormat df=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        System.out.println("----开始执行New定时任务----:"+df.format(new Date()));
        Spider spider = Spider.create(new NewSpider());
        spider.addUrl("https://fe-api.zhaopin.com/c/i/sou?start=0&pageSize=100&cityId=%e5%8c%97%e4%ba%ac&workExperience=-1&education=-1&companyType=-1&employmentType=-1&jobWelfareTag=-1&kw=Java%e5%bc%80%e5%8f%91&kt=3&=15001&at=be409702c01649b1b83acdd2509a1369&rt=3a6e92f8188d42d680372c783352441b&_v=0.01035474&userCode=655156486&x-zp-page-request-id=88f0ca643bcd48f0b235a9d4ba20810d-1543900478483-202141");
        spider.addPipeline(newPipeline);
        spider.thread(1);
        spider.setExitWhenComplete(true);
        spider.start();
        spider.stop();
    }
    @Scheduled(cron = "45 53 15 * * ?")//0 */1 * * * ?
    public void DetailScheduled() {
        res=zhilianRepository.findAll();

        for (int i = 0; i < res.size(); i++) {
            if (res.get(i).getDetail_position()==null){
                SimpleDateFormat df=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
                url=res.get(i).getPositionURL();
                System.out.println("----开始执行Detail定时任务----:"+df.format(new Date()));
                Spider spider = Spider.create(new DetailProcessor_zhilian());
                spider.addUrl(url);
                spider.addPipeline(detailPipeline_zhilian);
                spider.thread(1);
                spider.setExitWhenComplete(true);
                spider.start();
                spider.stop();
            }
        }
    }
    @Scheduled(cron = "30 39 16 * * ?")//0 */1 * * * ?
    public void TaobaoScheduled() {
        SimpleDateFormat df=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        System.out.println("----开始执行Taobao定时任务----:"+df.format(new Date()));
        Spider spider = Spider.create(new TaobaoSpider());
        spider.addUrl("https://s.taobao.com/search?q=%E5%A5%B3%E8%A3%85&imgfile=&commend=all&ssid=s5-e&search_type=item&sourceId=tb.index&spm=a21bo.2017.201856-taobao-item.1&ie=utf8&initiative_id=tbindexz_20170306");
        spider.addPipeline(taobaoPipeline);
        spider.thread(1);
        spider.setExitWhenComplete(true);
        spider.start();
        spider.stop();
    }
}
