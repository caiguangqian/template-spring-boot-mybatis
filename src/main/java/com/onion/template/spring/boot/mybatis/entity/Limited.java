package com.onion.template.spring.boot.mybatis.entity;

import javax.persistence.*;

@Table(name = "limited")
public class Limited {
    @Id
    @Column(name = "limited_id")
    private Long limitedId;

    @Column(name = "limited_type")
    private Integer limitedType;

    @Column(name = "limited_remarks")
    private String limitedRemarks;

    /**
     * @return limited_id
     */
    public Long getLimitedId() {
        return limitedId;
    }

    /**
     * @param limitedId
     */
    public void setLimitedId(Long limitedId) {
        this.limitedId = limitedId;
    }

    /**
     * @return limited_type
     */
    public Integer getLimitedType() {
        return limitedType;
    }

    /**
     * @param limitedType
     */
    public void setLimitedType(Integer limitedType) {
        this.limitedType = limitedType;
    }

    /**
     * @return limited_remarks
     */
    public String getLimitedRemarks() {
        return limitedRemarks;
    }

    /**
     * @param limitedRemarks
     */
    public void setLimitedRemarks(String limitedRemarks) {
        this.limitedRemarks = limitedRemarks;
    }
}