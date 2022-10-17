package firtspring.springcode;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class ProductService
{@Autowired
    private myRepo repo;
    
    public List<Product> displayData()
    {
        return repo.findAll();
    }
    public void saveProduct(Product product)
    {
        repo.save(product);
    }
    public Product getPro(long id)
    {
        return repo.findById(id).get();
    }
    public void delete(long id)
    {
        repo.deleteById(id);
    }
}



