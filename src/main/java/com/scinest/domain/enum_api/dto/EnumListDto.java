package com.scinest.domain.enum_api.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.*;

@Getter
@ToString
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Schema(description = "Enum 목록 조회 응답 Dto")
public class EnumListDto {

  @Schema(description = "Enum 코드")
  private String code;

  @Schema(description = "Enum 값")
  private String value;
}
