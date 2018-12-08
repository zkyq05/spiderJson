package com.zkyq.spiderJson.dao;

import com.zkyq.spiderJson.modle.TGirls;
import com.zkyq.spiderJson.modle.Zhilian;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TGirlsRepository extends JpaRepository<TGirls, Long> {
    List<TGirls> findByTitle(String title);
}
