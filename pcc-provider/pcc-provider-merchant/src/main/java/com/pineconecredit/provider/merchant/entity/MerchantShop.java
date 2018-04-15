package com.pineconecredit.provider.merchant.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.*;

/**
 * 商户名下门店/电商表
 *
 * @author ZhouRunBin
 * @email 1875222156@qq.com
 * @date 2018-04-15 13:48:26
 */
@Table(name = "merchant_shop")
public class MerchantShop implements Serializable{
private static final long serialVersionUID=1L;

        //
    @Id
    private Integer id;
    
        //所属商户编号
    @Column(name = "maid")
    private String maid;
    
        //对应平台账号编号
    @Column(name = "aid")
    private String aid;
    
        //门店/电商名称
    @Column(name = "shop_name")
    private String shopName;
    
        //门店/电商简介
    @Column(name = "shop_introduce")
    private String shopIntroduce;
    
        //区域编码
    @Column(name = "area_code")
    private String areaCode;
    
        //详细地址
    @Column(name = "address")
    private String address;
    
        //门店/电商联系电话
    @Column(name = "telephone")
    private String telephone;
    
        //营业执照编号
    @Column(name = "license_number")
    private String licenseNumber;
    
        //营业执照照片或扫描件
    @Column(name = "license_photo")
    private String licensePhoto;
    
        //门店封面实景图
    @Column(name = "shop_photos")
    private String shopPhotos;
    
        //门店品牌信息
    @Column(name = "shop_brand")
    private String shopBrand;
    
        //门店经营风格
    @Column(name = "shop_styles")
    private String shopStyles;
    
        //门店经营大类
    @Column(name = "good_code")
    private String goodCode;
    
        //店长平台账号编号
    @Column(name = "mgr_aid")
    private String mgrAid;
    
        //店长手持身份证站在门店面前
    @Column(name = "mgr_hand_photo")
    private String mgrHandPhoto;
    
        //门店经度坐标
    @Column(name = "longitude")
    private BigDecimal longitude;
    
        //门店纬度坐标
    @Column(name = "latitude")
    private BigDecimal latitude;
    
        //电商头图
    @Column(name = "e_log")
    private String eLog;
    
        //电商IP地址
    @Column(name = "e_ip")
    private String eIp;
    
        //电商IP备案编号
    @Column(name = "e_ip_no")
    private String eIpNo;
    
        //电商备案登记信息
    @Column(name = "e_regist_info")
    private String eRegistInfo;
    
        //电商自动审批次数
    @Column(name = "e_batch_approve_num")
    private Integer eBatchApproveNum;
    
        //电商/门店状态
    @Column(name = "shop_state")
    private String shopState;
    
        //门店/电商 类型
    @Column(name = "shop_types")
    private String shopTypes;
    
        //经营类型 0：门店 1：电商
    @Column(name = "main_type")
    private String mainType;
    
        //其他材料
    @Column(name = "other_material")
    private String otherMaterial;
    
        //审批人
    @Column(name = "audit_user")
    private String auditUser;
    
        //审批反馈
    @Column(name = "audit_feedback")
    private String auditFeedback;
    
        //审批时间
    @Column(name = "audit_time")
    private Date auditTime;
    
