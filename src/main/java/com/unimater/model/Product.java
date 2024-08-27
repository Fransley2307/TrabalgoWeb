package com.unimater.model;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Product implements Entity {

    private int id;
    private ProductType productType;
    private String description;
    private double value;

    public Product(int id, ProductType productType, String description, double value) {
        this.id = id;
        this.productType = productType;
        this.description = description;
        this.value = value;
    }

    public Product(ResultSet rs) throws SQLException {
        super();
        this.id = rs.getInt("id");
        this.value = rs.getDouble("value");
        this.description = rs.getString("description");
    }

    public Product() {

    }

    @Override
    public Entity constructFromResultSet(ResultSet rs) throws SQLException {
        return new Product(rs);
    }

    @Override
    public PreparedStatement prepareStatement(PreparedStatement preparedStatement) throws SQLException {
        preparedStatement.setString(1, getDescription());
        preparedStatement.setDouble(2, getValue());

        return preparedStatement;
    }

    public int getId() {
        return id;
    }

    public ProductType getProductType() {
        return productType;
    }

    public String getDescription() {
        return description;
    }

    public double getValue() {
        return value;
    }

    public void setId(int id) {
        this.id = id;
    }

}
