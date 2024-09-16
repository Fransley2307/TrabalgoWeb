package com.unimater.controller;


import com.sun.net.httpserver.HttpExchange;
import com.sun.net.httpserver.HttpHandler;
import com.unimater.dao.ProductTypeDAO;
import com.unimater.model.ProductType;

import java.io.IOException;
import java.sql.Connection;

public class ProductTyepHandler implements HttpHandler  {

    private ProductTypeDAO productTypeDAO;
    private Connection connection;

    public ProductTyepHandler (Http)

    @Override
    public void handle (HttpExchange exchange) throws IOException {
        if(exchange.getRequestMethod().equals("GET") ){
            ProductType productType = productTypeDAO.getById(1);
            System.out.println(productType);
            exchange.sendResponseHeaders();


        }else {
            exchange.sendResponseHeaders(405, -1);
        }



    }
}
