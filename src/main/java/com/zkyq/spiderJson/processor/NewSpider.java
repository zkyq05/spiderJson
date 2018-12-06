package com.zkyq.spiderJson.processor;

import com.alibaba.fastjson.JSONObject;
import com.zkyq.spiderJson.bean.ZhilianBean;
import com.zkyq.spiderJson.pipeline.NewPipeline;
import com.zkyq.spiderJson.dao.ZhilianRepository;
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
public class NewSpider implements PageProcessor {
    @Autowired
    public ZhilianRepository zhilianRepository;
    int flag = 0;
    private Site site = Site.me()
            .setRetryTimes(1)
            .setSleepTime(1000)
            .addHeader("Accept","application/json, text/plain, */*")
            .addHeader("Accept-Encoding","gzip, deflate, br")
            .addHeader("Accept-Language","zh-CN,zh;q=0.8")
            .addHeader("Connection","keep-alive")
            //.addHeader("Content-Length","23")
            .addHeader("Content-Type","application/json; charset=utf-8")
            .addHeader("Cookie","urlfrom=121126445; urlfrom2=121126445; adfbid=0; adfbid2=0; ZP_OLD_FLAG=false; dywea=95841923.3039749581771458600.1543900380.1543900380.1543900380.1; dywec=95841923; dywez=95841923.1543900380.1.1.dywecsr=baidupcpz|dyweccn=(not%20set)|dywecmd=cpt|dywectr=%E6%99%BA%E8%81%94%E6%8B%9B%E8%81%98; Hm_lvt_38ba284938d5eddca645bb5e02a02006=1543900380; Hm_lpvt_38ba284938d5eddca645bb5e02a02006=1543900479; sts_deviceid=16777a23b2f43d-078675777319388-143d7240-2073600-16777a23b3032b; sts_sg=1; sts_chnlsid=121113803; zp_src_url=https%3A%2F%2Fsp0.baidu.com%2F9q9JcDHa2gU2pMbgoY3K%2Fadrc.php%3Ft%3D06KL00c00fZmx9C0v4w60KqiAsjQj0uT00000cQiq7b00000xrSnd1.THLyktAJdIjA80K85yF9pywd0Znqm16kPW-WPARsnj0snHb3r0Kd5RwawWu7fHDdwjckwDc3wRmkf1Fanbf3nYNKwjKDPW9j0ADqI1YhUyPGujY1nHRYrj0YnWnYFMKzUvwGujYkP6K-5y9YIZK1rBtEmv4YQMGCmyqspy38mvqVQYd9ThV-IaqLpAq_uNqWULN8IANzQhG1Tjq1pyfqnHcknHD1rj01FMNzUjdCIZwsT1CEQLw1QMGCmyqspy38mvqVQvGdUg0Epy4bug9xUhNLQh9YUysOIgwVgLPEIgFWuHdBmy-bIgKWTZChIgwVgvd-uA-dUHdWTZf0mLFW5HcsrHRY%26tpl%3Dtpl_11535_18459_14447%26l%3D1509216898%26attach%3Dlocation%253D%2526linkName%253D%2525E6%2525A0%252587%2525E5%252587%252586%2525E5%2525A4%2525B4%2525E9%252583%2525A8-%2525E6%2525A0%252587%2525E9%2525A2%252598-%2525E4%2525B8%2525BB%2525E6%2525A0%252587%2525E9%2525A2%252598%2526linkText%253D%2525E3%252580%252590%2525E6%252599%2525BA%2525E8%252581%252594%2525E6%25258B%25259B%2525E8%252581%252598%2525E3%252580%252591%2525E5%2525AE%252598%2525E6%252596%2525B9%2525E7%2525BD%252591%2525E7%2525AB%252599%252520%2525E2%252580%252593%252520%2525E5%2525A5%2525BD%2525E5%2525B7%2525A5%2525E4%2525BD%25259C%2525EF%2525BC%25258C%2525E4%2525B8%25258A%2525E6%252599%2525BA%2525E8%252581%252594%2525E6%25258B%25259B%2525E8%252581%252598%2525EF%2525BC%252581%2526xp%253Did(%252522m3154804234_canvas%252522)%25252FDIV%25255B1%25255D%25252FDIV%25255B1%25255D%25252FDIV%25255B1%25255D%25252FDIV%25255B1%25255D%25252FDIV%25255B1%25255D%25252FH2%25255B1%25255D%25252FA%25255B1%25255D%2526linkType%253D%2526checksum%253D250%26ie%3Dutf-8%26f%3D8%26tn%3Dbaidu%26wd%3D%25E6%2599%25BA%25E8%2581%2594%25E6%258B%259B%25E8%2581%2598%26rqlang%3Dcn%26inputT%3D4250; __xsptplus30=30.1.1543900380.1543900380.1%232%7Csp0.baidu.com%7C%7C%7C%25E6%2599%25BA%25E8%2581%2594%25E6%258B%259B%25E8%2581%2598%7C%23%23kkBvu1_BeRNp3VtbwPS1mzoxZwFpfp-B%23; _jzqa=1.2363864741369330700.1543900381.1543900381.1543900381.1; _jzqc=1; _jzqy=1.1543900381.1543900381.1.jzqsr=baidu|jzqct=%E6%99%BA%E8%81%94%E6%8B%9B%E8%81%98.-; _jzqckmp=1; __utma=269921210.760890896.1543900384.1543900384.1543900384.1; __utmc=269921210; __utmz=269921210.1543900384.1.1.utmcsr=baidupcpz|utmccn=(not%20set)|utmcmd=cpt|utmctr=%E6%99%BA%E8%81%94%E6%8B%9B%E8%81%98; sensorsdata2015jssdkcross=%7B%22distinct_id%22%3A%22655156486%22%2C%22%24device_id%22%3A%2216777a24de8203-04ce43a2d9738d-143d7240-2073600-16777a24de9428%22%2C%22props%22%3A%7B%22%24latest_traffic_source_type%22%3A%22%E7%9B%B4%E6%8E%A5%E6%B5%81%E9%87%8F%22%2C%22%24latest_referrer%22%3A%22%22%2C%22%24latest_referrer_host%22%3A%22%22%2C%22%24latest_search_keyword%22%3A%22%E6%9C%AA%E5%8F%96%E5%88%B0%E5%80%BC_%E7%9B%B4%E6%8E%A5%E6%89%93%E5%BC%80%22%2C%22%24latest_utm_source%22%3A%22baidupcpz%22%2C%22%24latest_utm_medium%22%3A%22cpt%22%7D%2C%22first_id%22%3A%2216777a24de8203-04ce43a2d9738d-143d7240-2073600-16777a24de9428%22%7D; sajssdk_2015_cross_new_user=1; qrcodekey=ba1c119bc6204393a26a49771595f2bd; firstchannelurl=https%3A//passport.zhaopin.com/login; lastchannelurl=https%3A//ts.zhaopin.com/jump/index_new.html%3Futm_source%3Dbaidupcpz%26utm_medium%3Dcpt%26utm_provider%3Dpartner%26sid%3D121113803%26site%3Dnull; index-c=0; JsNewlogin=1965469460; JSloginnamecookie=18833196975; JSShowname=%E9%9F%A9%E4%BC%9A%E6%9E%97; at=be409702c01649b1b83acdd2509a1369; Token=be409702c01649b1b83acdd2509a1369; rt=3a6e92f8188d42d680372c783352441b; JSpUserInfo=3e692f645b6a5f64466b5c6b55665f6952735f695364506a52643f6b276b59665b695c7353695864556a58644a6b5f6b5d665d69517350693e64286a54649afc7324f30151692173266956645e6a5f64476b5a6b50665e6957735b695364266a1864026b476b07660569097350693864326a5464426b526b25663e6959735a695a644b6a5b64536b586b57665069557358695064276a25644e6b586b5f663f692573566921642b6a5c64466b586b51665c69507353695d64516a5264266b3d6b59665b695f73386922645b6a5964486b4; uiioit=3d672038046a52644264456f596751380f6a50644f64466f536726387d6a596447644b6f7; jobRiskWarning=true; ZPCITIESCLICKED=|565; ZL_REPORT_GLOBAL={%22//www%22:{%22seid%22:%22be409702c01649b1b83acdd2509a1369%22%2C%22actionid%22:%22b63e8c66-76a6-440c-9c1c-13e2dbb1a897-cityPage%22}%2C%22sou%22:{%22actionid%22:%22a75097fc-1d76-438a-9781-302c2ff3349f-sou%22%2C%22funczone%22:%22smart_matching%22}%2C%22//jobs%22:{%22actionid%22:%22b1045ab0-19d1-4eec-87d6-93b1b728a60a-jobs%22%2C%22funczone%22:%22dtl_best_for_you%22}}; LastCity=%E7%9F%B3%E5%AE%B6%E5%BA%84; LastCity%5Fid=565; GUID=66cf92966ef54dd8aa608a1f39020081; adfcid=none; adfcid2=none; loginreleased=1")
            .addHeader("Host","fe-api.zhaopin.com")
            .addHeader("Origin","https://sou.zhaopin.com")
            .addHeader("Referer","https://sou.zhaopin.com/?jl=%E7%9F%B3%E5%AE%B6%E5%BA%84&kw=Java%E5%BC%80%E5%8F%91&kt=3")
            .addHeader("User-Agent","Mozilla/5.0 (Windows NT 6.1; Win64; x64; rv:63.0) Gecko/20100101 Firefox/63.0")
//            .addHeader("X-Anit-Forge-Code","0")
//            .addHeader("X-Anit-Forge-Token","None")
//            .addHeader("X-Requested-With","XMLHttpRequest")
            ;


