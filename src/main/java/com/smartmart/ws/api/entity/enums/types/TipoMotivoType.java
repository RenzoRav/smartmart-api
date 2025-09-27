package com.smartmart.ws.api.entity.enums.types;

import com.smartmart.ws.api.entity.enums.TipoMotivo;
import com.smartmart.ws.api.utils.database.PostgreSQLEnumType;

public class TipoMotivoType extends PostgreSQLEnumType<TipoMotivo> {
    public TipoMotivoType() {
        super(TipoMotivo.class);
    }

}
