package com.scinest.domain.test.controller;

import com.scinest.domain.test.controller.request.CreateTestRequest;
import com.scinest.domain.test.controller.response.DetailTestResponse;
import com.scinest.domain.test.controller.response.ListTestResponse;
import com.scinest.domain.test.service.TestService;
import com.scinest.global.api_response.ApiResponse;
import io.swagger.v3.oas.annotations.Hidden;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

/**
 * Controller 애노테이션은 아래 네 개로 고정하겠습니다.
 * ex) @RequestMapping("/member"), @Tag(name = "Member", description = "회원 관련 API")
 */

@Hidden
@RestController
@RequestMapping("/test")
@RequiredArgsConstructor
@Tag(name = "Test", description = "테스트 관련 API")
public class TestController {
  private final TestService testService;

  /**
   * Controller부터 Repository까지 연결된 메서드는 이름을 통일해주세요!
   * 앞으로 유지보수하기 편할 것 같습니다.
   *
   * 요청 Dto, 응답 Dto도 이름 형식을 맞춰주세요.
   * 생성 관련 : CreateXXXRequest
   * 상세 조회 관련 : getXXX
   * 목록 조회 관련 : getXXXList
   */
  @PostMapping
  @Operation(summary = "테스트 생성")
  public ApiResponse<Void> createTest(@RequestBody @Valid CreateTestRequest request) {
    testService.createTest(request);
    return ApiResponse.onSuccess();
  }

  @GetMapping("/{testId}")
  @Operation(summary = "테스트 상세 조회")
  public ApiResponse<DetailTestResponse> getTest(
    /*
     * @PathVariable 뒤 ("")에 명시를 안 해주면 swagger가 인식을 못 합니다!
     */
    @PathVariable("testId") Long testId
  ) {
    return ApiResponse.onSuccess(testService.getTest(testId));
  }

  @GetMapping
  @Operation(summary = "테스트 목록 조회")
  public ApiResponse<ListTestResponse> getTestList() {
    return ApiResponse.onSuccess(testService.getTestList());
  }
}
