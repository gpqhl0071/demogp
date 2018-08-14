package com.gp.demogp.dao;

import com.gp.demogp.bean.WithdrawBean;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;

/**
 * @author gao peng
 * @date 2018/5/22 17:48
 */
public interface WithdrawDao {

  public List<WithdrawBean> queryList();
}
