package com.zkyq.spiderJson.dao;

import com.zkyq.spiderJson.modle.Lagou;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LagouRepository extends JpaRepository<Lagou, Long> {
    Lagou findByCompanyNameAndPositionnameAndSalary(String companyName,String positionname,String salary);
}
