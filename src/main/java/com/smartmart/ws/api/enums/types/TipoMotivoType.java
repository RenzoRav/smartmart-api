package com.smartmart.ws.api.enums.types;

import com.smartmart.ws.api.enums.TipoMotivo;
import com.smartmart.ws.api.utils.database.PostgreSQLEnumType;

public class TipoMotivoType extends PostgreSQLEnumType<TipoMotivo> {
    public TipoMotivoType() {
        super(TipoMotivo.class);
    }

}
