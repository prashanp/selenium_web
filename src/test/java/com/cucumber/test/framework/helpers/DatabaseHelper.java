package com.cucumber.test.framework.helpers;

import org.apache.commons.dbutils.DbUtils;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.ResultSetHandler;
import org.apache.commons.dbutils.handlers.MapListHandler;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.AbstractCollection;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class DatabaseHelper {

    private static final Logger LOG = LoggerFactory.getLogger(DatabaseHelper.class);
    private static final String jdbcUrl;
    private static final String jdbcDriver;
    private static final String jdbcUser;
    private static final String jdbcPwd;
    
    private static final String RUN_CONFIG_PROPERTIES = "/environment.properties";
    private static Connection conn = null;
   

    static {
        Props.loadRunConfigProps(RUN_CONFIG_PROPERTIES);

        jdbcUrl = Props.getProp("jdbcUrl");
        jdbcDriver = Props.getProp("jdbcDriver");
        jdbcUser = Props.getProp("jdbcUser");
        jdbcPwd = Props.getProp("jdbcPwd");
        
    }

    protected static Connection setUpConnection() {

        try {
            DbUtils.loadDriver(jdbcDriver);
            return DriverManager.getConnection(jdbcUrl, jdbcUser, jdbcPwd);
        } catch (SQLException se) {
            LOG.info(se.getMessage());


        } finally {
            DbUtils.closeQuietly(conn);
        }
        return conn;
    }

    /**
     * Executes the sql Query and returns the results in list format
     *
     * @param sqlQuery Specify sql query in String format
     * @return 
     */
    public  List<Map<String, Object>> executeQuery(Connection con,String sqlQuery) throws SQLException {
    	return getQueryRunner().query(setUpConnection(), sqlQuery, new MapListHandler());
     }

    public static String executesqlQuery(String sql) throws SQLException {
    	try {
    	  String scripts = getQueryRunner().query(setUpConnection(),sql,
    	          new ResultSetHandler<String>() {
    	              public String handle(ResultSet rs) throws SQLException {
    	                  HashSet<String> rows = new HashSet<String>();
    	                  while (rs.next()) {
    	                      rows.add(rs.getString(1));
    	                  }
    	                  return rows.toString();
    	              }
    	          });
    	  return scripts;
    	} catch (SQLException e) {
    	  throw new RuntimeException(e);
    	}
      }
    
    protected static QueryRunner getQueryRunner() {
        return new QueryRunner();
    }
}