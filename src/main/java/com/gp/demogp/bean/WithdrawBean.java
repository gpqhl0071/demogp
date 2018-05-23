package com.gp.demogp.bean;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;

import java.util.Date;

/**
 * @author gao peng
 * @date 2018/5/22 18:16
 */
public class WithdrawBean {

  /****/
  private java.lang.Integer id;
  /**
   * 用户ID
   **/
  private java.lang.Integer userId;
  /**
   * 银行卡主键ID
   **/
  private java.lang.Integer bankCardId;
  /**
   * 币种1人民币 2美金 3港币
   **/
  private java.lang.Integer curreny;
  /**
   * 取款金额
   **/
  private java.lang.Long amount;
  /**
   * 取款手续费
   **/
  private java.lang.Long fee;
  /**
   * 申请时间
   **/
  private java.util.Date applyTime;
  /**
   * 第一次审核时间
   **/
  private java.util.Date auditTime1;
  /**
   * 第二次审核时间
   **/
  private java.util.Date auditTime2;
  /**
   * 发送到第三方支付公司时间
   **/
  private java.util.Date sendTime;
  /**
   * 支付时间（从银行更新时的时间）
   **/
  private java.util.Date payTime;
  /**
   * 0-提交申请 1-审核不通过 2-审核通过 3-拒绝支付 4-同意支付 5-支付成功 6-支付失败 7-线下同意支付 8-线下支付成功 9-线下支付失败 10-线下支付退款
   **/
  private java.lang.Integer state;
  /**
   * 打款结果描述
   **/
  private java.lang.String stateDesc;
  /**
   * 删除 1正常 0已删除
   **/
  private java.lang.Integer flag;
  /**
   * 打款批次号
   **/
  private java.lang.String batchNo;
  /**
   * 商户订单号、流水号
   **/
  private java.lang.String orderId;
  /**
   * 支付通道：0：线下支付；1：易宝；3：易汇金；  4：unionpay 5：chinapay
   **/
  private java.lang.String payChannel;

  @Override
  public String toString() {
    return "WithdrawBean{" +
      "id=" + id +
      ", userId=" + userId +
      ", bankCardId=" + bankCardId +
      ", curreny=" + curreny +
      ", amount=" + amount +
      ", fee=" + fee +
      ", applyTime=" + applyTime +
      ", auditTime1=" + auditTime1 +
      ", auditTime2=" + auditTime2 +
      ", sendTime=" + sendTime +
      ", payTime=" + payTime +
      ", state=" + state +
      ", stateDesc='" + stateDesc + '\'' +
      ", flag=" + flag +
      ", batchNo='" + batchNo + '\'' +
      ", orderId='" + orderId + '\'' +
      ", payChannel='" + payChannel + '\'' +
      '}';
  }

  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public Integer getUserId() {
    return userId;
  }

  public void setUserId(Integer userId) {
    this.userId = userId;
  }

  public Integer getBankCardId() {
    return bankCardId;
  }

  public void setBankCardId(Integer bankCardId) {
    this.bankCardId = bankCardId;
  }

  public Integer getCurreny() {
    return curreny;
  }

  public void setCurreny(Integer curreny) {
    this.curreny = curreny;
  }

  public Long getAmount() {
    return amount;
  }

  public void setAmount(Long amount) {
    this.amount = amount;
  }

  public Long getFee() {
    return fee;
  }

  public void setFee(Long fee) {
    this.fee = fee;
  }

  public Date getApplyTime() {
    return applyTime;
  }

  public void setApplyTime(Date applyTime) {
    this.applyTime = applyTime;
  }

  public Date getAuditTime1() {
    return auditTime1;
  }

  public void setAuditTime1(Date auditTime1) {
    this.auditTime1 = auditTime1;
  }

  public Date getAuditTime2() {
    return auditTime2;
  }

  public void setAuditTime2(Date auditTime2) {
    this.auditTime2 = auditTime2;
  }

  public Date getSendTime() {
    return sendTime;
  }

  public void setSendTime(Date sendTime) {
    this.sendTime = sendTime;
  }

  public Date getPayTime() {
    return payTime;
  }

  public void setPayTime(Date payTime) {
    this.payTime = payTime;
  }

  public Integer getState() {
    return state;
  }

  public void setState(Integer state) {
    this.state = state;
  }

  public String getStateDesc() {
    return stateDesc;
  }

  public void setStateDesc(String stateDesc) {
    this.stateDesc = stateDesc;
  }

  public Integer getFlag() {
    return flag;
  }

  public void setFlag(Integer flag) {
    this.flag = flag;
  }

  public String getBatchNo() {
    return batchNo;
  }

  public void setBatchNo(String batchNo) {
    this.batchNo = batchNo;
  }

  public String getOrderId() {
    return orderId;
  }

  public void setOrderId(String orderId) {
    this.orderId = orderId;
  }

  public String getPayChannel() {
    return payChannel;
  }

  public void setPayChannel(String payChannel) {
    this.payChannel = payChannel;
  }
}
