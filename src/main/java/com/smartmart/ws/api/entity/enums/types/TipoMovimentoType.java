package com.smartmart.ws.api.entity.enums.types;

import com.smartmart.ws.api.entity.enums.TipoMovimento;
import com.smartmart.ws.api.utils.database.PostgreSQLEnumType;

public class TipoMovimentoType extends PostgreSQLEnumType<TipoMovimento> {
    public TipoMovimentoType() {
        super(TipoMovimento.class);
    }
}
