package com.zkyq.spiderJson.processor;

import com.alibaba.fastjson.JSONObject;
import com.zkyq.spiderJson.bean.ZhilianBean;
import com.zkyq.spiderJson.dao.ZhilianRepository;
import com.zkyq.spiderJson.pipeline.NewPipeline;
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
        System.err.println("page.getUrl():"+page.getUrl());

    }
    //爬取北京的java职位信息
    public String processBeiJing(int page)
    {
        String url="https://h5api.m.taobao.com/h5/mtop.alimama.union.sem.landing.pc.items/1.0/?jsv=2.4.0&appKey=12574478&t=1544149500723&sign=9dd5cf5754389c8ef3ab2f5060ec8bba&api=mtop.alimama.union.sem.landing.pc.items&v=1.0&AntiCreep=true&dataType=jsonp&type=jsonp&ecode=0&callback=mtopjsonp1&data=%7B%22keyword%22%3A%22%E5%A5%B3%E8%A3%85%22%2C%22ppath%22%3A%22%22%2C%22loc%22%3A%22%22%2C%22minPrice%22%3A%22%22%2C%22maxPrice%22%3A%22%22%2C%22ismall%22%3A%22%22%2C%22ship%22%3A%22%22%2C%22itemAssurance%22%3A%22%22%2C%22exchange7%22%3A%22%22%2C%22custAssurance%22%3A%22%22%2C%22b%22%3A%22%22%2C%22clk1%22%3A%22af65d95df988bab0411e0b45a9725955%22%2C%22pvoff%22%3A%22%22%2C%22pageSize%22%3A%22100%22%2C%22page%22%3A%22%22%2C%22elemtid%22%3A%221%22%2C%22refpid%22%3A%22mm_26632258_3504122_32538762%22%2C%22pid%22%3A%22430673_1006%22%2C%22featureNames%22%3A%22spGoldMedal%2CdsrDescribe%2CdsrDescribeGap%2CdsrService%2CdsrServiceGap%2CdsrDeliver%2C%20dsrDeliverGap%22%2C%22ac%22%3A%22%2BemEFOrU8A8CATwBAd0gZduP%22%2C%22wangwangid%22%3A%22%22%2C%22catId%22%3A%22%22%7D";
        System.err.println("ulr:"+url);
        Writer write = null;
              // 定义一个字符串用来存储网页内容
             String result = null;
               // 定义一个缓冲字符输入流
                BufferedReader in = null;
                 try {
                     // 将string转成url对象
                    URL realUrl = new URL(url);
                    // 初始化一个链接到那个url的连接
                    URLConnection connection = realUrl.openConnection();
                    // 开始实际的连接
                    connection.connect();
                     // 初始化 BufferedReader输入流来读取URL的响应
                     in = new BufferedReader(new InputStreamReader(
                                     connection.getInputStream(),"utf-8"));
                     // 用来临时存储抓取到的每一行的数据
                     String line,saveEssayUrl="F:\\spider",fileName="myFile.txt";

                     File file = new File(saveEssayUrl, fileName);
                     File file2 = new File(saveEssayUrl);

                     if (file2.isDirectory() == false) {
                            file2.mkdirs();
                             try {
                                     file.createNewFile();
                                     System.out.println("********************");
                                     System.out.println("创建" + fileName + "文件成功！！");

                                 } catch (IOException e) {
                                     e.printStackTrace();
                                 }

                        } else {
                             try {
                                     file.createNewFile();
                                     System.out.println("********************");
                                     System.out.println("创建" + fileName + "文件成功！！");
                                 } catch (IOException e) {
                                     e.printStackTrace();
                                }
                         }
                     Writer w = new FileWriter(file);

                     while ((line = in.readLine()) != null) {
                            // 遍历抓取到的每一行并将其存储到result里面
            //                line = new String(line.getBytes("utf-8"),"gbk");
                         if (line!=null){
                             w.write(line);
                             w.write("\r\n");
                             result += line;
                         }
                         }
                     w.close();
                 } catch (Exception e) {
                     System.out.println("发送GET请求出现异常！" + e);
                     e.printStackTrace();
                 }
                 // 使用finally来关闭输入流
                finally {
                     try {
                             if (in != null) {
                                     in.close();
                                 }

                         } catch (Exception e2) {
                             e2.printStackTrace();
                         }
                 }
//                 System.err.println(result);
                 return result;
    }
    @Override
    public Site getSite() {
        return site;
    }

    public static void main(String[] args)
    {
        Spider.create(new TaobaoSpider())
                .addPipeline(new NewPipeline())
                .addUrl("https://s.taobao.com/list?q=%E5%A5%B3%E8%A3%85&cat=16&style=grid&seller_type=taobao&spm=a217f.8051907.1000187.1")
                .thread(1)
                .setExitWhenComplete(true)
                .start();
        System.err.println("爬取完成");
    }
}
