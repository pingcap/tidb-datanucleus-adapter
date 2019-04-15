TiDB-datanculeus-adapter
=======================

This is project created to override datanculeus's MySQLAdapter's behavior. 

It can be used as follows:

```xml
<property>
  <name>datanucleus.rdbms.datastoreAdapterClassName</name>
  <value>com.pingcap.tidb.TiDBAdapter</value>
</property>
```

In addition, you need include this project as compile time dependency in the following:

```xml
<dependency>
  <groupId>com.pingcap.tidb</groupId>
  <artifactId>tidb-datanucleus-adapter</artifactId>
  <version>1.0</version>
 <scope>compile</scope>
</dependency>
```

