package com.pineconecredit.api.entity;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.*;

/**
 * 服务客户端建立关联
 *
 * @author ZhouRunBin
 * @email 1875222156@qq.com
 * @date 2018-04-16 23:11:01
 */
@Table(name = "auth_client_service")
public class AuthClientService implements Serializable{
private static final long serialVersionUID=1L;

        //
    @Id
    private Integer id;
    
        //服务方编号
    @Column(name = "service_id")
    private String serviceId;
    
        //消费方编号
    @Column(name = "client_id")
    private String clientId;
    
        //描述
    @Column(name = "description")
    private String description;
    
        //创建人编号
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
    
        //更新人
    @Column(name = "upd_user")
    private String updUser;
    
        //更新人名称
    @Column(name = "upd_name")
    private String updName;
    
        //更新人IP地址
    @Column(name = "upd_host")
    private String updHost;
    
        //更新时间
    @Column(name = "upd_time")
    private Date updTime;
    

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
     * 设置：服务方编号
     */
    public void setServiceId(String serviceId) {
            this.serviceId = serviceId;
    }
    /**
     * 获取：服务方编号
     */
    public String getServiceId() {
            return serviceId;
    }
    /**
     * 设置：消费方编号
     */
    public void setClientId(String clientId) {
            this.clientId = clientId;
    }
    /**
     * 获取：消费方编号
     */
    public String getClientId() {
            return clientId;
    }
    /**
     * 设置：描述
     */
    public void setDescription(String description) {
            this.description = description;
    }
    /**
     * 获取：描述
     */
    public String getDescription() {
            return description;
    }
    /**
     * 设置：创建人编号
     */
    public void setCrtUser(String crtUser) {
            this.crtUser = crtUser;
    }
    /**
     * 获取：创建人编号
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
     * 设置：更新人
     */
    public void setUpdUser(String updUser) {
            this.updUser = updUser;
    }
    /**
     * 获取：更新人
     */
    public String getUpdUser() {
            return updUser;
    }
    /**
     * 设置：更新人名称
     */
    public void setUpdName(String updName) {
            this.updName = updName;
    }
    /**
     * 获取：更新人名称
     */
    public String getUpdName() {
            return updName;
    }
    /**
     * 设置：更新人IP地址
     */
    public void setUpdHost(String updHost) {
            this.updHost = updHost;
    }
    /**
     * 获取：更新人IP地址
     */
    public String getUpdHost() {
            return updHost;
    }
    /**
     * 设置：更新时间
     */
    public void setUpdTime(Date updTime) {
            this.updTime = updTime;
    }
    /**
     * 获取：更新时间
     */
    public Date getUpdTime() {
            return updTime;
    }
}