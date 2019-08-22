package com.fjut.oj.edu.dao;


import com.fjut.oj.edu.model.Discuss;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DiscussDao {

    List<Discuss> queryByAll();

    void insert(Discuss discuss);

}