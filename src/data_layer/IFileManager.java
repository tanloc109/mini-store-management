package data_layer;

import java.util.List;

public interface IFileManager<T> { 
    List<String> readDataFromFile()  throws Exception; 
    //To do here
}