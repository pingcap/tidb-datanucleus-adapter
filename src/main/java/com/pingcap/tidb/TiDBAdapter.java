package com.pingcap.tidb;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import org.datanucleus.store.rdbms.adapter.MySQLAdapter;

public class TiDBAdapter extends MySQLAdapter {

//  extends MySQLAdapter
  /**
   * Constructor. Overridden so we can add on our own list of NON SQL92 reserved words which is
   * returned incorrectly with the JDBC driver.
   *
   * @param metadata MetaData for the DB
   **/
  public TiDBAdapter(DatabaseMetaData metadata) {
    super(metadata);
}

  /**
   * Accessor for the transaction isolation level to use during schema creation.
   * @return The transaction isolation level for schema generation process
   */
  public int getTransactionIsolationForSchemaCreation() {
    return Connection.TRANSACTION_READ_COMMITTED;
  }
}
