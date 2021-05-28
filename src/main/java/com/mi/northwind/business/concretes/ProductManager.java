package com.mi.northwind.business.concretes;

import com.mi.northwind.business.abstracts.ProductService;
import com.mi.northwind.core.utilities.results.DataResult;
import com.mi.northwind.core.utilities.results.Result;
import com.mi.northwind.core.utilities.results.SuccessDataResult;
import com.mi.northwind.core.utilities.results.SuccessResult;
import com.mi.northwind.dataAccess.abstracts.ProductDao;
import com.mi.northwind.entities.concretes.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductManager implements ProductService {


    private ProductDao productDao;

    @Autowired
    public ProductManager(ProductDao productDao) {
        this.productDao = productDao;
    }


    @Override
    public DataResult<List<Product>> getAll() {
        return new SuccessDataResult<List<Product>>(this.productDao.findAll(), "Data Listelendi");
    }

    @Override
    public Result add(Product product) {
        this.productDao.save(product);
        return new SuccessResult("Urun eklendi");
    }
}
