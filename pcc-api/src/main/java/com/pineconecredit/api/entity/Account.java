package com.pineconecredit.api.entity;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.*;

/**
 * 基础账号表
 *
 * @author ZhouRunBin
 * @email 1875222156@qq.com
 * @date 2018-04-16 23:11:01
 */
@Table(name = "account")
public class Account implements Serializable{
private static final long serialVersionUID=1L;

        //
    @Id
    private Integer id;
    
        //全系统交易编码
    @Column(name = "aid")
    private String aid;
    
        //账户类型区分登陆系统
/* 0:平台总账户
 1:平台员工_绑定权限角色模板
 2:普通用户
 3:发卡方主账户
 4:发卡方员工_绑定权限角色模板
 5:商家主账户
 6:商家员工_绑定权限角色模板
 7:商家门店主账户
 8:商家门店员工_绑定权限角色模板
 9:商家电商平台虚拟门店主账户
 10:商家电商平台虚拟门店员工_绑定权限角色模板
 11:信用卡销售公司主账户
 12:信用卡销售公司员工_绑定权限角色模板*/
    @Column(name = "account_type")
    private String accountType;
    
        //父级账号
    @Column(name = "pid")
    private String pid;
    
        //注册手机号，作为登陆账号
    @Column(name = "reg_phone_number")
    private String regPhoneNumber;
    
        //登陆密码
    @Column(name = "password")
    private String password;
    
        //账号状态 0：未审核 1：启用 2：禁用 3：已删除
    @Column(name = "state")
    private String state;
    
        //自己的信息，关联系统文件表
    @Column(name = "self_info")
    private String selfInfo;
    
        //支付二维码
    @Column(name = "pay_qrcode")
    private String payQrcode;
    
        //收款二维码
    @Column(name = "receive_qrocde")
    private String receiveQrocde;
    
        //我的信息链接地址
    @Column(name = "self_info_url")
    private String selfInfoUrl;
    
        //支付二维码链接地址
    @Column(name = "pay_qrcode_url")
    private String payQrcodeUrl;
    
        //收款二维码链接地址
    @Column(name = "receive_qrcode_url")
    private String receiveQrcodeUrl;
    
        //最近一次登陆时间
    @Column(name = "last_login_time")
    private Date lastLoginTime;
    
        //创建人
    @Column(name = "crt_user")
    private String crtUser;
    
        //创建人名称
    @Column(name = "crt_name")
    private String crtName;
    
        //创建人IP地址
    @Column(name = "crt_host")
    private String crtHost;
    
        //创建时间
    @Column(name = "crt_time")
    private Date crtTime;
    
        //修改人
    @Column(name = "upd_user")
    private String updUser;
    
        //修改人名称
    @Column(name = "upd_name")
    private String updName;
    
        //修改时间
    @Column(name = "upd_time")
    private Date updTime;
    
