package com.mi.northwind.business.abstracts;

import com.mi.northwind.core.utilities.results.DataResult;
import com.mi.northwind.core.utilities.results.Result;
import com.mi.northwind.entities.concretes.Product;

import java.util.List;

public interface ProductService {
    DataResult<List<Product>> getAll();
    Result add(Product product);

}
