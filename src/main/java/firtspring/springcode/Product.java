package firtspring.springcode;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name ="product")
public class Product 
{ @Id
    long id;
    @Column(name = "name" ,nullable = false)
    String name;
    @Column(name = "salary" ,nullable = true)
    float salary;
    
    public float getsalary() {
        return salary;
    }
    public void setSalary(float salary) {
        this.salary = salary;
    }
    public long getId() {
        return id;
    }
    public void setId(long id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    
	

}
