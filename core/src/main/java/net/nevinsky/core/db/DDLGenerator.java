package net.nevinsky.core.db;

import net.nevinsky.global.entity.Employee;
import org.hibernate.cfg.Configuration;
import org.hibernate.cfg.Environment;
import org.hibernate.tool.hbm2ddl.SchemaExport;

/**
 * Created with IntelliJ IDEA.
 * User: inver
 * Date: 20.06.13
 * Time: 19:52
 * To change this template use File | Settings | File Templates.
 */
public class DDLGenerator {

    public static void main(String[] args) {
        new DDLGenerator().execute(Dialect.MYSQL,
                Employee.class
        );
    }

    private void execute(Dialect dialect, Class<?>... classes) {
        Configuration configuration = new Configuration();
        configuration.setProperty(Environment.DIALECT, dialect.getClassName());
        for (Class<?> entityClass : classes) {
            configuration.addAnnotatedClass(entityClass);
        }
        SchemaExport schemaExport = new SchemaExport(configuration);
        schemaExport.setDelimiter(";");
        schemaExport.setOutputFile(String.format("core/src/main/db/%s/10.create-db.sql", new Object[]{dialect.name().toLowerCase()}));
        boolean consolePrint = true;
        boolean exportInDatabase = false;
        schemaExport.create(consolePrint, exportInDatabase);
    }
}
