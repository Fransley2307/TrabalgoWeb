package com.unimater.dao;

import com.unimater.model.Product;
import com.unimater.model.Sale;

import java.sql.Connection;
import java.util.List;
import java.util.function.Supplier;

public class SaleDAO extends GenericDAOImpl<Sale> implements GenericDAO<Sale>{
    private Connection connection;
    private final String TABLE_NAME = "sale";

    private final List<String> COLUMNS = List.of("inset_at");

    public SaleDAO(Connection connection) {
        super(Sale::new, connection);
        super.tableName = TABLE_NAME;
        super.columns = COLUMNS;
    }
}
