/*
 * This file is generated by jOOQ.
*/
package com.tencent.devops.model.log.tables.records;


import com.tencent.devops.model.log.tables.TLogIndicesV2;

import java.time.LocalDateTime;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record7;
import org.jooq.Row7;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class TLogIndicesV2Record extends UpdatableRecordImpl<TLogIndicesV2Record> implements Record7<Long, String, String, Long, LocalDateTime, LocalDateTime, Boolean> {

    private static final long serialVersionUID = -291795398;

    /**
     * Setter for <code>devops_log.T_LOG_INDICES_V2.ID</code>.
     */
    public TLogIndicesV2Record setId(Long value) {
        set(0, value);
        return this;
    }

    /**
     * Getter for <code>devops_log.T_LOG_INDICES_V2.ID</code>.
     */
    public Long getId() {
        return (Long) get(0);
    }

    /**
     * Setter for <code>devops_log.T_LOG_INDICES_V2.BUILD_ID</code>.
     */
    public TLogIndicesV2Record setBuildId(String value) {
        set(1, value);
        return this;
    }

    /**
     * Getter for <code>devops_log.T_LOG_INDICES_V2.BUILD_ID</code>.
     */
    public String getBuildId() {
        return (String) get(1);
    }

    /**
     * Setter for <code>devops_log.T_LOG_INDICES_V2.INDEX_NAME</code>.
     */
    public TLogIndicesV2Record setIndexName(String value) {
        set(2, value);
        return this;
    }

    /**
     * Getter for <code>devops_log.T_LOG_INDICES_V2.INDEX_NAME</code>.
     */
    public String getIndexName() {
        return (String) get(2);
    }

    /**
     * Setter for <code>devops_log.T_LOG_INDICES_V2.LAST_LINE_NUM</code>. 最后行号
     */
    public TLogIndicesV2Record setLastLineNum(Long value) {
        set(3, value);
        return this;
    }

    /**
     * Getter for <code>devops_log.T_LOG_INDICES_V2.LAST_LINE_NUM</code>. 最后行号
     */
    public Long getLastLineNum() {
        return (Long) get(3);
    }

    /**
     * Setter for <code>devops_log.T_LOG_INDICES_V2.CREATED_TIME</code>. 创建时间
     */
    public TLogIndicesV2Record setCreatedTime(LocalDateTime value) {
        set(4, value);
        return this;
    }

    /**
     * Getter for <code>devops_log.T_LOG_INDICES_V2.CREATED_TIME</code>. 创建时间
     */
    public LocalDateTime getCreatedTime() {
        return (LocalDateTime) get(4);
    }

    /**
     * Setter for <code>devops_log.T_LOG_INDICES_V2.UPDATED_TIME</code>. 修改时间
     */
    public TLogIndicesV2Record setUpdatedTime(LocalDateTime value) {
        set(5, value);
        return this;
    }

    /**
     * Getter for <code>devops_log.T_LOG_INDICES_V2.UPDATED_TIME</code>. 修改时间
     */
    public LocalDateTime getUpdatedTime() {
        return (LocalDateTime) get(5);
    }

    /**
     * Setter for <code>devops_log.T_LOG_INDICES_V2.ENABLE</code>. build is enable v2 or not
     */
    public TLogIndicesV2Record setEnable(Boolean value) {
        set(6, value);
        return this;
    }

    /**
     * Getter for <code>devops_log.T_LOG_INDICES_V2.ENABLE</code>. build is enable v2 or not
     */
    public Boolean getEnable() {
        return (Boolean) get(6);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Record1<Long> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record7 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row7<Long, String, String, Long, LocalDateTime, LocalDateTime, Boolean> fieldsRow() {
        return (Row7) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row7<Long, String, String, Long, LocalDateTime, LocalDateTime, Boolean> valuesRow() {
        return (Row7) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field1() {
        return TLogIndicesV2.T_LOG_INDICES_V2.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field2() {
        return TLogIndicesV2.T_LOG_INDICES_V2.BUILD_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field3() {
        return TLogIndicesV2.T_LOG_INDICES_V2.INDEX_NAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field4() {
        return TLogIndicesV2.T_LOG_INDICES_V2.LAST_LINE_NUM;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<LocalDateTime> field5() {
        return TLogIndicesV2.T_LOG_INDICES_V2.CREATED_TIME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<LocalDateTime> field6() {
        return TLogIndicesV2.T_LOG_INDICES_V2.UPDATED_TIME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Boolean> field7() {
        return TLogIndicesV2.T_LOG_INDICES_V2.ENABLE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long value1() {
        return getId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value2() {
        return getBuildId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value3() {
        return getIndexName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long value4() {
        return getLastLineNum();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public LocalDateTime value5() {
        return getCreatedTime();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public LocalDateTime value6() {
        return getUpdatedTime();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Boolean value7() {
        return getEnable();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TLogIndicesV2Record value1(Long value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TLogIndicesV2Record value2(String value) {
        setBuildId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TLogIndicesV2Record value3(String value) {
        setIndexName(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TLogIndicesV2Record value4(Long value) {
        setLastLineNum(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TLogIndicesV2Record value5(LocalDateTime value) {
        setCreatedTime(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TLogIndicesV2Record value6(LocalDateTime value) {
        setUpdatedTime(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TLogIndicesV2Record value7(Boolean value) {
        setEnable(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TLogIndicesV2Record values(Long value1, String value2, String value3, Long value4, LocalDateTime value5, LocalDateTime value6, Boolean value7) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        value7(value7);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached TLogIndicesV2Record
     */
    public TLogIndicesV2Record() {
        super(TLogIndicesV2.T_LOG_INDICES_V2);
    }

    /**
     * Create a detached, initialised TLogIndicesV2Record
     */
    public TLogIndicesV2Record(Long id, String buildId, String indexName, Long lastLineNum, LocalDateTime createdTime, LocalDateTime updatedTime, Boolean enable) {
        super(TLogIndicesV2.T_LOG_INDICES_V2);

        set(0, id);
        set(1, buildId);
        set(2, indexName);
        set(3, lastLineNum);
        set(4, createdTime);
        set(5, updatedTime);
        set(6, enable);
    }
}