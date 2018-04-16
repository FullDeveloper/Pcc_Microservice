package com.pineconecredit.api.entity;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.*;

/**
 * 卡商主账号信息
 *
 * @author ZhouRunBin
 * @email 1875222156@qq.com
 * @date 2018-04-16 23:11:01
 */
@Table(name = "card_merchant")
public class CardMerchant implements Serializable{
private static final long serialVersionUID=1L;

        //
    @Id
    private Integer id;
    
        //企业名称
    @Column(name = "company_name")
    private String companyName;
    
        //公司常驻办公地址
    @Column(name = "address")
    private String address;
    
        //入驻协议
    @Column(name = "enter_protocol")
    private String enterProtocol;
    
        //身份证正面扫描件
    @Column(name = "id_card_front_scan")
    private String idCardFrontScan;
    
        //身份证反面扫描件
    @Column(name = "id_card_reverse_scan")
    private String idCardReverseScan;
    
        //营业执照编号
    @Column(name = "license_number")
    private String licenseNumber;
    
        //营业执照图片
    @Column(name = "license_photo")
    private String licensePhoto;
    
        //开户许可证编号
    @Column(name = "open_bank_numnber")
    private String openBankNumnber;
    
        //开户许可证扫描件
    @Column(name = "open_bank_sacn")
    private String openBankSacn;
    
        //地区编码
    @Column(name = "area_code")
    private String areaCode;
    
        //审核人
    @Column(name = "audit_user")
    private String auditUser;
    
        //审核意见
    @Column(name = "audit_feedback")
    private String auditFeedback;
    
        //审核时间
    @Column(name = "audit_time")
    private Date auditTime;
    
        //审核状态
    @Column(name = "audit_state")
    private String auditState;
    
        //企业联系人名称
    @Column(name = "enterprise_linkman_name")
    private String enterpriseLinkmanName;
    
        //企业联系人电话
    @Column(name = "enterprise_linkman_mobile")
    private String enterpriseLinkmanMobile;
    
        //管理员平台账号编号
    @Column(name = "admin_aid")
    private String adminAid;
    
        //管理员姓名
    @Column(name = "admin_name")
    private String adminName;
    
        //管理员手机号码
    @Column(name = "admin_mobile")
    private String adminMobile;
    
        //管理员身份证号码
    @Column(name = "admin_id_card_no")
    private String adminIdCardNo;
    
        //管理员身份证反面扫描件
    @Column(name = "admin_id_card_reverse_scan")
    private String adminIdCardReverseScan;
    
