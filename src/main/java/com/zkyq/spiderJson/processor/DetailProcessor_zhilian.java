package com.zkyq.spiderJson.processor;

import com.zkyq.spiderJson.pipeline.DetailPipeline_zhilian;
import us.codecraft.webmagic.Page;
import us.codecraft.webmagic.Site;
import us.codecraft.webmagic.Spider;
import us.codecraft.webmagic.processor.PageProcessor;
import us.codecraft.webmagic.selector.Selectable;

import javax.annotation.processing.Processor;
import java.util.List;

public class DetailProcessor_zhilian implements PageProcessor {
    private Site site = Site.me()
            .setCharset("utf-8")
            .setDomain("jobs.zhaopin.com")
            .setSleepTime(100)
            .setUserAgent("Mozilla/5.0 (Windows NT 6.1; Win64; x64; rv:63.0) Gecko/20100101 Firefox/63.0");
    ;
    public static final String list = "https://jobs.zhaopin.com/CZ893714810J00093796212.htm";
    @Override
    public void process(Page page) {
        System.err.println("list:"+list);
        System.err.println("page.getUrl():"+page.getUrl());
//        if (page.getUrl().regex(list).match()) {
            System.err.println("page.getHtml():"+page.getHtml().xpath("//div[@class='pos-ul']"));
//            List<Selectable> list=page.getHtml().xpath("//ul[@class='note-list']/li").nodes();
////            System.err.println("list:"+list);
//            for (Selectable s : list) {
//                String title=s.xpath("//div/a/text()").toString();
//                String link=s.xpath("//div/a").links().toString();
//                String info=s.xpath("//div/p/text()").toString();
//                String author=s.xpath("//div/div/a/text()").toString();
//                System.err.println("title:"+title);
//                System.err.println("link:"+link);
//                System.err.println("info:"+info);
//                System.err.println("author:"+author);
//            }
//        }
    }
    @Override
    public Site getSite() {
        return site;
    }
    public static void main(String[] args) {

        Spider spider=Spider.create(new DetailProcessor_zhilian());
        spider.addUrl("https://jobs.zhaopin.com/CZ893714810J00093796212.htm");
        spider.addPipeline(new DetailPipeline_zhilian());
        spider.thread(5);
        spider.setExitWhenComplete(true);
        spider.start();
    }
}
