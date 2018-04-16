package com.pineconecredit.api.entity;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.*;

/**
 * 银行卡账户
 *
 * @author ZhouRunBin
 * @email 1875222156@qq.com
 * @date 2018-04-16 23:30:47
 */
@Table(name = "wallet_bank_card")
public class WalletBankCard implements Serializable{
private static final long serialVersionUID=1L;

        //
    @Id
    private Integer id;
    
        //账户编号
    @Column(name = "aid")
    private String aid;
    
        //银行卡账户
    @Column(name = "card_number")
    private String cardNumber;
    
        //银行卡账户类型
    @Column(name = "bank_card_type")
    private String bankCardType;
    
        //持卡人名称
    @Column(name = "cardholder_name")
    private String cardholderName;
    
        //银行预留手机号码
    @Column(name = "cardholder_mobile")
    private String cardholderMobile;
    
        //持卡人身份证号码
    @Column(name = "cardholder_id_card_no")
    private String cardholderIdCardNo;
    
        //是否认证状态 0 未认证 1 已认证
    @Column(name = "card_auth_state")
    private String cardAuthState;
    
        //绑卡时间
    @Column(name = "bind_time")
    private Date bindTime;
    

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
     * 设置：账户编号
     */
    public void setAid(String aid) {
            this.aid = aid;
    }
    /**
     * 获取：账户编号
     */
    public String getAid() {
            return aid;
    }
    /**
     * 设置：银行卡账户
     */
    public void setCardNumber(String cardNumber) {
            this.cardNumber = cardNumber;
    }
    /**
     * 获取：银行卡账户
     */
    public String getCardNumber() {
            return cardNumber;
    }
    /**
     * 设置：银行卡账户类型
     */
    public void setBankCardType(String bankCardType) {
            this.bankCardType = bankCardType;
    }
    /**
     * 获取：银行卡账户类型
     */
    public String getBankCardType() {
            return bankCardType;
    }
    /**
     * 设置：持卡人名称
     */
    public void setCardholderName(String cardholderName) {
            this.cardholderName = cardholderName;
    }
    /**
     * 获取：持卡人名称
     */
    public String getCardholderName() {
            return cardholderName;
    }
    /**
     * 设置：银行预留手机号码
     */
    public void setCardholderMobile(String cardholderMobile) {
            this.cardholderMobile = cardholderMobile;
    }
    /**
     * 获取：银行预留手机号码
     */
    public String getCardholderMobile() {
            return cardholderMobile;
    }
    /**
     * 设置：持卡人身份证号码
     */
    public void setCardholderIdCardNo(String cardholderIdCardNo) {
            this.cardholderIdCardNo = cardholderIdCardNo;
    }
    /**
     * 获取：持卡人身份证号码
     */
    public String getCardholderIdCardNo() {
            return cardholderIdCardNo;
    }
    /**
     * 设置：是否认证状态 0 未认证 1 已认证
     */
    public void setCardAuthState(String cardAuthState) {
            this.cardAuthState = cardAuthState;
    }
    /**
     * 获取：是否认证状态 0 未认证 1 已认证
     */
    public String getCardAuthState() {
            return cardAuthState;
    }
    /**
     * 设置：绑卡时间
     */
    public void setBindTime(Date bindTime) {
            this.bindTime = bindTime;
    }
    /**
     * 获取：绑卡时间
     */
    public Date getBindTime() {
            return bindTime;
    }
}