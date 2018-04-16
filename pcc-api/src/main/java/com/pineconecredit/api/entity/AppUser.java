package com.pineconecredit.api.entity;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.*;

/**
 * 移动端用户
 *
 * @author ZhouRunBin
 * @email 1875222156@qq.com
 * @date 2018-04-16 23:11:01
 */
@Table(name = "app_user")
public class AppUser implements Serializable{
private static final long serialVersionUID=1L;

        //
    @Id
    private Integer id;
    
        //全系统唯一账号编号
    @Column(name = "aid")
    private String aid;
    
        //身份证号码
    @Column(name = "id_card_no")
    private String idCardNo;
    
        //身份证上名称
    @Column(name = "auth_name")
    private String authName;
    
        //用户昵称
    @Column(name = "nick_name")
    private String nickName;
    
        //用户照片
    @Column(name = "photo")
    private String photo;
    
        //身份证正面扫描件
    @Column(name = "id_card_front_scan")
    private String idCardFrontScan;
    
        //身份证反面扫描件
    @Column(name = "id_card_reverse_scan")
    private String idCardReverseScan;
    
        //实名认证状态 0 未认证 1 认证通过
    @Column(name = "real_name_auth")
    private String realNameAuth;
    
        //阿里认证状态0未认证 1 已认证
    @Column(name = "alipay_auth")
    private String alipayAuth;
    
        //运营商认证状态 0 未认证 1 已认证
    @Column(name = "operator_auth")
    private String operatorAuth;
    
        //芝麻信用认证状态 0未认证 1已认证
    @Column(name = "zhima_auth")
    private String zhimaAuth;
    
        //联系人1名称
    @Column(name = "linkman_name1")
    private String linkmanName1;
    
        //联系人1关系
    @Column(name = "linkman_relation1")
    private String linkmanRelation1;
    
        //联系人1手机
    @Column(name = "linkman_mobile1")
    private String linkmanMobile1;
    
        //联系人2名称
    @Column(name = "linkman_name2")
    private String linkmanName2;
    
        //联系人2关系
    @Column(name = "linkman_relation2")
    private String linkmanRelation2;
    
        //联系人2手机
    @Column(name = "linkman_mobile")
    private String linkmanMobile;
    
        //生日 身份证获取
    @Column(name = "birthday")
    private String birthday;
    
        //性别 身份证获取
    @Column(name = "sex")
    private String sex;
    
        //家庭住址 身份证获取
    @Column(name = "address")
    private String address;
    
