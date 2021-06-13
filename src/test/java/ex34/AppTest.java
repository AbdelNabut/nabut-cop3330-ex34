package ex34;

import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.Test;

import java.lang.reflect.Array;
import java.util.Locale;

public class AppTest 
{

    @org.junit.jupiter.api.Test
    void removeEmployee() {
        String employeeName="Mary";
        String[] employees = {"Jim", "Bob", "Rebecca", "Mary"};
        String[] finalEmployees = {"Jim", "Bob", "Rebecca"};
        String[] newSetOfEmployees = new String[employees.length-1];
        int newArrayCurrentIndex = 0;
        for(int i = 0; i < Array.getLength(employees); i++) {
            if(!(employees[i].toLowerCase(Locale.ROOT).equals(employeeName.toLowerCase(Locale.ROOT))))
                newSetOfEmployees[newArrayCurrentIndex++] = employees[i];
        }
        assertArrayEquals(finalEmployees, newSetOfEmployees);
    }
}
