package com.scinest.domain.dashboard.dto;

import com.scinest.domain.reagent.enums.Classification;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.*;

@Getter
@ToString
@Builder(toBuilder = true)
@NoArgsConstructor
@AllArgsConstructor
@Schema(description = "시약 카테고리별 조회 응답 객체")
public class ListReagentCategoryDto {

  @Schema(description = "분류")
  private Classification classification;

  @Schema(description = "이름")
  private String name;

  @Schema(description = "시약 수")
  private Long count;
}
