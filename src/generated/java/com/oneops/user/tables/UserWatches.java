/*
 * This file is generated by jOOQ.
*/
package com.oneops.user.tables;


import com.oneops.user.Keys;
import com.oneops.user.Public;
import com.oneops.user.tables.records.UserWatchesRecord;

import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Identity;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.UniqueKey;
import org.jooq.impl.TableImpl;


/**
 * This class is generated by jOOQ.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.9.2"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class UserWatches extends TableImpl<UserWatchesRecord> {

    private static final long serialVersionUID = -400886550;

    /**
     * The reference instance of <code>public.user_watches</code>
     */
    public static final UserWatches USER_WATCHES = new UserWatches();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<UserWatchesRecord> getRecordType() {
        return UserWatchesRecord.class;
    }

    /**
     * The column <code>public.user_watches.id</code>.
     */
    public final TableField<UserWatchesRecord, Integer> ID = createField("id", org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaultValue(org.jooq.impl.DSL.field("nextval('user_watches_id_seq'::regclass)", org.jooq.impl.SQLDataType.INTEGER)), this, "");

    /**
     * The column <code>public.user_watches.user_id</code>.
     */
    public final TableField<UserWatchesRecord, Integer> USER_ID = createField("user_id", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>public.user_watches.ci_proxy_id</code>.
     */
    public final TableField<UserWatchesRecord, Integer> CI_PROXY_ID = createField("ci_proxy_id", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * Create a <code>public.user_watches</code> table reference
     */
    public UserWatches() {
        this("user_watches", null);
    }

    /**
     * Create an aliased <code>public.user_watches</code> table reference
     */
    public UserWatches(String alias) {
        this(alias, USER_WATCHES);
    }

    private UserWatches(String alias, Table<UserWatchesRecord> aliased) {
        this(alias, aliased, null);
    }

    private UserWatches(String alias, Table<UserWatchesRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, "");
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Schema getSchema() {
        return Public.PUBLIC;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Identity<UserWatchesRecord, Integer> getIdentity() {
        return Keys.IDENTITY_USER_WATCHES;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<UserWatchesRecord> getPrimaryKey() {
        return Keys.USER_WATCHES_PKEY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<UserWatchesRecord>> getKeys() {
        return Arrays.<UniqueKey<UserWatchesRecord>>asList(Keys.USER_WATCHES_PKEY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UserWatches as(String alias) {
        return new UserWatches(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public UserWatches rename(String name) {
        return new UserWatches(name, null);
    }
}