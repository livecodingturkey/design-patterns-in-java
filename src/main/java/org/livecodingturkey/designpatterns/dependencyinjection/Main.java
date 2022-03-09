package org.livecodingturkey.designpatterns.dependencyinjection;
//There are basically 3 types of DI. These; 
//Constructor Injection, Setter Injection, Method Injection) 
//All methods rely on externally injecting their dependent classes

//CustomerDal 
public class CustomerDal implements ICustomerDal{
  public void add(){
    System.out.println("Oracle Veritabanı eklendi.");
  }
}
//CustomerManager
public class CustomerManager{
  
  private ICustomerManager(ICustomerDal customerDal){
    this.customerDal=customerDal;
  }
  public void add(){
    customerDal.add();
  }
}

public interface ICustomerDal{
  void add();
}

public class MySqlCustomerDal implements ICustomerDal{
  @Override
  public void add(){
    System.out.println("Mysql veritabanına eklendi.");
  }
}

public class Main {
  CustomerManager manager=new CustomerManager(new  CustomerDal));
  CustomerManager manager=new CustomerManager(new  MySqlCustomerDal));
  
  manager.add();

}
