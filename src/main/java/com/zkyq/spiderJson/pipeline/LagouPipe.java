package com.zkyq.spiderJson.pipeline;

import com.zkyq.spiderJson.dao.LagouRepository;
import com.zkyq.spiderJson.modle.Lagou;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import us.codecraft.webmagic.ResultItems;
import us.codecraft.webmagic.Task;
import us.codecraft.webmagic.pipeline.Pipeline;

import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

@Repository
public class LagouPipe implements Pipeline
{
    @Autowired
    LagouRepository lagouRepository;
    static int sum = 0;
    String savepath = "F:/spider/wordcloud.txt";
    public void process(ResultItems resultItems, Task task)
    {
        List<String> position = resultItems.get("positionname");
        List<String> salary = resultItems.get("salary");
        List<String> workYear = resultItems.get("workYear");
        List<String> address = resultItems.get("address");
        List<String> district = resultItems.get("district");
        List<String> createTime = resultItems.get("createTime");
        List<String> companyName = resultItems.get("companyName");
        List<String> discription = resultItems.get("discription");
        FileWriter fileWriter = null;
        try
        {
            fileWriter = new FileWriter(savepath,true);
            for (int j = 0; j < position.size(); j++)
            {
                fileWriter.write(position.get(j).toString());
                fileWriter.write("\r\n");
            }
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
        finally
        {
            try
            {
                fileWriter.flush();
                fileWriter.close();
            }
            catch (IOException ex)
            {
                ex.printStackTrace();
            }
        }
        for(int i =0;i<position.size();i++)
        {
            String cName=companyName.get(i).toString();
            String pos=position.get(i).toString();
            String sal=salary.get(i).toString();
            Lagou res=lagouRepository.findByCompanyNameAndPositionnameAndSalary(cName,pos,sal);
            if (res==null){
                System.out.println(position.get(i).toString()+sum);
                System.out.println(salary.get(i).toString()+sum);
                System.out.println(workYear.get(i).toString()+sum);
                System.out.println(address.get(i).toString()+sum);
                System.out.println(district.get(i).toString()+sum);
                System.out.println(createTime.get(i).toString()+sum);
                System.out.println(companyName.get(i).toString()+sum);
                System.out.println(discription.get(i).toString()+sum);

                Lagou lagou = new Lagou();
                lagou.setPositionname(position.get(i).toString());
                lagou.setSalary(salary.get(i).toString());
                lagou.setWorkYear(workYear.get(i).toString());
                lagou.setAddress(address.get(i).toString());
                lagou.setDistrict(district.get(i).toString());
                lagou.setCreateTime(createTime.get(i).toString());
                lagou.setCompanyName(companyName.get(i).toString());
                lagou.setDiscription(discription.get(i).toString());
                lagouRepository.save(lagou);
            }else {
                System.err.println("已经有此数据");
            }

            sum++;
        }
        }
    }

