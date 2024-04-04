package bussiness_layer.entity;

import bussiness_layer.components.DataValidation;


public class Employee extends User {    
    private String email;
    //Constructors
    public Employee(String id, String name,String email) throws Exception {
        super(id, name);
        setId(id);
        this.email = email;
        this.name = name;
    }
    
    @Override
    public void setId(String value) throws Exception{
        if(!DataValidation.checkStringWithFormat(value.toUpperCase(),"E\\d{3}")){
            throw new Exception("Id invalid. The correct format:Exxx, with x is digits");
        }
        this.id = value;
    }
    
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }  
    
    //Methods....     
     @Override    
    public String toString(){
        return String.format("%s, %s, %s",getId(),getName(),email);
    }
}