        //审批状态
    @Column(name = "audit_state")
    private String auditState;
    

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
     * 设置：所属商户编号
     */
    public void setMaid(String maid) {
            this.maid = maid;
    }
    /**
     * 获取：所属商户编号
     */
    public String getMaid() {
            return maid;
    }
    /**
     * 设置：对应平台账号编号
     */
    public void setAid(String aid) {
            this.aid = aid;
    }
    /**
     * 获取：对应平台账号编号
     */
    public String getAid() {
            return aid;
    }
    /**
     * 设置：门店/电商名称
     */
    public void setShopName(String shopName) {
            this.shopName = shopName;
    }
    /**
     * 获取：门店/电商名称
     */
    public String getShopName() {
            return shopName;
    }
    /**
     * 设置：门店/电商简介
     */
    public void setShopIntroduce(String shopIntroduce) {
            this.shopIntroduce = shopIntroduce;
    }
    /**
     * 获取：门店/电商简介
     */
    public String getShopIntroduce() {
            return shopIntroduce;
    }
    /**
     * 设置：区域编码
     */
    public void setAreaCode(String areaCode) {
            this.areaCode = areaCode;
    }
    /**
     * 获取：区域编码
     */
    public String getAreaCode() {
            return areaCode;
    }
    /**
     * 设置：详细地址
     */
    public void setAddress(String address) {
            this.address = address;
    }
    /**
     * 获取：详细地址
     */
    public String getAddress() {
            return address;
    }
    /**
     * 设置：门店/电商联系电话
     */
    public void setTelephone(String telephone) {
            this.telephone = telephone;
    }
    /**
     * 获取：门店/电商联系电话
     */
    public String getTelephone() {
            return telephone;
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
     * 设置：营业执照照片或扫描件
     */
    public void setLicensePhoto(String licensePhoto) {
            this.licensePhoto = licensePhoto;
    }
    /**
     * 获取：营业执照照片或扫描件
     */
    public String getLicensePhoto() {
            return licensePhoto;
    }
    /**
     * 设置：门店封面实景图
     */
    public void setShopPhotos(String shopPhotos) {
            this.shopPhotos = shopPhotos;
    }
    /**
     * 获取：门店封面实景图
     */
    public String getShopPhotos() {
            return shopPhotos;
    }
    /**
     * 设置：门店品牌信息
     */
    public void setShopBrand(String shopBrand) {
            this.shopBrand = shopBrand;
    }
    /**
     * 获取：门店品牌信息
     */
    public String getShopBrand() {
            return shopBrand;
    }
    /**
     * 设置：门店经营风格
     */
    public void setShopStyles(String shopStyles) {
            this.shopStyles = shopStyles;
    }
    /**
     * 获取：门店经营风格
     */
    public String getShopStyles() {
            return shopStyles;
    }
    /**
     * 设置：门店经营大类
     */
    public void setGoodCode(String goodCode) {
            this.goodCode = goodCode;
    }
    /**
     * 获取：门店经营大类
     */
    public String getGoodCode() {
            return goodCode;
    }
    /**
     * 设置：店长平台账号编号
     */
    public void setMgrAid(String mgrAid) {
            this.mgrAid = mgrAid;
    }
    /**
     * 获取：店长平台账号编号
     */
    public String getMgrAid() {
            return mgrAid;
    }
    /**
     * 设置：店长手持身份证站在门店面前
     */
    public void setMgrHandPhoto(String mgrHandPhoto) {
            this.mgrHandPhoto = mgrHandPhoto;
    }
    /**
     * 获取：店长手持身份证站在门店面前
     */
    public String getMgrHandPhoto() {
            return mgrHandPhoto;
    }
    /**
     * 设置：门店经度坐标
     */
    public void setLongitude(BigDecimal longitude) {
            this.longitude = longitude;
    }
    /**
     * 获取：门店经度坐标
     */
    public BigDecimal getLongitude() {
            return longitude;
    }
    /**
     * 设置：门店纬度坐标
     */
    public void setLatitude(BigDecimal latitude) {
            this.latitude = latitude;
    }
    /**
     * 获取：门店纬度坐标
     */
    public BigDecimal getLatitude() {
            return latitude;
    }
    /**
     * 设置：电商头图
     */
    public void setELog(String eLog) {
            this.eLog = eLog;
    }
    /**
     * 获取：电商头图
     */
    public String getELog() {
            return eLog;
    }
    /**
     * 设置：电商IP地址
     */
    public void setEIp(String eIp) {
            this.eIp = eIp;
    }
    /**
     * 获取：电商IP地址
     */
    public String getEIp() {
            return eIp;
    }
    /**
     * 设置：电商IP备案编号
     */
    public void setEIpNo(String eIpNo) {
            this.eIpNo = eIpNo;
    }
    /**
     * 获取：电商IP备案编号
     */
    public String getEIpNo() {
            return eIpNo;
    }
    /**
     * 设置：电商备案登记信息
     */
    public void setERegistInfo(String eRegistInfo) {
            this.eRegistInfo = eRegistInfo;
    }
    /**
     * 获取：电商备案登记信息
     */
    public String getERegistInfo() {
            return eRegistInfo;
    }
    /**
     * 设置：电商自动审批次数
     */
    public void setEBatchApproveNum(Integer eBatchApproveNum) {
            this.eBatchApproveNum = eBatchApproveNum;
    }
    /**
     * 获取：电商自动审批次数
     */
    public Integer getEBatchApproveNum() {
            return eBatchApproveNum;
    }
    /**
     * 设置：电商/门店状态
     */
    public void setShopState(String shopState) {
            this.shopState = shopState;
    }
    /**
     * 获取：电商/门店状态
     */
    public String getShopState() {
            return shopState;
    }
    /**
     * 设置：门店/电商 类型
     */
    public void setShopTypes(String shopTypes) {
            this.shopTypes = shopTypes;
    }
    /**
     * 获取：门店/电商 类型
     */
    public String getShopTypes() {
            return shopTypes;
    }
    /**
     * 设置：经营类型 0：门店 1：电商
     */
    public void setMainType(String mainType) {
            this.mainType = mainType;
    }
    /**
     * 获取：经营类型 0：门店 1：电商
     */
    public String getMainType() {
            return mainType;
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
     * 设置：审批人
     */
    public void setAuditUser(String auditUser) {
            this.auditUser = auditUser;
    }
    /**
     * 获取：审批人
     */
    public String getAuditUser() {
            return auditUser;
    }
    /**
     * 设置：审批反馈
     */
    public void setAuditFeedback(String auditFeedback) {
            this.auditFeedback = auditFeedback;
    }
    /**
     * 获取：审批反馈
     */
    public String getAuditFeedback() {
            return auditFeedback;
    }
    /**
     * 设置：审批时间
     */
    public void setAuditTime(Date auditTime) {
            this.auditTime = auditTime;
    }
    /**
     * 获取：审批时间
     */
    public Date getAuditTime() {
            return auditTime;
    }
    /**
     * 设置：审批状态
     */
    public void setAuditState(String auditState) {
            this.auditState = auditState;
    }
    /**
     * 获取：审批状态
     */
    public String getAuditState() {
            return auditState;
    }
}