package firtspring.springcode;


import org.springframework.data.jpa.repository.JpaRepository;

public interface myRepo extends JpaRepository<Product,Long>
{
	

}
