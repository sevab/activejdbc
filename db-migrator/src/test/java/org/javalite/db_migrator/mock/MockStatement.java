/*
Copyright 2009-2010 Igor Polevoy 

Licensed under the Apache License, Version 2.0 (the "License"); 
you may not use this file except in compliance with the License. 
You may obtain a copy of the License at 

http://www.apache.org/licenses/LICENSE-2.0 

Unless required by applicable law or agreed to in writing, software 
distributed under the License is distributed on an "AS IS" BASIS, 
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. 
See the License for the specific language governing permissions and 
limitations under the License. 
*/

/**
 * @author Igor Polevoy: 12/31/13 1:09 PM
 */

package org.javalite.db_migrator.mock;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class MockStatement implements Statement {


    protected List<String> executedStatements =  new ArrayList<String>();

    public List<String> getExecutedStatements() {
        return executedStatements;
    }

    public ResultSet executeQuery(String sql) throws SQLException {
        executedStatements.add(sql);
        return null;  
    }

    public int executeUpdate(String sql) throws SQLException {
        executedStatements.add(sql);
        return 0;  
    }

    public void close() throws SQLException {
        
    }

    public int getMaxFieldSize() throws SQLException {
        return 0;  
    }

    public void setMaxFieldSize(int max) throws SQLException {
        
    }

    public int getMaxRows() throws SQLException {
        return 0;  
    }

    public void setMaxRows(int max) throws SQLException {
        
    }

    public void setEscapeProcessing(boolean enable) throws SQLException {
        
    }

    public int getQueryTimeout() throws SQLException {
        return 0;  
    }

    public void setQueryTimeout(int seconds) throws SQLException {
        
    }

    public void cancel() throws SQLException {
        
    }

    public SQLWarning getWarnings() throws SQLException {
        return null;  
    }

    public void clearWarnings() throws SQLException {
        
    }

    public void setCursorName(String name) throws SQLException {
        
    }

    public boolean execute(String sql) throws SQLException {
        executedStatements.add(sql);
        return false;  
    }

    public ResultSet getResultSet() throws SQLException {
        return null;  
    }

    public int getUpdateCount() throws SQLException {
        return 0;  
    }

    public boolean getMoreResults() throws SQLException {
        return false;  
    }

    public void setFetchDirection(int direction) throws SQLException {
        
    }

    public int getFetchDirection() throws SQLException {
        return 0;  
    }

    public void setFetchSize(int rows) throws SQLException {
        
    }

    public int getFetchSize() throws SQLException {
        return 0;  
    }

    public int getResultSetConcurrency() throws SQLException {
        return 0;  
    }

    public int getResultSetType() throws SQLException {
        return 0;  
    }

    public void addBatch(String sql) throws SQLException {
        
    }

    public void clearBatch() throws SQLException {
        
    }

    public int[] executeBatch() throws SQLException {
        return new int[0];  
    }

    public Connection getConnection() throws SQLException {
        return null;  
    }

    public boolean getMoreResults(int current) throws SQLException {
        return false;  
    }

    public ResultSet getGeneratedKeys() throws SQLException {
        return null;  
    }

    public int executeUpdate(String sql, int autoGeneratedKeys) throws SQLException {
        executedStatements.add(sql);
        return 0;  
    }

    public int executeUpdate(String sql, int[] columnIndexes) throws SQLException {
        executedStatements.add(sql);
        return 0;  
    }

    public int executeUpdate(String sql, String[] columnNames) throws SQLException {
        executedStatements.add(sql);
        return 0;  
    }

    public boolean execute(String sql, int autoGeneratedKeys) throws SQLException {
        executedStatements.add(sql);
        return false;  
    }

    public boolean execute(String sql, int[] columnIndexes) throws SQLException {
        executedStatements.add(sql);
        return false;  
    }

    public boolean execute(String sql, String[] columnNames) throws SQLException {
        executedStatements.add(sql);
        return false;  
    }

    public int getResultSetHoldability() throws SQLException {
        return 0;  
    }

    public boolean isClosed() throws SQLException {
        return false;  
    }

    public void setPoolable(boolean poolable) throws SQLException {
        
    }

    public boolean isPoolable() throws SQLException {
        return false;  
    }

    public void closeOnCompletion() throws SQLException {
        
    }

    public boolean isCloseOnCompletion() throws SQLException {
        return false;  
    }

    public <T> T unwrap(Class<T> iface) throws SQLException {
        return null;  
    }

    public boolean isWrapperFor(Class<?> iface) throws SQLException {
        return false;  
    }
}
