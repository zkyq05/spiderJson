package com.zkyq.spiderJson.dao;

import com.zkyq.spiderJson.modle.Lagou;
import com.zkyq.spiderJson.modle.Zhilian;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ZhilianRepository extends JpaRepository<Zhilian, Long> {
    List<Zhilian> findByCompanyNameAndJobNameAndSalary(String companyName, String jobName, String salary);
    List<Zhilian> findByPositionURL(String positionURL);
    Zhilian findOneByPositionURL(String positionURL);
    @Modifying
    @Query(value ="update zhilian p set p.detail_position=?1,p.detail_company=?2,p.detail_salary=?3 where p.positionurl=?4 ", nativeQuery = true)
    public void updateDetail(@Param("detail_position")String detail_position, @Param("detail_company")String detail_company, @Param("detail_salary")String detail_salary, @Param("positionurl")String positionurl);
}
