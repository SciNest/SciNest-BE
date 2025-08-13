package com.scinest.domain.reagent.controller;

import com.scinest.domain.reagent.controller.request.CreateReagentRequest;
import com.scinest.domain.reagent.controller.request.UpdateReagentRequest;
import com.scinest.domain.reagent.service.ReagentService;
import com.scinest.global.api_response.ApiResponse;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/reagent")
@RequiredArgsConstructor
@Tag(name = "Reagent", description = "시약 관련 API")
public class ReagentController {
  private final ReagentService reagentService;

  @PostMapping(value = "/create")
  @Operation(summary = "시약 생성 API")
  public ApiResponse<Void> createReagent(final @RequestBody CreateReagentRequest request) {
    this.reagentService.createReagent(request);
    return ApiResponse.onSuccess();
  }

  @GetMapping(value = "/detail/{id}")
  @Operation(summary = "시약 조회 API")
  public ApiResponse<Void> detailReagent(@PathVariable("id") Long reagentId) {
    return ApiResponse.onSuccess();
  }

  @GetMapping(value = "/list")
  @Operation(summary = "시약 목록 조회 API")
  public ApiResponse<Void> reagentList() {
    return ApiResponse.onSuccess();
  }

  @PatchMapping(value = "/update")
  @Operation(summary = "시약 수정 API")
  public ApiResponse<Void> updateReagent(final @RequestBody UpdateReagentRequest request) {
    this.reagentService.updateReagent(request);
    return ApiResponse.onSuccess();
  }

  @DeleteMapping(value = "/delete/{id}")
  @Operation(summary = "시약 삭제 API")
  public ApiResponse<Void> deleteReagent(@PathVariable("id") Long reagentId) {
    return ApiResponse.onSuccess();
  }
}
