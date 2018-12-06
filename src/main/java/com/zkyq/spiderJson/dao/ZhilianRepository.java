package com.zkyq.spiderJson.dao;

import com.zkyq.spiderJson.modle.Lagou;
import com.zkyq.spiderJson.modle.Zhilian;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ZhilianRepository extends JpaRepository<Zhilian, Long> {
    List<Zhilian> findByCompanyNameAndJobNameAndSalary(String companyName, String jobName, String salary);
    List<Zhilian> findByPositionURL(String positionURL);
}
