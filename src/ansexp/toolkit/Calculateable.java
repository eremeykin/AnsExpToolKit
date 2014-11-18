/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ansexp.toolkit;

import java.io.File;
import java.io.IOException;

/**
 *
 * @author eremeykin
 */

/**
 * Interface that shows that class object could be calculated, and 
 * all results could be printed to file. Also it can require SQL connection.
 *
 */
public interface Calculateable {
    
    /**
     * Calculates all needed parametrs inside DataSource.
     * @param root
     * @return DataSource with calculated parametrs.
     */
    public DataSource calculate(DataSource root);

    /**
     * Prints result of calculations into the File
     * @param pattern is pattern *.mac file with <> tags to replace
     * @return File which is ready to be started in ANSYS
     * @throws java.io.IOException if something goes wrong
     */
    public File printToFile(File pattern) throws IOException;
    
    /**
     * Passes the connection to the caller
     * @param connection
     */
    public void setConnection(java.sql.Connection connection);
}
