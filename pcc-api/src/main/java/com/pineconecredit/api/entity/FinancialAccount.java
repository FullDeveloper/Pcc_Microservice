package com.pineconecredit.api.entity;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.*;

/**
 * 资金账户表
 *
 * @author ZhouRunBin
 * @email 1875222156@qq.com
 * @date 2018-04-16 23:11:01
 */
@Table(name = "financial_account")
public class FinancialAccount implements Serializable{
private static final long serialVersionUID=1L;

        //
    @Id
    private Integer id;
    
        //所属用户
    @Column(name = "aid")
    private String aid;
    
        //现金账户
    @Column(name = "cash_account")
    private String cashAccount;
    
        //冻结账户
    @Column(name = "freeze_account")
    private String freezeAccount;
    
        //佣金账户
    @Column(name = "commission_account")
    private String commissionAccount;
    
        //统计银行卡数量
    @Column(name = "bank_card_count")
    private Integer bankCardCount;
    
        //虚拟卡数量
    @Column(name = "virtual_card_count")
    private Integer virtualCardCount;
    
        //三方支付账户
    @Column(name = "third_payment_account")
    private String thirdPaymentAccount;
    
        //对公公司名称
    @Column(name = "public_name")
    private String publicName;
    
        //对公税号
    @Column(name = "public_tax_file_number")
    private String publicTaxFileNumber;
    
        //对公地址

    @Column(name = "public_address")
    private String publicAddress;
    
        //对公电话
    @Column(name = "public_telephone")
    private String publicTelephone;
    
        //对公开户行
    @Column(name = "public_account_bank")
    private String publicAccountBank;
    
        //对公账号名
    @Column(name = "public_account_name")
    private String publicAccountName;
    
        //对公账户号码
    @Column(name = "public_account_number")
    private String publicAccountNumber;
    

    /**
     * 设置：
     */
    public void setId(Integer id) {
            this.id = id;
    }
    /**
     * 获取：
     */
    public Integer getId() {
            return id;
    }
    /**
     * 设置：所属用户
     */
    public void setAid(String aid) {
            this.aid = aid;
    }
    /**
     * 获取：所属用户
     */
    public String getAid() {
            return aid;
    }
    /**
     * 设置：现金账户
     */
    public void setCashAccount(String cashAccount) {
            this.cashAccount = cashAccount;
    }
    /**
     * 获取：现金账户
     */
    public String getCashAccount() {
            return cashAccount;
    }
    /**
     * 设置：冻结账户
     */
    public void setFreezeAccount(String freezeAccount) {
            this.freezeAccount = freezeAccount;
    }
    /**
     * 获取：冻结账户
     */
    public String getFreezeAccount() {
            return freezeAccount;
    }
    /**
     * 设置：佣金账户
     */
    public void setCommissionAccount(String commissionAccount) {
            this.commissionAccount = commissionAccount;
    }
    /**
     * 获取：佣金账户
     */
    public String getCommissionAccount() {
            return commissionAccount;
    }
    /**
     * 设置：统计银行卡数量
     */
    public void setBankCardCount(Integer bankCardCount) {
            this.bankCardCount = bankCardCount;
    }
    /**
     * 获取：统计银行卡数量
     */
    public Integer getBankCardCount() {
            return bankCardCount;
    }
    /**
     * 设置：虚拟卡数量
     */
    public void setVirtualCardCount(Integer virtualCardCount) {
            this.virtualCardCount = virtualCardCount;
    }
    /**
     * 获取：虚拟卡数量
     */
    public Integer getVirtualCardCount() {
            return virtualCardCount;
    }
    /**
     * 设置：三方支付账户
     */
    public void setThirdPaymentAccount(String thirdPaymentAccount) {
            this.thirdPaymentAccount = thirdPaymentAccount;
    }
    /**
     * 获取：三方支付账户
     */
    public String getThirdPaymentAccount() {
            return thirdPaymentAccount;
    }
    /**
     * 设置：对公公司名称
     */
    public void setPublicName(String publicName) {
            this.publicName = publicName;
    }
    /**
     * 获取：对公公司名称
     */
    public String getPublicName() {
            return publicName;
    }
    /**
     * 设置：对公税号
     */
    public void setPublicTaxFileNumber(String publicTaxFileNumber) {
            this.publicTaxFileNumber = publicTaxFileNumber;
    }
    /**
     * 获取：对公税号
     */
    public String getPublicTaxFileNumber() {
            return publicTaxFileNumber;
    }
    /**
     * 设置：对公地址

     */
    public void setPublicAddress(String publicAddress) {
            this.publicAddress = publicAddress;
    }
    /**
     * 获取：对公地址

     */
    public String getPublicAddress() {
            return publicAddress;
    }
    /**
     * 设置：对公电话
     */
    public void setPublicTelephone(String publicTelephone) {
            this.publicTelephone = publicTelephone;
    }
    /**
     * 获取：对公电话
     */
    public String getPublicTelephone() {
            return publicTelephone;
    }
    /**
     * 设置：对公开户行
     */
    public void setPublicAccountBank(String publicAccountBank) {
            this.publicAccountBank = publicAccountBank;
    }
    /**
     * 获取：对公开户行
     */
    public String getPublicAccountBank() {
            return publicAccountBank;
    }
    /**
     * 设置：对公账号名
     */
    public void setPublicAccountName(String publicAccountName) {
            this.publicAccountName = publicAccountName;
    }
    /**
     * 获取：对公账号名
     */
    public String getPublicAccountName() {
            return publicAccountName;
    }
    /**
     * 设置：对公账户号码
     */
    public void setPublicAccountNumber(String publicAccountNumber) {
            this.publicAccountNumber = publicAccountNumber;
    }
    /**
     * 获取：对公账户号码
     */
    public String getPublicAccountNumber() {
            return publicAccountNumber;
    }
}