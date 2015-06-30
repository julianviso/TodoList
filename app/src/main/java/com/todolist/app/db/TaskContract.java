package com.todolist.app.db;

import android.provider.BaseColumns;

/**
 * Created by jviso on 6/29/2015.
 */

public class TaskContract {
    public static final String DB_NAME = "com.todolist.app.db.tasks";
    public static final int DB_VERSION = 1;
    public static final String TABLE = "tasks";

    public class Columns{
        public static final String TASK = "task";
        public static final String _ID = BaseColumns._ID;
    }
}
