package com.scinest.domain.dashboard.controller;

import com.scinest.domain.dashboard.controller.response.ListReagentCabinetResponse;
import com.scinest.domain.dashboard.controller.response.ListReagentCategoryResponse;
import com.scinest.domain.dashboard.controller.response.ListReagentStatusResponse;
import com.scinest.domain.dashboard.service.DashboardService;
import com.scinest.global.api_response.ApiResponse;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/dashboard")
@RequiredArgsConstructor
@Tag(name = "Dashboard", description = "대시보드 관련 API")
public class DashboardController {
  private final DashboardService dashboardService;

  @GetMapping(value = "/category")
  @Operation(summary = "시약 카테고리별 목록 조회")
  public ApiResponse<ListReagentCategoryResponse> reagentCategory() {
    return ApiResponse.onSuccess(this.dashboardService.reagentCategory());
  }

  @GetMapping(value = "/cabinet")
  @Operation(summary = "시약장별 목록 조회")
  public ApiResponse<ListReagentCabinetResponse> reagentCabinet() {
    return ApiResponse.onSuccess(this.dashboardService.reagentCabinet());
  }
  @GetMapping(value = "/status")
  @Operation(summary = "시약 상태별 목록 조회")
  public ApiResponse<ListReagentStatusResponse> reagentStatus() {
    return ApiResponse.onSuccess(this.dashboardService.reagentStatus());
  }

}
