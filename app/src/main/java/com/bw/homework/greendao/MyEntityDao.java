package com.bw.homework.greendao;

import android.database.Cursor;
import android.database.sqlite.SQLiteStatement;

import org.greenrobot.greendao.AbstractDao;
import org.greenrobot.greendao.Property;
import org.greenrobot.greendao.internal.DaoConfig;
import org.greenrobot.greendao.database.Database;
import org.greenrobot.greendao.database.DatabaseStatement;

import com.bw.homework.MyEntity;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT.
/** 
 * DAO for table "MY_ENTITY".
*/
public class MyEntityDao extends AbstractDao<MyEntity, Long> {

    public static final String TABLENAME = "MY_ENTITY";

    /**
     * Properties of entity MyEntity.<br/>
     * Can be used for QueryBuilder and for referencing column names.
     */
    public static class Properties {
        public final static Property Id = new Property(0, Long.class, "id", true, "_id");
        public final static Property Phone = new Property(1, String.class, "phone", false, "PHONE");
        public final static Property Pwd = new Property(2, String.class, "pwd", false, "PWD");
    }


    public MyEntityDao(DaoConfig config) {
        super(config);
    }
    
    public MyEntityDao(DaoConfig config, DaoSession daoSession) {
        super(config, daoSession);
    }

    /** Creates the underlying database table. */
    public static void createTable(Database db, boolean ifNotExists) {
        String constraint = ifNotExists? "IF NOT EXISTS ": "";
        db.execSQL("CREATE TABLE " + constraint + "\"MY_ENTITY\" (" + //
                "\"_id\" INTEGER PRIMARY KEY ," + // 0: id
                "\"PHONE\" TEXT," + // 1: phone
                "\"PWD\" TEXT);"); // 2: pwd
    }

    /** Drops the underlying database table. */
    public static void dropTable(Database db, boolean ifExists) {
        String sql = "DROP TABLE " + (ifExists ? "IF EXISTS " : "") + "\"MY_ENTITY\"";
        db.execSQL(sql);
    }

    @Override
    protected final void bindValues(DatabaseStatement stmt, MyEntity entity) {
        stmt.clearBindings();
 
        Long id = entity.getId();
        if (id != null) {
            stmt.bindLong(1, id);
        }
 
        String phone = entity.getPhone();
        if (phone != null) {
            stmt.bindString(2, phone);
        }
 
        String pwd = entity.getPwd();
        if (pwd != null) {
            stmt.bindString(3, pwd);
        }
    }

    @Override
    protected final void bindValues(SQLiteStatement stmt, MyEntity entity) {
        stmt.clearBindings();
 
        Long id = entity.getId();
        if (id != null) {
            stmt.bindLong(1, id);
        }
 
        String phone = entity.getPhone();
        if (phone != null) {
            stmt.bindString(2, phone);
        }
 
        String pwd = entity.getPwd();
        if (pwd != null) {
            stmt.bindString(3, pwd);
        }
    }

    @Override
    public Long readKey(Cursor cursor, int offset) {
        return cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0);
    }    

    @Override
    public MyEntity readEntity(Cursor cursor, int offset) {
        MyEntity entity = new MyEntity( //
            cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0), // id
            cursor.isNull(offset + 1) ? null : cursor.getString(offset + 1), // phone
            cursor.isNull(offset + 2) ? null : cursor.getString(offset + 2) // pwd
        );
        return entity;
    }
     
    @Override
    public void readEntity(Cursor cursor, MyEntity entity, int offset) {
        entity.setId(cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0));
        entity.setPhone(cursor.isNull(offset + 1) ? null : cursor.getString(offset + 1));
        entity.setPwd(cursor.isNull(offset + 2) ? null : cursor.getString(offset + 2));
     }
    
    @Override
    protected final Long updateKeyAfterInsert(MyEntity entity, long rowId) {
        entity.setId(rowId);
        return rowId;
    }
    
    @Override
    public Long getKey(MyEntity entity) {
        if(entity != null) {
            return entity.getId();
        } else {
            return null;
        }
    }

    @Override
    public boolean hasKey(MyEntity entity) {
        return entity.getId() != null;
    }

    @Override
    protected final boolean isEntityUpdateable() {
        return true;
    }
    
}
