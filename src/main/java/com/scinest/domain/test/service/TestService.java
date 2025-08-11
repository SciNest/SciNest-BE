package com.scinest.domain.test.service;

import com.scinest.domain.test.controller.request.CreateTestRequest;
import com.scinest.domain.test.controller.response.DetailTestResponse;
import com.scinest.domain.test.controller.response.ListTestResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class TestService {

  private final CreateTestService createTestService;
  private final DetailTestService detailTestService;
  private final ListTestService listTestService;

  public void createTest(CreateTestRequest request) {
    createTestService.createTest(request);
  }

  public DetailTestResponse getTest(Long testId) {
    return detailTestService.getTest(testId);
  }

  public ListTestResponse getTestList() {
    return listTestService.getTestList();
  }
}