        //管理员身份证正面扫描件
    @Column(name = "admin_id_card_front_scan")
    private String adminIdCardFrontScan;
    

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
     * 设置：企业名称
     */
    public void setCompanyName(String companyName) {
            this.companyName = companyName;
    }
    /**
     * 获取：企业名称
     */
    public String getCompanyName() {
            return companyName;
    }
    /**
     * 设置：公司常驻办公地址
     */
    public void setAddress(String address) {
            this.address = address;
    }
    /**
     * 获取：公司常驻办公地址
     */
    public String getAddress() {
            return address;
    }
    /**
     * 设置：入驻协议
     */
    public void setEnterProtocol(String enterProtocol) {
            this.enterProtocol = enterProtocol;
    }
    /**
     * 获取：入驻协议
     */
    public String getEnterProtocol() {
            return enterProtocol;
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
     * 设置：营业执照编号
     */
    public void setLicenseNumber(String licenseNumber) {
            this.licenseNumber = licenseNumber;
    }
    /**
     * 获取：营业执照编号
     */
    public String getLicenseNumber() {
            return licenseNumber;
    }
    /**
     * 设置：营业执照图片
     */
    public void setLicensePhoto(String licensePhoto) {
            this.licensePhoto = licensePhoto;
    }
    /**
     * 获取：营业执照图片
     */
    public String getLicensePhoto() {
            return licensePhoto;
    }
    /**
     * 设置：开户许可证编号
     */
    public void setOpenBankNumnber(String openBankNumnber) {
            this.openBankNumnber = openBankNumnber;
    }
    /**
     * 获取：开户许可证编号
     */
    public String getOpenBankNumnber() {
            return openBankNumnber;
    }
    /**
     * 设置：开户许可证扫描件
     */
    public void setOpenBankSacn(String openBankSacn) {
            this.openBankSacn = openBankSacn;
    }
    /**
     * 获取：开户许可证扫描件
     */
    public String getOpenBankSacn() {
            return openBankSacn;
    }
    /**
     * 设置：地区编码
     */
    public void setAreaCode(String areaCode) {
            this.areaCode = areaCode;
    }
    /**
     * 获取：地区编码
     */
    public String getAreaCode() {
            return areaCode;
    }
    /**
     * 设置：审核人
     */
    public void setAuditUser(String auditUser) {
            this.auditUser = auditUser;
    }
    /**
     * 获取：审核人
     */
    public String getAuditUser() {
            return auditUser;
    }
    /**
     * 设置：审核意见
     */
    public void setAuditFeedback(String auditFeedback) {
            this.auditFeedback = auditFeedback;
    }
    /**
     * 获取：审核意见
     */
    public String getAuditFeedback() {
            return auditFeedback;
    }
    /**
     * 设置：审核时间
     */
    public void setAuditTime(Date auditTime) {
            this.auditTime = auditTime;
    }
    /**
     * 获取：审核时间
     */
    public Date getAuditTime() {
            return auditTime;
    }
    /**
     * 设置：审核状态
     */
    public void setAuditState(String auditState) {
            this.auditState = auditState;
    }
    /**
     * 获取：审核状态
     */
    public String getAuditState() {
            return auditState;
    }
    /**
     * 设置：企业联系人名称
     */
    public void setEnterpriseLinkmanName(String enterpriseLinkmanName) {
            this.enterpriseLinkmanName = enterpriseLinkmanName;
    }
    /**
     * 获取：企业联系人名称
     */
    public String getEnterpriseLinkmanName() {
            return enterpriseLinkmanName;
    }
    /**
     * 设置：企业联系人电话
     */
    public void setEnterpriseLinkmanMobile(String enterpriseLinkmanMobile) {
            this.enterpriseLinkmanMobile = enterpriseLinkmanMobile;
    }
    /**
     * 获取：企业联系人电话
     */
    public String getEnterpriseLinkmanMobile() {
            return enterpriseLinkmanMobile;
    }
    /**
     * 设置：管理员平台账号编号
     */
    public void setAdminAid(String adminAid) {
            this.adminAid = adminAid;
    }
    /**
     * 获取：管理员平台账号编号
     */
    public String getAdminAid() {
            return adminAid;
    }
    /**
     * 设置：管理员姓名
     */
    public void setAdminName(String adminName) {
            this.adminName = adminName;
    }
    /**
     * 获取：管理员姓名
     */
    public String getAdminName() {
            return adminName;
    }
    /**
     * 设置：管理员手机号码
     */
    public void setAdminMobile(String adminMobile) {
            this.adminMobile = adminMobile;
    }
    /**
     * 获取：管理员手机号码
     */
    public String getAdminMobile() {
            return adminMobile;
    }
    /**
     * 设置：管理员身份证号码
     */
    public void setAdminIdCardNo(String adminIdCardNo) {
            this.adminIdCardNo = adminIdCardNo;
    }
    /**
     * 获取：管理员身份证号码
     */
    public String getAdminIdCardNo() {
            return adminIdCardNo;
    }
    /**
     * 设置：管理员身份证反面扫描件
     */
    public void setAdminIdCardReverseScan(String adminIdCardReverseScan) {
            this.adminIdCardReverseScan = adminIdCardReverseScan;
    }
    /**
     * 获取：管理员身份证反面扫描件
     */
    public String getAdminIdCardReverseScan() {
            return adminIdCardReverseScan;
    }
    /**
     * 设置：管理员身份证正面扫描件
     */
    public void setAdminIdCardFrontScan(String adminIdCardFrontScan) {
            this.adminIdCardFrontScan = adminIdCardFrontScan;
    }
    /**
     * 获取：管理员身份证正面扫描件
     */
    public String getAdminIdCardFrontScan() {
            return adminIdCardFrontScan;
    }
}