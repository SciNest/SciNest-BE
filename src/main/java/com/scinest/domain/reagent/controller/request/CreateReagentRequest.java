package com.scinest.domain.reagent.controller.request;

import com.scinest.domain.reagent.enums.Classification;
import com.scinest.domain.reagent.enums.ReagentCabinet;
import com.scinest.domain.reagent.enums.Status;
import io.swagger.v3.oas.annotations.media.Schema;

@Schema(description = "시약 생성 요청 객체")
public record CreateReagentRequest(

  @Schema(description = "시약명")
  String reagentName,

  @Schema(description = "영문명")
  String englishName,

  @Schema(description = "화학식")
  String chemicalFormula,

  @Schema(description = "분류")
  Classification classification,

  @Schema(description = "상태")
  Status status,

  @Schema(description = "시약장")
  ReagentCabinet reagentCabinet,

  @Schema(description = "수량")
  Integer quantity,

  @Schema(description = "농도/용도")
  String density,

  @Schema(description = "덕산")
  String deoksan,

  @Schema(description = "MSDS")
  String msds,

  @Schema(description = "관리 대장")
  Boolean isManagementRecord,

  @Schema(description = "비고")
  String note
) { }
