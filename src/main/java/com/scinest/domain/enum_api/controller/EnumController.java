package com.scinest.domain.enum_api.controller;

import com.scinest.domain.enum_api.controller.response.EnumListResponse;
import com.scinest.domain.enum_api.service.EnumService;
import com.scinest.global.api_response.ApiResponse;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/enum")
@RequiredArgsConstructor
@Tag(name = "ENUM(선택형 필드)", description = "Enum 관련 API")
public class EnumController {
  private final EnumService enumService;

  @GetMapping(value = "/classification")
  @Operation(summary = "분류 Enum")
  public ApiResponse<EnumListResponse> classificationEnumList() {
    return ApiResponse.onSuccess(enumService.classificationEnumList());
  }

  @GetMapping(value = "/reagent-cabinet")
  @Operation(summary = "시약장 Enum")
  public ApiResponse<EnumListResponse> reagentCabinetEnumList() {
    return ApiResponse.onSuccess(enumService.reagentCabinetEnumList());
  }

  @GetMapping(value = "/status")
  @Operation(summary = "상태 Enum")
  public ApiResponse<EnumListResponse> statusEnumList() {
    return ApiResponse.onSuccess(enumService.statusEnumList());
  }
}
