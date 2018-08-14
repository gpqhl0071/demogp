package com.gp.demogp.service.impl;

import com.gp.demogp.bean.WithdrawBean;
import com.gp.demogp.mapper.WithdrawDao;
import com.gp.demogp.service.WithdrawService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author gao peng
 * @date 2018/5/22 17:56
 */
@Service
public class WithdrawServiceImpl implements WithdrawService {
  @Autowired
  private WithdrawDao withdrawDao;

  @Override
  public List<WithdrawBean> queryList() {
    return withdrawDao.queryList();
  }
}
