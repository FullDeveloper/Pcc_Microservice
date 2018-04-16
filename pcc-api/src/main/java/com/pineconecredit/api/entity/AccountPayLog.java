package com.pineconecredit.api.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.*;

/**
 * 账户资金流水表
 *
 * @author ZhouRunBin
 * @email 1875222156@qq.com
 * @date 2018-04-16 23:30:47
 */
@Table(name = "account_pay_log")
public class AccountPayLog implements Serializable{
private static final long serialVersionUID=1L;

        //
    @Id
    private Integer id;
    
        //事件发起方 全平台账号编号
    @Column(name = "aid")
    private String aid;
    
        //收入方编号 全平台账号编号
    @Column(name = "income_aid")
    private String incomeAid;
    
        //收入方名称
    @Column(name = "income_name")
    private String incomeName;
    
        //贷出方编号
    @Column(name = "lend_aidi")
    private String lendAidi;
    
        //贷出方名称
    @Column(name = "lend_name")
    private String lendName;
    
        //交易科目表 该笔流水对应什么科目
    @Column(name = "subject")
    private String subject;
    
        //摘要信息
    @Column(name = "summary")
    private String summary;
    
        //本次资金流水对应的数额
    @Column(name = "amount")
    private BigDecimal amount;
    
        //本次资金流水对应的虚拟卡编号
    @Column(name = "card_id")
    private String cardId;
    
        //资金流水事件编号 通过科目关联不同的表
    @Column(name = "event_id")
    private String eventId;
    
        //出入张标记 0：出账 1 入账
    @Column(name = "flag")
    private String flag;
    
        //资金凭证编码
    @Column(name = "voucher_id")
    private String voucherId;
    
        //三方支付机构
    @Column(name = "pay_organization_id")
    private String payOrganizationId;
    
        //最后一笔三方支付流水凭证
    @Column(name = "last_thrid_pay_id")
    private String lastThridPayId;
    
        //资金账号变动前余额
    @Column(name = "account_money_pre")
    private BigDecimal accountMoneyPre;
    
        //记账时间
    @Column(name = "write_time")
    private Date writeTime;
    
        //成功标志
    @Column(name = "status")
    private String status;
    
        //财务记账人
    @Column(name = "financial_writer_user")
    private String financialWriterUser;
    
        //财务审核人
    @Column(name = "financial_audit_user")
    private String financialAuditUser;
    
        //审核时间
    @Column(name = "audit_time")
    private Date auditTime;
    
        //审核反馈
    @Column(name = "audit_feedback")
    private String auditFeedback;
    

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
     * 设置：事件发起方 全平台账号编号
     */
    public void setAid(String aid) {
            this.aid = aid;
    }
    /**
     * 获取：事件发起方 全平台账号编号
     */
    public String getAid() {
            return aid;
    }
    /**
     * 设置：收入方编号 全平台账号编号
     */
    public void setIncomeAid(String incomeAid) {
            this.incomeAid = incomeAid;
    }
    /**
     * 获取：收入方编号 全平台账号编号
     */
    public String getIncomeAid() {
            return incomeAid;
    }
    /**
     * 设置：收入方名称
     */
    public void setIncomeName(String incomeName) {
            this.incomeName = incomeName;
    }
    /**
     * 获取：收入方名称
     */
    public String getIncomeName() {
            return incomeName;
    }
    /**
     * 设置：贷出方编号
     */
    public void setLendAidi(String lendAidi) {
            this.lendAidi = lendAidi;
    }
    /**
     * 获取：贷出方编号
     */
    public String getLendAidi() {
            return lendAidi;
    }
    /**
     * 设置：贷出方名称
     */
    public void setLendName(String lendName) {
            this.lendName = lendName;
    }
    /**
     * 获取：贷出方名称
     */
    public String getLendName() {
            return lendName;
    }
    /**
     * 设置：交易科目表 该笔流水对应什么科目
     */
    public void setSubject(String subject) {
            this.subject = subject;
    }
    /**
     * 获取：交易科目表 该笔流水对应什么科目
     */
    public String getSubject() {
            return subject;
    }
    /**
     * 设置：摘要信息
     */
    public void setSummary(String summary) {
            this.summary = summary;
    }
    /**
     * 获取：摘要信息
     */
    public String getSummary() {
            return summary;
    }
    /**
     * 设置：本次资金流水对应的数额
     */
    public void setAmount(BigDecimal amount) {
            this.amount = amount;
    }
    /**
     * 获取：本次资金流水对应的数额
     */
    public BigDecimal getAmount() {
            return amount;
    }
    /**
     * 设置：本次资金流水对应的虚拟卡编号
     */
    public void setCardId(String cardId) {
            this.cardId = cardId;
    }
    /**
     * 获取：本次资金流水对应的虚拟卡编号
     */
    public String getCardId() {
            return cardId;
    }
    /**
     * 设置：资金流水事件编号 通过科目关联不同的表
     */
    public void setEventId(String eventId) {
            this.eventId = eventId;
    }
    /**
     * 获取：资金流水事件编号 通过科目关联不同的表
     */
    public String getEventId() {
            return eventId;
    }
    /**
     * 设置：出入张标记 0：出账 1 入账
     */
    public void setFlag(String flag) {
            this.flag = flag;
    }
    /**
     * 获取：出入张标记 0：出账 1 入账
     */
    public String getFlag() {
            return flag;
    }
    /**
     * 设置：资金凭证编码
     */
    public void setVoucherId(String voucherId) {
            this.voucherId = voucherId;
    }
    /**
     * 获取：资金凭证编码
     */
    public String getVoucherId() {
            return voucherId;
    }
    /**
     * 设置：三方支付机构
     */
    public void setPayOrganizationId(String payOrganizationId) {
            this.payOrganizationId = payOrganizationId;
    }
    /**
     * 获取：三方支付机构
     */
    public String getPayOrganizationId() {
            return payOrganizationId;
    }
    /**
     * 设置：最后一笔三方支付流水凭证
     */
    public void setLastThridPayId(String lastThridPayId) {
            this.lastThridPayId = lastThridPayId;
    }
    /**
     * 获取：最后一笔三方支付流水凭证
     */
    public String getLastThridPayId() {
            return lastThridPayId;
    }
    /**
     * 设置：资金账号变动前余额
     */
    public void setAccountMoneyPre(BigDecimal accountMoneyPre) {
            this.accountMoneyPre = accountMoneyPre;
    }
    /**
     * 获取：资金账号变动前余额
     */
    public BigDecimal getAccountMoneyPre() {
            return accountMoneyPre;
    }
    /**
     * 设置：记账时间
     */
    public void setWriteTime(Date writeTime) {
            this.writeTime = writeTime;
    }
    /**
     * 获取：记账时间
     */
    public Date getWriteTime() {
            return writeTime;
    }
    /**
     * 设置：成功标志
     */
    public void setStatus(String status) {
            this.status = status;
    }
    /**
     * 获取：成功标志
     */
    public String getStatus() {
            return status;
    }
    /**
     * 设置：财务记账人
     */
    public void setFinancialWriterUser(String financialWriterUser) {
            this.financialWriterUser = financialWriterUser;
    }
    /**
     * 获取：财务记账人
     */
    public String getFinancialWriterUser() {
            return financialWriterUser;
    }
    /**
     * 设置：财务审核人
     */
    public void setFinancialAuditUser(String financialAuditUser) {
            this.financialAuditUser = financialAuditUser;
    }
    /**
     * 获取：财务审核人
     */
    public String getFinancialAuditUser() {
            return financialAuditUser;
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
}