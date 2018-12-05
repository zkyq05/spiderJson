package com.zkyq.spiderJson.dao;

import com.zkyq.spiderJson.modle.Lagou;
import com.zkyq.spiderJson.modle.Zhilian;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ZhilianRepository extends JpaRepository<Zhilian, Long> {
    Zhilian findByCompanyNameAndJobNameAndSalary(String companyName, String jobName, String salary);
}
