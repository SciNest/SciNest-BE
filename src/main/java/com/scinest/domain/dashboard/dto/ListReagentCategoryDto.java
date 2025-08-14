package com.scinest.domain.dashboard.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.*;

@Getter
@ToString
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Schema(description = "시약 카테고리별 조회 응답 객체")
public class ListReagentCategoryDto {

  @Schema(description = "시약 ID")
  private Long reagentId;

  @Schema(description = "시약명")
  private String reagentName;

  @Schema(description = "시약 수")
  private Integer count;
}
