/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bussiness_layer.service;

import java.util.List;


// single interface to all 'repositories'
public interface IService<T> {
    //Repository      
    void printList() throws Exception ;   
    List<T> getList() throws Exception;    
    void add(T obj) throws Exception;     
    //The other repositories
    //.....
}
