package com.gec.model.vo;

import com.gec.model.entity.ApartmentInfo;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

import java.util.List;

@Schema(description = "提交公寓信息")
@Data
public class ApartmentSubmitVo extends ApartmentInfo {
    @Schema(description = "公寓配套ids")
    private List<Long> facilityIds;

    @Schema(description = "公寓标签ids")
    private List<Long> labelIds;

    @Schema(description = "公寓杂费值ids")
    private List<Long> feeIds;

    @Schema(description = "公寓图片ids")
    private List<Long> apartmentIds;

}
