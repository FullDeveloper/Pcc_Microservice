package com.pineconecredit.api.entity;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.*;

/**
 * 商户主账号
 *
 * @author ZhouRunBin
 * @email 1875222156@qq.com
 * @date 2018-04-16 23:30:47
 */
@Table(name = "merchant")
public class Merchant implements Serializable{
private static final long serialVersionUID=1L;

        //
    @Id
    private Integer id;
    
        //全系统账号编号唯一
    @Column(name = "aid")
    private String aid;
    
        //商户名称
    @Column(name = "name")
    private String name;
    
        //商户地址
    @Column(name = "address")
    private String address;
    
        //地区编码
    @Column(name = "are_code")
    private String areCode;
    
        //入驻协议
    @Column(name = "enter_protocol")
    private String enterProtocol;
    
        //法人身份证扫描正面件
    @Column(name = "id_card_front_scan")
    private String idCardFrontScan;
    
        //身份证扫描反面件
    @Column(name = "id_card_reverse_scan")
    private String idCardReverseScan;
    
        //
    @Column(name = "license_number")
    private String licenseNumber;
    
        //营业执照照片
    @Column(name = "license_photo")
    private String licensePhoto;
    
        //开户许可证编号
    @Column(name = "open_bank_number")
    private String openBankNumber;
    
        //开户许可证扫描件
    @Column(name = "open_bank_scan")
    private String openBankScan;
    
        //其他材料
    @Column(name = "other_material")
    private String otherMaterial;
    
        //审核状态 0:未审核
 /*审核通过正常1:审核通过正常
 2:审核不通过
 3:该商户被禁停,此时如果AID未禁止那么仍然允许登陆*/
    @Column(name = "audit_state")
    private String auditState;
    
        //审核人
    @Column(name = "audit_user")
    private String auditUser;
    
        //审核时间
    @Column(name = "audit_time")
    private Date auditTime;
    
        //审核反馈
    @Column(name = "audit_feedback")
    private String auditFeedback;
    
        //企业联系人名称
    @Column(name = "enterprise_linkman_name")
    private String enterpriseLinkmanName;
    
        //企业联系人电话
    @Column(name = "enterprise_linkman_mobile")
    private String enterpriseLinkmanMobile;
    
        //管理员账号编码
    @Column(name = "admin_aid")
    private String adminAid;
    
        //管理员姓名
    @Column(name = "admin_name")
    private String adminName;
    
        //管理员手机号码
    @Column(name = "admin_id_card_no")
    private String adminIdCardNo;
    
        //管理员身份证正面扫描件
    @Column(name = "admin_id_card_front_scan")
    private String adminIdCardFrontScan;
    
        //
    @Column(name = "admin_id_card_reverse_scan")
    private String adminIdCardReverseScan;
    
        //管理员手机号
    @Column(name = "admin_mobile")
    private String adminMobile;
    

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
     * 设置：全系统账号编号唯一
     */
    public void setAid(String aid) {
            this.aid = aid;
    }
    /**
     * 获取：全系统账号编号唯一
     */
    public String getAid() {
            return aid;
    }
    /**
     * 设置：商户名称
     */
    public void setName(String name) {
            this.name = name;
    }
    /**
     * 获取：商户名称
     */
    public String getName() {
            return name;
    }
    /**
     * 设置：商户地址
     */
    public void setAddress(String address) {
            this.address = address;
    }
    /**
     * 获取：商户地址
     */
    public String getAddress() {
            return address;
    }
    /**
     * 设置：地区编码
     */
    public void setAreCode(String areCode) {
            this.areCode = areCode;
    }
    /**
     * 获取：地区编码
     */
    public String getAreCode() {
            return areCode;
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
     * 设置：法人身份证扫描正面件
     */
    public void setIdCardFrontScan(String idCardFrontScan) {
            this.idCardFrontScan = idCardFrontScan;
    }
    /**
     * 获取：法人身份证扫描正面件
     */
    public String getIdCardFrontScan() {
            return idCardFrontScan;
    }
    /**
     * 设置：身份证扫描反面件
     */
    public void setIdCardReverseScan(String idCardReverseScan) {
            this.idCardReverseScan = idCardReverseScan;
    }
    /**
     * 获取：身份证扫描反面件
     */
    public String getIdCardReverseScan() {
            return idCardReverseScan;
    }
    /**
     * 设置：
     */
    public void setLicenseNumber(String licenseNumber) {
            this.licenseNumber = licenseNumber;
    }
    /**
     * 获取：
     */
    public String getLicenseNumber() {
            return licenseNumber;
    }
    /**
     * 设置：营业执照照片
     */
    public void setLicensePhoto(String licensePhoto) {
            this.licensePhoto = licensePhoto;
    }
    /**
     * 获取：营业执照照片
     */
    public String getLicensePhoto() {
            return licensePhoto;
    }
    /**
     * 设置：开户许可证编号
     */
    public void setOpenBankNumber(String openBankNumber) {
            this.openBankNumber = openBankNumber;
    }
    /**
     * 获取：开户许可证编号
     */
    public String getOpenBankNumber() {
            return openBankNumber;
    }
    /**
     * 设置：开户许可证扫描件
     */
    public void setOpenBankScan(String openBankScan) {
            this.openBankScan = openBankScan;
    }
    /**
     * 获取：开户许可证扫描件
     */
    public String getOpenBankScan() {
            return openBankScan;
    }
    /**
     * 设置：其他材料
     */
    public void setOtherMaterial(String otherMaterial) {
            this.otherMaterial = otherMaterial;
    }
    /**
     * 获取：其他材料
     */
    public String getOtherMaterial() {
            return otherMaterial;
    }
    /**
     * 设置：审核状态 0:未审核
 1:审核通过正常
 2:审核不通过
 3:该商户被禁停,此时如果AID未禁止那么仍然允许登陆
     */
    public void setAuditState(String auditState) {
            this.auditState = auditState;
    }
    /**
     * 获取：审核状态 0:未审核
 1:审核通过正常
 2:审核不通过
 3:该商户被禁停,此时如果AID未禁止那么仍然允许登陆
     */
    public String getAuditState() {
            return auditState;
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
     * 设置：审核反馈
     */
    public void setAuditFeedback(String auditFeedback) {
            this.auditFeedback = auditFeedback;
    }
    /**
     * 获取：审核反馈
     */
    public String getAuditFeedback() {
            return auditFeedback;
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
     * 设置：管理员账号编码
     */
    public void setAdminAid(String adminAid) {
            this.adminAid = adminAid;
    }
    /**
     * 获取：管理员账号编码
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
    public void setAdminIdCardNo(String adminIdCardNo) {
            this.adminIdCardNo = adminIdCardNo;
    }
    /**
     * 获取：管理员手机号码
     */
    public String getAdminIdCardNo() {
            return adminIdCardNo;
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
    /**
     * 设置：
     */
    public void setAdminIdCardReverseScan(String adminIdCardReverseScan) {
            this.adminIdCardReverseScan = adminIdCardReverseScan;
    }
    /**
     * 获取：
     */
    public String getAdminIdCardReverseScan() {
            return adminIdCardReverseScan;
    }
    /**
     * 设置：管理员手机号
     */
    public void setAdminMobile(String adminMobile) {
            this.adminMobile = adminMobile;
    }
    /**
     * 获取：管理员手机号
     */
    public String getAdminMobile() {
            return adminMobile;
    }
}