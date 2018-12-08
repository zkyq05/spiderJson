package com.zkyq.spiderJson.processor;

import com.alibaba.fastjson.JSONObject;
import com.zkyq.spiderJson.bean.TGirlBean;
import com.zkyq.spiderJson.bean.ZhilianBean;
import com.zkyq.spiderJson.dao.ZhilianRepository;
import com.zkyq.spiderJson.pipeline.NewPipeline;
import com.zkyq.spiderJson.pipeline.TaobaoPipeline;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import us.codecraft.webmagic.Page;
import us.codecraft.webmagic.Site;
import us.codecraft.webmagic.Spider;
import us.codecraft.webmagic.processor.PageProcessor;

import java.io.*;
import java.net.URL;
import java.net.URLConnection;

@Repository
public class TaobaoSpider implements PageProcessor {
    int flag = 0;
    private Site site = Site.me()
            .setCharset("utf-8")
            .setDomain("s.taobao.com")
            .setSleepTime(100)
            .setUserAgent("Mozilla/5.0 (Windows NT 6.1; Win64; x64; rv:63.0) Gecko/20100101 Firefox/63.0")
            .addHeader("Cookie","t=691ff3fe34c0045d87200072aacac2af; _m_h5_tk=598bbeb551c6892c7653fcba2adb717b_1544178962726; _m_h5_tk_enc=da6418c03753357e26843c94984cbbd3; cna=+emEFOrU8A8CATwBAd0gZduP; isg=BD4-R-Xa7uPy9TrEwHnCy3r-jFRA1wKIIrVRHOhH4wF8i95lUAvECQFpB5fiqPoR; thw=cn; cookie2=114df5916fb1b891030f91875eef23c3; v=0; _tb_token_=ee1e6e33b85e6; UM_distinctid=1678677b364f8-0dadb5536ab436-143d7240-1fa400-1678677b3662a0; unb=1988731326; uc1=cookie15=W5iHLLyFOGW7aA%3D%3D&cookie14=UoTYMh99GD0YGA%3D%3D; sg=568; _l_g_=Ug%3D%3D; skt=6119d05a103bfad9; cookie1=B0FjdUJfLeJ%2BMw6IKLMhcCt1xXA9xs69s6x1jG7cxPk%3D; csg=f710152c; uc3=vt3=F8dByR1RmPtIQWu3S20%3D&id2=Uojcg6vgkKZS0A%3D%3D&nk2=sECE1vB7NpLuLA%3D%3D&lg2=W5iHLLyFOGW7aA%3D%3D; existShop=MTU0NDE3MjkxMw%3D%3D; tracknick=%5Cu6C38%5Cu65E0%5Cu6B62%5Cu588305; lgc=%5Cu6C38%5Cu65E0%5Cu6B62%5Cu588305; _cc_=V32FPkk%2Fhw%3D%3D; dnk=%5Cu6C38%5Cu65E0%5Cu6B62%5Cu588305; _nk_=%5Cu6C38%5Cu65E0%5Cu6B62%5Cu588305; cookie17=Uojcg6vgkKZS0A%3D%3D; tg=0; mt=ci=7_1; enc=NZgLmoIcULkGmmmQG3IiHANKu1bIbJQNvVCfVsTmub7yVCiaBFxdQuiErR5R%2F7i0M2c%2BrfZce7ZYeOVyg4U1nQ%3D%3D; JSESSIONID=FC5005AB8D8D3247955847934423E73E; hng=CN%7Czh-CN%7CCNY%7C156; x=e%3D1%26p%3D*%26s%3D0%26c%3D0%26f%3D0%26g%3D0%26t%3D0; swfstore=102179\n" +
                    "Upgrade-Insecure-Requests: 1")
            ;


    @Override
    public void process(Page page) {
//        System.err.println("page.getUrl():"+page.getUrl());
//        System.err.println("page.getHtml():"+page.getHtml());
        String str=page.getHtml().toString();
        String[] arr1=str.split("\"itemlist\":");
        String[] arr2=arr1[1].split(",\"bottomsearch\"");
//        String[] arr1=str.split("g_page_config");
//        String[] arr2=arr1[1].split("g_srp_loadCss()");
//        String[] arr3=arr2[0].split("= ");
//        String[] arr4=arr3[1].split("}};");
        System.err.println("g_page_config:"+arr2[0]);

        TGirlBean tGirlBean = null;
        String result=arr2[0];
        try {
            tGirlBean = JSONObject.parseObject(result,TGirlBean.class);
        } catch (Exception e) {
            e.printStackTrace();
        }
        page.putField("TGirls",tGirlBean);

    }
    @Override
    public Site getSite() {
        return site;
    }

    public static void main(String[] args)
    {
        Spider.create(new TaobaoSpider())
                .addPipeline(new TaobaoPipeline())
                .addUrl("https://s.taobao.com/search?q=%E5%A5%B3%E8%A3%85&imgfile=&commend=all&ssid=s5-e&search_type=item&sourceId=tb.index&spm=a21bo.2017.201856-taobao-item.1&ie=utf8&initiative_id=tbindexz_20170306")
                .thread(1)
                .setExitWhenComplete(true)
                .start();
        System.err.println("爬取完成");
    }
}
