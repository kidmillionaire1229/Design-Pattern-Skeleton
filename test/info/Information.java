package info;

import static org.junit.jupiter.api.Assertions.*;

public class Information {
    private Integer id;
    private String name;

    @org.junit.jupiter.api.Test
    public void info(){
        id = 20192952;   // insert your student ID (학번)
        name = "김민준"; // insert your name (이름) in Korean

        System.out.println("ID: " + id);
        System.out.println("Name: " + name);

        assertNotNull(id);
        assertNotNull(name);
    }

}
