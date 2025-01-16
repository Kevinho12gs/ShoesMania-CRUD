package com.shoesmania.service;

import com.shoesmania.model.Producto;
import com.shoesmania.repository.ProductoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductoService {
    @Autowired
    private ProductoRepository repository;

    public List<Producto> getAllProductos() { return repository.findAll(); }
    public Producto getProductoById(Long id) { return repository.findById(id).orElse(null); }
    public Producto saveProducto(Producto producto) { return repository.save(producto); }
    public void deleteProducto(Long id) { repository.deleteById(id); }
}
