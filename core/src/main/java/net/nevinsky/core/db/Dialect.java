package net.nevinsky.core.db;

/**
 * Created with IntelliJ IDEA.
 * User: inver
 * Date: 20.06.13
 * Time: 19:52
 * To change this template use File | Settings | File Templates.
 */
public enum Dialect {
    MYSQL("org.hibernate.dialect.MySQLDialect");

    private String className;

    private Dialect(String className) {
        this.className = className;
    }

    public String getClassName() {
        return className;
    }
}