        //身份证所在城市代码
    @Column(name = "area_code")
    private String areaCode;
    

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
     * 设置：全系统唯一账号编号
     */
    public void setAid(String aid) {
            this.aid = aid;
    }
    /**
     * 获取：全系统唯一账号编号
     */
    public String getAid() {
            return aid;
    }
    /**
     * 设置：身份证号码
     */
    public void setIdCardNo(String idCardNo) {
            this.idCardNo = idCardNo;
    }
    /**
     * 获取：身份证号码
     */
    public String getIdCardNo() {
            return idCardNo;
    }
    /**
     * 设置：身份证上名称
     */
    public void setAuthName(String authName) {
            this.authName = authName;
    }
    /**
     * 获取：身份证上名称
     */
    public String getAuthName() {
            return authName;
    }
    /**
     * 设置：用户昵称
     */
    public void setNickName(String nickName) {
            this.nickName = nickName;
    }
    /**
     * 获取：用户昵称
     */
    public String getNickName() {
            return nickName;
    }
    /**
     * 设置：用户照片
     */
    public void setPhoto(String photo) {
            this.photo = photo;
    }
    /**
     * 获取：用户照片
     */
    public String getPhoto() {
            return photo;
    }
    /**
     * 设置：身份证正面扫描件
     */
    public void setIdCardFrontScan(String idCardFrontScan) {
            this.idCardFrontScan = idCardFrontScan;
    }
    /**
     * 获取：身份证正面扫描件
     */
    public String getIdCardFrontScan() {
            return idCardFrontScan;
    }
    /**
     * 设置：身份证反面扫描件
     */
    public void setIdCardReverseScan(String idCardReverseScan) {
            this.idCardReverseScan = idCardReverseScan;
    }
    /**
     * 获取：身份证反面扫描件
     */
    public String getIdCardReverseScan() {
            return idCardReverseScan;
    }
    /**
     * 设置：实名认证状态 0 未认证 1 认证通过
     */
    public void setRealNameAuth(String realNameAuth) {
            this.realNameAuth = realNameAuth;
    }
    /**
     * 获取：实名认证状态 0 未认证 1 认证通过
     */
    public String getRealNameAuth() {
            return realNameAuth;
    }
    /**
     * 设置：阿里认证状态0未认证 1 已认证
     */
    public void setAlipayAuth(String alipayAuth) {
            this.alipayAuth = alipayAuth;
    }
    /**
     * 获取：阿里认证状态0未认证 1 已认证
     */
    public String getAlipayAuth() {
            return alipayAuth;
    }
    /**
     * 设置：运营商认证状态 0 未认证 1 已认证
     */
    public void setOperatorAuth(String operatorAuth) {
            this.operatorAuth = operatorAuth;
    }
    /**
     * 获取：运营商认证状态 0 未认证 1 已认证
     */
    public String getOperatorAuth() {
            return operatorAuth;
    }
    /**
     * 设置：芝麻信用认证状态 0未认证 1已认证
     */
    public void setZhimaAuth(String zhimaAuth) {
            this.zhimaAuth = zhimaAuth;
    }
    /**
     * 获取：芝麻信用认证状态 0未认证 1已认证
     */
    public String getZhimaAuth() {
            return zhimaAuth;
    }
    /**
     * 设置：联系人1名称
     */
    public void setLinkmanName1(String linkmanName1) {
            this.linkmanName1 = linkmanName1;
    }
    /**
     * 获取：联系人1名称
     */
    public String getLinkmanName1() {
            return linkmanName1;
    }
    /**
     * 设置：联系人1关系
     */
    public void setLinkmanRelation1(String linkmanRelation1) {
            this.linkmanRelation1 = linkmanRelation1;
    }
    /**
     * 获取：联系人1关系
     */
    public String getLinkmanRelation1() {
            return linkmanRelation1;
    }
    /**
     * 设置：联系人1手机
     */
    public void setLinkmanMobile1(String linkmanMobile1) {
            this.linkmanMobile1 = linkmanMobile1;
    }
    /**
     * 获取：联系人1手机
     */
    public String getLinkmanMobile1() {
            return linkmanMobile1;
    }
    /**
     * 设置：联系人2名称
     */
    public void setLinkmanName2(String linkmanName2) {
            this.linkmanName2 = linkmanName2;
    }
    /**
     * 获取：联系人2名称
     */
    public String getLinkmanName2() {
            return linkmanName2;
    }
    /**
     * 设置：联系人2关系
     */
    public void setLinkmanRelation2(String linkmanRelation2) {
            this.linkmanRelation2 = linkmanRelation2;
    }
    /**
     * 获取：联系人2关系
     */
    public String getLinkmanRelation2() {
            return linkmanRelation2;
    }
    /**
     * 设置：联系人2手机
     */
    public void setLinkmanMobile(String linkmanMobile) {
            this.linkmanMobile = linkmanMobile;
    }
    /**
     * 获取：联系人2手机
     */
    public String getLinkmanMobile() {
            return linkmanMobile;
    }
    /**
     * 设置：生日 身份证获取
     */
    public void setBirthday(String birthday) {
            this.birthday = birthday;
    }
    /**
     * 获取：生日 身份证获取
     */
    public String getBirthday() {
            return birthday;
    }
    /**
     * 设置：性别 身份证获取
     */
    public void setSex(String sex) {
            this.sex = sex;
    }
    /**
     * 获取：性别 身份证获取
     */
    public String getSex() {
            return sex;
    }
    /**
     * 设置：家庭住址 身份证获取
     */
    public void setAddress(String address) {
            this.address = address;
    }
    /**
     * 获取：家庭住址 身份证获取
     */
    public String getAddress() {
            return address;
    }
    /**
     * 设置：身份证所在城市代码
     */
    public void setAreaCode(String areaCode) {
            this.areaCode = areaCode;
    }
    /**
     * 获取：身份证所在城市代码
     */
    public String getAreaCode() {
            return areaCode;
    }
}