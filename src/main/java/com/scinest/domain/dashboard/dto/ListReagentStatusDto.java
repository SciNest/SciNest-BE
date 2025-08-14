package com.scinest.domain.dashboard.dto;

import com.scinest.domain.reagent.enums.Status;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.*;

@Getter
@ToString
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Schema(description = "시약 카테고리별 조회 응답 객체")
public class ListReagentStatusDto {

  @Schema(description = "시약 ID")
  private Long reagentId;

  @Schema(description = "시약명")
  private String reagentName;

  @Schema(description = "시약 상태")
  private Status status;
}
