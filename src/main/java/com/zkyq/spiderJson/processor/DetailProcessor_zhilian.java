package com.zkyq.spiderJson.processor;

import com.zkyq.spiderJson.controller.LagouScheduled;
import com.zkyq.spiderJson.dao.ZhilianRepository;
import com.zkyq.spiderJson.modle.Zhilian;
import com.zkyq.spiderJson.pipeline.DetailPipeline_zhilian;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import us.codecraft.webmagic.Page;
import us.codecraft.webmagic.Site;
import us.codecraft.webmagic.Spider;
import us.codecraft.webmagic.processor.PageProcessor;
import us.codecraft.webmagic.selector.Selectable;

import javax.annotation.processing.Processor;
import java.util.List;
@Repository
public class DetailProcessor_zhilian implements PageProcessor {
    @Autowired
    public  static ZhilianRepository zhilianRepository;
    private Site site = Site.me()
            .setCharset("utf-8")
            .setDomain("jobs.zhaopin.com")
            .setSleepTime(100)
            .setUserAgent("Mozilla/5.0 (Windows NT 6.1; Win64; x64; rv:63.0) Gecko/20100101 Firefox/63.0");
    ;
    public static final String list = "https://jobs.zhaopin.com/CZ893714810J00093796212.htm";
    @Override
    public void process(Page page) {
        System.err.println("page.getUrl():"+page.getUrl());
//        if (page.getUrl().regex(list).match()) {
            System.err.println("page.getHtml():"+page.getHtml().xpath("//div[@class='pos-ul']"));
            System.err.println("page.getHtml():"+page.getHtml().xpath("//div[@class='jjtxt']"));//l info-money
            System.err.println("page.getHtml():"+page.getHtml().xpath("//div[@class='l info-money']/strong"));//

            page.putField("url",page.getUrl());
            page.putField("pos",page.getHtml().xpath("//div[@class='pos-ul']"));
            page.putField("com",page.getHtml().xpath("//div[@class='jjtxt']"));
            page.putField("sar",page.getHtml().xpath("//div[@class='l info-money']/strong"));
//        }
    }
    @Override
    public Site getSite() {
        return site;
    }
    public static void main(String[] args) {
//        List<Zhilian> res=LagouScheduled.res;
//
//        for (int i = 0; i < res.size(); i++) {
//            String url=res.get(i).getPositionURL();
//            Spider spider=Spider.create(new DetailProcessor_zhilian());
//            spider.addUrl(url);
//            spider.addPipeline(new DetailPipeline_zhilian());
//            spider.thread(1);
//            spider.setExitWhenComplete(true);
//            spider.start();
//        }
    }
}
