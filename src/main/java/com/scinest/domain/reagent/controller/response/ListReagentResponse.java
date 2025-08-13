package com.scinest.domain.reagent.controller.response;

import com.scinest.domain.reagent.dto.ListReagentDto;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.*;

import java.util.List;

@Getter
@ToString
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Schema(description = "시약 목록 조회 응답 객체")
public class ListReagentResponse {

  @Schema(description = "시약 목록")
  private List<ListReagentDto> reagentList;
}
