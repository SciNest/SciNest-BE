package com.scinest.domain.enum_api.controller.response;

import com.scinest.domain.enum_api.dto.EnumListDto;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.*;

import java.util.List;

@Getter
@ToString
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Schema(description = "Enum 목록 조회 응답 객체")
public class EnumListResponse {

  @Schema(description = "Enum 목록")
  private List<EnumListDto> enumList;
}
