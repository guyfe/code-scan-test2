/*
 * This file is generated by jOOQ.
 */
package com.home.jooq.entity;


import com.home.jooq.entity.tables.Article;
import com.home.jooq.entity.tables.Author;

import java.util.Arrays;
import java.util.List;

import org.jooq.Catalog;
import org.jooq.Table;
import org.jooq.impl.SchemaImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Testing extends SchemaImpl {

    private static final long serialVersionUID = -874600002;

    /**
     * The reference instance of <code>testing</code>
     */
    public static final Testing TESTING = new Testing();

    /**
     * The table <code>testing.ARTICLE</code>.
     */
    public final Article ARTICLE = Article.ARTICLE;

    /**
     * The table <code>testing.AUTHOR</code>.
     */
    public final Author AUTHOR = Author.AUTHOR;

    /**
     * No further instances allowed
     */
    private Testing() {
        super("testing", null);
    }


    @Override
    public Catalog getCatalog() {
        return DefaultCatalog.DEFAULT_CATALOG;
    }

    @Override
    public final List<Table<?>> getTables() {
        return Arrays.<Table<?>>asList(
            Article.ARTICLE,
            Author.AUTHOR);
    }
}
