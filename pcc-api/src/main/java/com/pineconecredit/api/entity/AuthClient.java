package com.pineconecredit.api.entity;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.*;

/**
 * 认证客户端
 *
 * @author ZhouRunBin
 * @email 1875222156@qq.com
 * @date 2018-04-16 23:11:01
 */
@Table(name = "auth_client")
public class AuthClient implements Serializable{
private static final long serialVersionUID=1L;

        //客户端主键编号
    @Id
    private Integer id;
    
        //客户端编号
    @Column(name = "code")
    private String code;
    
        //客户端密钥
    @Column(name = "secret")
    private String secret;
    
        //客户端名称
    @Column(name = "name")
    private String name;
    
        //该客户端是否锁定0：锁定 1：正常
    @Column(name = "locked")
    private String locked;
    
        //客户端描述
    @Column(name = "description")
    private String description;
    
        //创建人编号
    @Column(name = "crt_user")
    private String crtUser;
    
        //创建时间
    @Column(name = "crt_time")
    private Date crtTime;
    
        //创建者的IP地址
    @Column(name = "crt_host")
    private String crtHost;
    
        //创建者名称
    @Column(name = "crt_name")
    private String crtName;
    
        //更新时间
    @Column(name = "upd_time")
    private Date updTime;
    
        //修改人编号
    @Column(name = "upd_user")
    private String updUser;
    
        //创建人名称
    @Column(name = "upd_name")
    private String updName;
    
        //更新人IP地址
    @Column(name = "upd_host")
    private String updHost;
    

    /**
     * 设置：客户端主键编号
     */
    public void setId(Integer id) {
            this.id = id;
    }
    /**
     * 获取：客户端主键编号
     */
    public Integer getId() {
            return id;
    }
    /**
     * 设置：客户端编号
     */
    public void setCode(String code) {
            this.code = code;
    }
    /**
     * 获取：客户端编号
     */
    public String getCode() {
            return code;
    }
    /**
     * 设置：客户端密钥
     */
    public void setSecret(String secret) {
            this.secret = secret;
    }
    /**
     * 获取：客户端密钥
     */
    public String getSecret() {
            return secret;
    }
    /**
     * 设置：客户端名称
     */
    public void setName(String name) {
            this.name = name;
    }
    /**
     * 获取：客户端名称
     */
    public String getName() {
            return name;
    }
    /**
     * 设置：该客户端是否锁定0：锁定 1：正常
     */
    public void setLocked(String locked) {
            this.locked = locked;
    }
    /**
     * 获取：该客户端是否锁定0：锁定 1：正常
     */
    public String getLocked() {
            return locked;
    }
    /**
     * 设置：客户端描述
     */
    public void setDescription(String description) {
            this.description = description;
    }
    /**
     * 获取：客户端描述
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
     * 设置：创建者的IP地址
     */
    public void setCrtHost(String crtHost) {
            this.crtHost = crtHost;
    }
    /**
     * 获取：创建者的IP地址
     */
    public String getCrtHost() {
            return crtHost;
    }
    /**
     * 设置：创建者名称
     */
    public void setCrtName(String crtName) {
            this.crtName = crtName;
    }
    /**
     * 获取：创建者名称
     */
    public String getCrtName() {
            return crtName;
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
    /**
     * 设置：修改人编号
     */
    public void setUpdUser(String updUser) {
            this.updUser = updUser;
    }
    /**
     * 获取：修改人编号
     */
    public String getUpdUser() {
            return updUser;
    }
    /**
     * 设置：创建人名称
     */
    public void setUpdName(String updName) {
            this.updName = updName;
    }
    /**
     * 获取：创建人名称
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
}