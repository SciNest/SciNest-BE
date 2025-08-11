package com.scinest.domain.test.service;

import com.scinest.domain.test.Test;
import com.scinest.domain.test.controller.request.CreateTestRequest;
import com.scinest.domain.test.repository.TestRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
@Transactional
public class CreateTestService {

  private final TestRepository testRepository;

  /**
   * 테스트 생성
   */
  public void createTest(CreateTestRequest request) {
    this.testRepository.save(
      Test.builder()
        .title(request.title())
        .content(request.content())
        .build()
    );
  }
}
