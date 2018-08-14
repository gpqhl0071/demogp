package com.gp.demogp.mapper;

import com.gp.demogp.bean.WithdrawBean;

import java.util.List;

/**
 * @author gao peng
 * @date 2018/5/22 17:48
 */
public interface WithdrawDao {

  public List<WithdrawBean> queryList();
}
