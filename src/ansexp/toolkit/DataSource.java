/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ansexp.toolkit;

/**
 *
 * @author eremeykin
 */

/**
 * Interface that shows that class object could be a 
 * data source. DataSource is an abstract source of various data
 * which could be read/write by ID 
 *
 */
public interface DataSource {
    
    /**
     * Returns a string representation of specified field
     * @param id
     * @return String representation of specified field
     */
    String getValueById(String id);

    /**
     * Sets a string representation of specified field
     * @param id
     * @param value
     */
    void setValueById(String id,String value);
}
