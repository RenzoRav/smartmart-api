package com.smartmart.ws.api.utils.database;

import java.io.Serializable;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import static java.sql.Types.OTHER;
import static java.sql.Types.VARCHAR;
import java.util.Objects;

import org.hibernate.engine.spi.SharedSessionContractImplementor;
import org.hibernate.usertype.UserType;

public class PostgreSQLEnumType<E extends Enum<E>> implements UserType<E> {
    private final Class<E> enumClass;

    public PostgreSQLEnumType(Class<E> clazz) {
       this.enumClass = clazz;
    }

    @Override
    public int getSqlType() {
        return VARCHAR;
    }

    @Override
    public Class<E> returnedClass() {
        return enumClass;
    }

    @Override
    public boolean equals(E x, E y) {
        return Objects.equals(x, y);
    }

    @Override
    public int hashCode(E x) {
        return x.hashCode();
    }

    @Override
    public E nullSafeGet(ResultSet rs, int position, SharedSessionContractImplementor session, Object owner) throws SQLException {
        String name = rs.getString(position);
        return rs.wasNull() ? null : Enum.valueOf(enumClass, name);
    }

    @Override
    public void nullSafeSet(PreparedStatement st, E value, int index, SharedSessionContractImplementor session) throws SQLException {
        if(value == null) {
            st.setNull(index, OTHER);
        } else {
            st.setObject(index, value.name(), OTHER);
        }
    }

    @Override
    public E deepCopy(E value) {
        return value;
    }

    @Override
    public boolean isMutable() {
        return false;
    }

    @Override
    public Serializable disassemble(E value) {
        return value;
    }

    @SuppressWarnings("unchecked")
    @Override
    public E assemble(Serializable cached, Object owner) {
        return (E) cached;
    }
}
