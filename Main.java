/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ooad;

import javax.persistence.*;
import java.util.*;
import java.sql.*;

/**
 *
 * @author Panisa
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Scanner input = new Scanner (System.in);


        EntityManagerFactory emf = Persistence.createEntityManagerFactory("Food.odb");
        EntityManager em = emf.createEntityManager();
        
        em.getTransaction().begin();        

                    Food p = new Food();
                    em.persist(p);
                   
                    p.setName("//name");
                  
                    p.setType("//type");
                   
                    p.setRecipe("//recipe");
                    

   
        em.getTransaction().commit();
        
         em.close();
        emf.close();
         
    }
    
}
