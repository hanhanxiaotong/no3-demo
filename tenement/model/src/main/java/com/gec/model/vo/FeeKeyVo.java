package com.gec.model.vo;

import com.gec.model.entity.AttrKey;
import com.gec.model.entity.AttrValue;
import com.gec.model.entity.FeeKey;
import com.gec.model.entity.FeeValue;
import io.swagger.v3.oas.annotations.media.Schema;

import java.io.Serializable;
import java.util.List;

public class FeeKeyVo extends FeeKey implements Serializable {

    //序列化
    private static final long serialVersionUID = 1L;


    //多个属性值列表
    @Schema(description = "多个属性值列表")
    private List<FeeValue> feeValueList;


}
