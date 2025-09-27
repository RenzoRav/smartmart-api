package com.smartmart.ws.api.entity.enums.types;

import com.smartmart.ws.api.entity.enums.TipoStatus;
import com.smartmart.ws.api.utils.database.PostgreSQLEnumType;

public class StatusType extends PostgreSQLEnumType<TipoStatus> {
    public StatusType() {
        super(TipoStatus.class);
    }

}
