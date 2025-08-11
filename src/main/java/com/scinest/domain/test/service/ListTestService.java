package com.scinest.domain.test.service;

import com.scinest.domain.test.controller.response.ListTestResponse;
import com.scinest.domain.test.repository.ListTestRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ListTestService {

  private final ListTestRepository listTestRepository;

  /**
   * 테스트 목록 조회
   */
  public ListTestResponse getTestList() {
    return ListTestResponse.builder()
      .testList(listTestRepository.getTestList())
      .build();
  }
}
