/*
 * This file is generated by jOOQ.
*/
package com.epam.ta.reportportal.store.jooq.udt.records;


import com.epam.ta.reportportal.store.jooq.udt.JParameter;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record2;
import org.jooq.Row2;
import org.jooq.impl.UDTRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.10.5"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class JParameterRecord extends UDTRecordImpl<JParameterRecord> implements Record2<String, String> {

    private static final long serialVersionUID = 1440233077;

    /**
     * Setter for <code>public.parameter.key</code>.
     */
    public void setKey(String value) {
        set(0, value);
    }

    /**
     * Getter for <code>public.parameter.key</code>.
     */
    public String getKey() {
        return (String) get(0);
    }

    /**
     * Setter for <code>public.parameter.value</code>.
     */
    public void setValue(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>public.parameter.value</code>.
     */
    public String getValue() {
        return (String) get(1);
    }

    // -------------------------------------------------------------------------
    // Record2 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row2<String, String> fieldsRow() {
        return (Row2) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row2<String, String> valuesRow() {
        return (Row2) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field1() {
        return JParameter.KEY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field2() {
        return JParameter.VALUE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component1() {
        return getKey();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component2() {
        return getValue();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value1() {
        return getKey();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value2() {
        return getValue();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JParameterRecord value1(String value) {
        setKey(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JParameterRecord value2(String value) {
        setValue(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JParameterRecord values(String value1, String value2) {
        value1(value1);
        value2(value2);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached JParameterRecord
     */
    public JParameterRecord() {
        super(JParameter.PARAMETER);
    }

    /**
     * Create a detached, initialised JParameterRecord
     */
    public JParameterRecord(String key, String value) {
        super(JParameter.PARAMETER);

        set(0, key);
        set(1, value);
    }
}
