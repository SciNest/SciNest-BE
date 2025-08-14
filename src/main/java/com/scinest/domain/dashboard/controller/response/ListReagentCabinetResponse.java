package com.scinest.domain.dashboard.controller.response;

import com.scinest.domain.dashboard.dto.ListReagentCabinetDto;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.*;

import java.util.List;

@Getter
@ToString
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Schema(description = "시약 카테고리별 목록 조회 응답 객체")
public class ListReagentCabinetResponse {

  @Schema(description = "시약 목록")
  private List<ListReagentCabinetDto> reagentList;
}
