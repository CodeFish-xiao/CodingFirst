package com.fjut.oj.edu.dao;


import com.fjut.oj.edu.model.Discuss;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DiscussDao {

    Discuss queryDiscussById(Integer discussId);

    List<Discuss> queryByAll();

    void insert(@Param("discuss")Discuss discuss);

    int TotalRecord();

    List<Discuss> queryByUserId(Integer id);

}