package bussiness_layer.entity;


public abstract class User {
    //Fields
    protected String id;
    protected String name;

    public User() {
    }

    public User(String id, String name) {
        this.id = id;
        this.name = name;
    }
    
        
    //insert methods here   
    public String getId() {
        return id.toUpperCase();
    }

    public void setId(String id) throws Exception{        
        this.id = id;
    }

    public String getName() {
        return toTiteCase(name);
    }

    public void setName(String name) {
        this.name = name;
    }

    public String toTiteCase(String value) {
        String s = "";
        value = value.trim().replaceAll("\\s+", " ").toLowerCase();
        String[] words = value.split(" ");
        for (String word : words) {
            char[] arr = word.toCharArray();
            arr[0] = Character.toUpperCase(arr[0]);
            s = s + new String(arr) + " ";
        }
        return s.trim();
    }

    @Override
    public String toString() {
        return String.format("%s, %s", id, name);
    }
}