        //修改人IP地址
    @Column(name = "upd_host")
    private String updHost;
    

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
     * 设置：全系统交易编码
     */
    public void setAid(String aid) {
            this.aid = aid;
    }
    /**
     * 获取：全系统交易编码
     */
    public String getAid() {
            return aid;
    }
    /**
     * 设置：账户类型区分登陆系统
 0:平台总账户
 1:平台员工_绑定权限角色模板
 2:普通用户
 3:发卡方主账户
 4:发卡方员工_绑定权限角色模板
 5:商家主账户
 6:商家员工_绑定权限角色模板
 7:商家门店主账户
 8:商家门店员工_绑定权限角色模板
 9:商家电商平台虚拟门店主账户
 10:商家电商平台虚拟门店员工_绑定权限角色模板
 11:信用卡销售公司主账户
 12:信用卡销售公司员工_绑定权限角色模板
     */
    public void setAccountType(String accountType) {
            this.accountType = accountType;
    }
    /**
     * 获取：账户类型区分登陆系统
 0:平台总账户
 1:平台员工_绑定权限角色模板
 2:普通用户
 3:发卡方主账户
 4:发卡方员工_绑定权限角色模板
 5:商家主账户
 6:商家员工_绑定权限角色模板
 7:商家门店主账户
 8:商家门店员工_绑定权限角色模板
 9:商家电商平台虚拟门店主账户
 10:商家电商平台虚拟门店员工_绑定权限角色模板
 11:信用卡销售公司主账户
 12:信用卡销售公司员工_绑定权限角色模板
     */
    public String getAccountType() {
            return accountType;
    }
    /**
     * 设置：父级账号
     */
    public void setPid(String pid) {
            this.pid = pid;
    }
    /**
     * 获取：父级账号
     */
    public String getPid() {
            return pid;
    }
    /**
     * 设置：注册手机号，作为登陆账号
     */
    public void setRegPhoneNumber(String regPhoneNumber) {
            this.regPhoneNumber = regPhoneNumber;
    }
    /**
     * 获取：注册手机号，作为登陆账号
     */
    public String getRegPhoneNumber() {
            return regPhoneNumber;
    }
    /**
     * 设置：登陆密码
     */
    public void setPassword(String password) {
            this.password = password;
    }
    /**
     * 获取：登陆密码
     */
    public String getPassword() {
            return password;
    }
    /**
     * 设置：账号状态 0：未审核 1：启用 2：禁用 3：已删除
     */
    public void setState(String state) {
            this.state = state;
    }
    /**
     * 获取：账号状态 0：未审核 1：启用 2：禁用 3：已删除
     */
    public String getState() {
            return state;
    }
    /**
     * 设置：自己的信息，关联系统文件表
     */
    public void setSelfInfo(String selfInfo) {
            this.selfInfo = selfInfo;
    }
    /**
     * 获取：自己的信息，关联系统文件表
     */
    public String getSelfInfo() {
            return selfInfo;
    }
    /**
     * 设置：支付二维码
     */
    public void setPayQrcode(String payQrcode) {
            this.payQrcode = payQrcode;
    }
    /**
     * 获取：支付二维码
     */
    public String getPayQrcode() {
            return payQrcode;
    }
    /**
     * 设置：收款二维码
     */
    public void setReceiveQrocde(String receiveQrocde) {
            this.receiveQrocde = receiveQrocde;
    }
    /**
     * 获取：收款二维码
     */
    public String getReceiveQrocde() {
            return receiveQrocde;
    }
    /**
     * 设置：我的信息链接地址
     */
    public void setSelfInfoUrl(String selfInfoUrl) {
            this.selfInfoUrl = selfInfoUrl;
    }
    /**
     * 获取：我的信息链接地址
     */
    public String getSelfInfoUrl() {
            return selfInfoUrl;
    }
    /**
     * 设置：支付二维码链接地址
     */
    public void setPayQrcodeUrl(String payQrcodeUrl) {
            this.payQrcodeUrl = payQrcodeUrl;
    }
    /**
     * 获取：支付二维码链接地址
     */
    public String getPayQrcodeUrl() {
            return payQrcodeUrl;
    }
    /**
     * 设置：收款二维码链接地址
     */
    public void setReceiveQrcodeUrl(String receiveQrcodeUrl) {
            this.receiveQrcodeUrl = receiveQrcodeUrl;
    }
    /**
     * 获取：收款二维码链接地址
     */
    public String getReceiveQrcodeUrl() {
            return receiveQrcodeUrl;
    }
    /**
     * 设置：最近一次登陆时间
     */
    public void setLastLoginTime(Date lastLoginTime) {
            this.lastLoginTime = lastLoginTime;
    }
    /**
     * 获取：最近一次登陆时间
     */
    public Date getLastLoginTime() {
            return lastLoginTime;
    }
    /**
     * 设置：创建人
     */
    public void setCrtUser(String crtUser) {
            this.crtUser = crtUser;
    }
    /**
     * 获取：创建人
     */
    public String getCrtUser() {
            return crtUser;
    }
    /**
     * 设置：创建人名称
     */
    public void setCrtName(String crtName) {
            this.crtName = crtName;
    }
    /**
     * 获取：创建人名称
     */
    public String getCrtName() {
            return crtName;
    }
    /**
     * 设置：创建人IP地址
     */
    public void setCrtHost(String crtHost) {
            this.crtHost = crtHost;
    }
    /**
     * 获取：创建人IP地址
     */
    public String getCrtHost() {
            return crtHost;
    }
    /**
     * 设置：创建时间
     */
    public void setCrtTime(Date crtTime) {
            this.crtTime = crtTime;
    }
    /**
     * 获取：创建时间
     */
    public Date getCrtTime() {
            return crtTime;
    }
    /**
     * 设置：修改人
     */
    public void setUpdUser(String updUser) {
            this.updUser = updUser;
    }
    /**
     * 获取：修改人
     */
    public String getUpdUser() {
            return updUser;
    }
    /**
     * 设置：修改人名称
     */
    public void setUpdName(String updName) {
            this.updName = updName;
    }
    /**
     * 获取：修改人名称
     */
    public String getUpdName() {
            return updName;
    }
    /**
     * 设置：修改时间
     */
    public void setUpdTime(Date updTime) {
            this.updTime = updTime;
    }
    /**
     * 获取：修改时间
     */
    public Date getUpdTime() {
            return updTime;
    }
    /**
     * 设置：修改人IP地址
     */
    public void setUpdHost(String updHost) {
            this.updHost = updHost;
    }
    /**
     * 获取：修改人IP地址
     */
    public String getUpdHost() {
            return updHost;
    }
}