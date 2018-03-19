/*
 * This file is generated by jOOQ.
*/
package com.epam.ta.reportportal.store.jooq.tables;


import com.epam.ta.reportportal.store.jooq.Indexes;
import com.epam.ta.reportportal.store.jooq.JPublic;
import com.epam.ta.reportportal.store.jooq.Keys;
import com.epam.ta.reportportal.store.jooq.enums.JStatusEnum;
import com.epam.ta.reportportal.store.jooq.tables.records.JTestItemResultsRecord;

import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.ForeignKey;
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
public class JTestItemResults extends TableImpl<JTestItemResultsRecord> {

    private static final long serialVersionUID = 1879769971;

    /**
     * The reference instance of <code>public.test_item_results</code>
     */
    public static final JTestItemResults TEST_ITEM_RESULTS = new JTestItemResults();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<JTestItemResultsRecord> getRecordType() {
        return JTestItemResultsRecord.class;
    }

    /**
     * The column <code>public.test_item_results.item_id</code>.
     */
    public final TableField<JTestItemResultsRecord, Long> ITEM_ID = createField("item_id", org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * The column <code>public.test_item_results.status</code>.
     */
    public final TableField<JTestItemResultsRecord, JStatusEnum> STATUS = createField("status", org.jooq.util.postgres.PostgresDataType.VARCHAR.asEnumDataType(com.epam.ta.reportportal.store.jooq.enums.JStatusEnum.class), this, "");

    /**
     * The column <code>public.test_item_results.duration</code>.
     */
    public final TableField<JTestItemResultsRecord, Long> DURATION = createField("duration", org.jooq.impl.SQLDataType.BIGINT, this, "");

    /**
     * Create a <code>public.test_item_results</code> table reference
     */
    public JTestItemResults() {
        this(DSL.name("test_item_results"), null);
    }

    /**
     * Create an aliased <code>public.test_item_results</code> table reference
     */
    public JTestItemResults(String alias) {
        this(DSL.name(alias), TEST_ITEM_RESULTS);
    }

    /**
     * Create an aliased <code>public.test_item_results</code> table reference
     */
    public JTestItemResults(Name alias) {
        this(alias, TEST_ITEM_RESULTS);
    }

    private JTestItemResults(Name alias, Table<JTestItemResultsRecord> aliased) {
        this(alias, aliased, null);
    }

    private JTestItemResults(Name alias, Table<JTestItemResultsRecord> aliased, Field<?>[] parameters) {
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
        return Arrays.<Index>asList(Indexes.TEST_ITEM_RESULTS_PK);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<JTestItemResultsRecord> getPrimaryKey() {
        return Keys.TEST_ITEM_RESULTS_PK;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<JTestItemResultsRecord>> getKeys() {
        return Arrays.<UniqueKey<JTestItemResultsRecord>>asList(Keys.TEST_ITEM_RESULTS_PK);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<ForeignKey<JTestItemResultsRecord, ?>> getReferences() {
        return Arrays.<ForeignKey<JTestItemResultsRecord, ?>>asList(Keys.TEST_ITEM_RESULTS__TEST_ITEM_RESULTS_ITEM_ID_FKEY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JTestItemResults as(String alias) {
        return new JTestItemResults(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JTestItemResults as(Name alias) {
        return new JTestItemResults(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public JTestItemResults rename(String name) {
        return new JTestItemResults(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public JTestItemResults rename(Name name) {
        return new JTestItemResults(name, null);
    }
}
