/*
 * This file is generated by jOOQ.
*/
package com.epam.ta.reportportal.store.jooq.tables.records;


import com.epam.ta.reportportal.store.jooq.tables.JDefectFormField;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record6;
import org.jooq.Row6;
import org.jooq.impl.UpdatableRecordImpl;


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
public class JDefectFormFieldRecord extends UpdatableRecordImpl<JDefectFormFieldRecord> implements Record6<Integer, Integer, String, String, Boolean, String[]> {

    private static final long serialVersionUID = 758316364;

    /**
     * Setter for <code>public.defect_form_field.id</code>.
     */
    public void setId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>public.defect_form_field.id</code>.
     */
    public Integer getId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>public.defect_form_field.bugtracking_system</code>.
     */
    public void setBugtrackingSystem(Integer value) {
        set(1, value);
    }

    /**
     * Getter for <code>public.defect_form_field.bugtracking_system</code>.
     */
    public Integer getBugtrackingSystem() {
        return (Integer) get(1);
    }

    /**
     * Setter for <code>public.defect_form_field.field_id</code>.
     */
    public void setFieldId(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>public.defect_form_field.field_id</code>.
     */
    public String getFieldId() {
        return (String) get(2);
    }

    /**
     * Setter for <code>public.defect_form_field.type</code>.
     */
    public void setType(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>public.defect_form_field.type</code>.
     */
    public String getType() {
        return (String) get(3);
    }

    /**
     * Setter for <code>public.defect_form_field.required</code>.
     */
    public void setRequired(Boolean value) {
        set(4, value);
    }

    /**
     * Getter for <code>public.defect_form_field.required</code>.
     */
    public Boolean getRequired() {
        return (Boolean) get(4);
    }

    /**
     * Setter for <code>public.defect_form_field.values</code>.
     */
    public void setValues(String... value) {
        set(5, value);
    }

    /**
     * Getter for <code>public.defect_form_field.values</code>.
     */
    public String[] getValues() {
        return (String[]) get(5);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Record1<Integer> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record6 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row6<Integer, Integer, String, String, Boolean, String[]> fieldsRow() {
        return (Row6) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row6<Integer, Integer, String, String, Boolean, String[]> valuesRow() {
        return (Row6) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field1() {
        return JDefectFormField.DEFECT_FORM_FIELD.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field2() {
        return JDefectFormField.DEFECT_FORM_FIELD.BUGTRACKING_SYSTEM;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field3() {
        return JDefectFormField.DEFECT_FORM_FIELD.FIELD_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field4() {
        return JDefectFormField.DEFECT_FORM_FIELD.TYPE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Boolean> field5() {
        return JDefectFormField.DEFECT_FORM_FIELD.REQUIRED;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String[]> field6() {
        return JDefectFormField.DEFECT_FORM_FIELD.VALUES;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component1() {
        return getId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component2() {
        return getBugtrackingSystem();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component3() {
        return getFieldId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component4() {
        return getType();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Boolean component5() {
        return getRequired();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String[] component6() {
        return getValues();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value1() {
        return getId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value2() {
        return getBugtrackingSystem();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value3() {
        return getFieldId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value4() {
        return getType();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Boolean value5() {
        return getRequired();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String[] value6() {
        return getValues();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JDefectFormFieldRecord value1(Integer value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JDefectFormFieldRecord value2(Integer value) {
        setBugtrackingSystem(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JDefectFormFieldRecord value3(String value) {
        setFieldId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JDefectFormFieldRecord value4(String value) {
        setType(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JDefectFormFieldRecord value5(Boolean value) {
        setRequired(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JDefectFormFieldRecord value6(String... value) {
        setValues(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JDefectFormFieldRecord values(Integer value1, Integer value2, String value3, String value4, Boolean value5, String[] value6) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached JDefectFormFieldRecord
     */
    public JDefectFormFieldRecord() {
        super(JDefectFormField.DEFECT_FORM_FIELD);
    }

    /**
     * Create a detached, initialised JDefectFormFieldRecord
     */
    public JDefectFormFieldRecord(Integer id, Integer bugtrackingSystem, String fieldId, String type, Boolean required, String[] values) {
        super(JDefectFormField.DEFECT_FORM_FIELD);

        set(0, id);
        set(1, bugtrackingSystem);
        set(2, fieldId);
        set(3, type);
        set(4, required);
        set(5, values);
    }
}