    @Override
    public void process(Page page) {
        for (int i = 0; i <7 ; i++) {
            int num=i*100;
            System.err.println("num:"+num);
            String res=processBeiJing(num);
            String reslt=res.replaceFirst("null","");
//        System.err.println("result:"+reslt);
            ZhilianBean zhilianBean =JSONObject.parseObject(reslt,ZhilianBean.class);

            page.putField("zhilian"+i,zhilianBean);

            String listM = zhilianBean.getData().getResults().get(0).getPositionURL();
            if (page.getUrl().regex(listM).match()) {
            System.err.println("page.getHtml():"+page.getHtml().xpath("//div[@class='pos-ul']"));
//                List<Selectable> list=page.getHtml().xpath("//ul[@class='note-list']/li").nodes();
//            System.err.println("list:"+list);
//                for (Selectable s : list) {
//                    String title=s.xpath("//div/a/text()").toString();
//                    String link=s.xpath("//div/a").links().toString();
//                    String info=s.xpath("//div/p/text()").toString();
//                    String author=s.xpath("//div/div/a/text()").toString();
//                    System.err.println("title:"+title);
//                    System.err.println("link:"+link);
//                    System.err.println("info:"+info);
//                    System.err.println("author:"+author);
//                }
            }
        }

    }
    //爬取北京的java职位信息
    public String processBeiJing(int page)
    {
        String url="https://fe-api.zhaopin.com/c/i/sou?start="+page+"&pageSize=100&cityId=%e7%9f%b3%e5%ae%b6%e5%ba%84&workExperience=-1&education=-1&companyType=-1&employmentType=-1&jobWelfareTag=-1&kw=Java%e5%bc%80%e5%8f%91&kt=3&=15001&at=be409702c01649b1b83acdd2509a1369&rt=3a6e92f8188d42d680372c783352441b&_v=0.01035474&userCode=655156486&x-zp-page-request-id=88f0ca643bcd48f0b235a9d4ba20810d-1543900478483-202141";
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
                     String line,saveEssayUrl="F:\\spider",fileName="myFile";

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
        Spider.create(new NewSpider())
                .addPipeline(new NewPipeline())
//                .addUrl("https://www.lagou.com/jobs/positionAjax.json?px=default&city=北京&needAddtionalResult=false&isSchoolJob=0")
                .thread(1)
                .run();
        System.err.println("爬取完成");
    }
}
