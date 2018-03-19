/*
 * This file is generated by jOOQ.
*/
package com.epam.ta.reportportal.store.jooq.tables;


import com.epam.ta.reportportal.store.jooq.Indexes;
import com.epam.ta.reportportal.store.jooq.JPublic;
import com.epam.ta.reportportal.store.jooq.Keys;
import com.epam.ta.reportportal.store.jooq.tables.records.JItemTagRecord;

import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Identity;
import org.jooq.Index;
import org.jooq.Name;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.UniqueKey;
import org.jooq.impl.DSL;
import org.jooq.impl.TableImpl;


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
public class JItemTag extends TableImpl<JItemTagRecord> {

    private static final long serialVersionUID = 618068017;

    /**
     * The reference instance of <code>public.item_tag</code>
     */
    public static final JItemTag ITEM_TAG = new JItemTag();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<JItemTagRecord> getRecordType() {
        return JItemTagRecord.class;
    }

    /**
     * The column <code>public.item_tag.id</code>.
     */
    public final TableField<JItemTagRecord, Integer> ID = createField("id", org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaultValue(org.jooq.impl.DSL.field("nextval('item_tag_id_seq'::regclass)", org.jooq.impl.SQLDataType.INTEGER)), this, "");

    /**
     * The column <code>public.item_tag.value</code>.
     */
    public final TableField<JItemTagRecord, String> VALUE = createField("value", org.jooq.impl.SQLDataType.CLOB, this, "");

    /**
     * The column <code>public.item_tag.item_id</code>.
     */
    public final TableField<JItemTagRecord, Long> ITEM_ID = createField("item_id", org.jooq.impl.SQLDataType.BIGINT, this, "");

    /**
     * Create a <code>public.item_tag</code> table reference
     */
    public JItemTag() {
        this(DSL.name("item_tag"), null);
    }

    /**
     * Create an aliased <code>public.item_tag</code> table reference
     */
    public JItemTag(String alias) {
        this(DSL.name(alias), ITEM_TAG);
    }

    /**
     * Create an aliased <code>public.item_tag</code> table reference
     */
    public JItemTag(Name alias) {
        this(alias, ITEM_TAG);
    }

    private JItemTag(Name alias, Table<JItemTagRecord> aliased) {
        this(alias, aliased, null);
    }

    private JItemTag(Name alias, Table<JItemTagRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, "");
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Schema getSchema() {
        return JPublic.PUBLIC;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<Index> getIndexes() {
        return Arrays.<Index>asList(Indexes.ITEM_TAG_PK);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Identity<JItemTagRecord, Integer> getIdentity() {
        return Keys.IDENTITY_ITEM_TAG;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<JItemTagRecord> getPrimaryKey() {
        return Keys.ITEM_TAG_PK;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<JItemTagRecord>> getKeys() {
        return Arrays.<UniqueKey<JItemTagRecord>>asList(Keys.ITEM_TAG_PK);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<ForeignKey<JItemTagRecord, ?>> getReferences() {
        return Arrays.<ForeignKey<JItemTagRecord, ?>>asList(Keys.ITEM_TAG__ITEM_TAG_ITEM_ID_FKEY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JItemTag as(String alias) {
        return new JItemTag(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JItemTag as(Name alias) {
        return new JItemTag(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public JItemTag rename(String name) {
        return new JItemTag(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public JItemTag rename(Name name) {
        return new JItemTag(name, null);
    }
}
