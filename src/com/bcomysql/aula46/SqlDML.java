package com.bcomysql.aula46;

public interface SqlDML {
    void insert(String insert);
    void update(String update);
    void delete(String delete);
    String select(String select);
}
