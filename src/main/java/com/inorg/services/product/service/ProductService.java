package com.inorg.services.product.service;

import com.commercetools.api.models.product.Product;
import com.commercetools.api.models.product.ProductPagedQueryResponse;
import com.commercetools.api.models.product.ProductProjection;
import com.commercetools.api.models.product.ProductProjectionPagedQueryResponse;
import com.commercetools.api.models.product.ProductProjectionPagedSearchResponse;

import java.util.List;

public interface ProductService {
    public Product getProductById(String productId);
    public Product getProductByKey(String productKey);
    ProductProjection getProductProjectionById(String productId);

    ProductProjectionPagedQueryResponse getProductProjectionByQuery();

    List<Product> createProducts();

    ProductPagedQueryResponse getProductsByCategory(String categoryId);

    ProductProjectionPagedSearchResponse searchProducts(String searchText);
}
