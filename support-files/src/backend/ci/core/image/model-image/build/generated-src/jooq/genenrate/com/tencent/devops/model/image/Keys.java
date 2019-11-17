/*
 * This file is generated by jOOQ.
*/
package com.tencent.devops.model.image;


import com.tencent.devops.model.image.tables.TUploadImageTask;
import com.tencent.devops.model.image.tables.records.TUploadImageTaskRecord;

import org.jooq.UniqueKey;
import org.jooq.impl.AbstractKeys;


/**
 * A class modelling foreign key relationships between tables of the <code>devops_image</code> 
 * schema
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Keys {

    // -------------------------------------------------------------------------
    // IDENTITY definitions
    // -------------------------------------------------------------------------


    // -------------------------------------------------------------------------
    // UNIQUE and PRIMARY KEY definitions
    // -------------------------------------------------------------------------

    public static final UniqueKey<TUploadImageTaskRecord> KEY_T_UPLOAD_IMAGE_TASK_PRIMARY = UniqueKeys0.KEY_T_UPLOAD_IMAGE_TASK_PRIMARY;

    // -------------------------------------------------------------------------
    // FOREIGN KEY definitions
    // -------------------------------------------------------------------------


    // -------------------------------------------------------------------------
    // [#1459] distribute members to avoid static initialisers > 64kb
    // -------------------------------------------------------------------------

    private static class UniqueKeys0 extends AbstractKeys {
        public static final UniqueKey<TUploadImageTaskRecord> KEY_T_UPLOAD_IMAGE_TASK_PRIMARY = createUniqueKey(TUploadImageTask.T_UPLOAD_IMAGE_TASK, "KEY_T_UPLOAD_IMAGE_TASK_PRIMARY", TUploadImageTask.T_UPLOAD_IMAGE_TASK.TASK_ID);
    }
}