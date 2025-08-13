package com.scinest.domain.reagent.controller.response;

import com.scinest.domain.reagent.enums.Classification;
import com.scinest.domain.reagent.enums.ReagentCabinet;
import com.scinest.domain.reagent.enums.Status;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.*;

@Getter
@ToString
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Schema(description = "시약 상세 정보 조회 응답 객체")
public class DetailReagentResponse {

  @Schema(description = "시약 ID")
  private String reagentId;

  @Schema(description = "시약명")
  private String reagentName;

  @Schema(description = "영문명")
  private String englishName;

  @Schema(description = "화학식")
  private String chemicalFormula;

  @Schema(description = "분류")
  private Classification classification;

  @Schema(description = "상태")
  private Status status;

  @Schema(description = "시약장")
  private ReagentCabinet reagentCabinet;

  @Schema(description = "수량")
  private Integer quantity;

  @Schema(description = "농도/용도")
  private String density;

  @Schema(description = "덕산")
  private String deoksan;

  @Schema(description = "MSDS")
  private String msds;

  @Schema(description = "관리 대장")
  private Boolean isManagementRecord;

  @Schema(description = "비고")
  private String note;
}
