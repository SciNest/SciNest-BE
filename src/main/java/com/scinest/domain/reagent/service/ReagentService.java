package com.scinest.domain.reagent.service;

import com.scinest.domain.reagent.Reagent;
import com.scinest.domain.reagent.controller.request.CreateReagentRequest;
import com.scinest.domain.reagent.controller.request.UpdateReagentRequest;
import com.scinest.domain.reagent.repository.JpaReagentRepository;
import com.scinest.global.api_response.exception.GeneralException;
import com.scinest.global.api_response.status.ErrorStatus;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ReagentService {
  private final JpaReagentRepository jpaReagentRepository;

  public void createReagent(CreateReagentRequest request) {
    this.jpaReagentRepository.save(
      Reagent.builder()
        .reagentName(request.reagentName())
        .englishName(request.englishName())
        .chemicalFormula(request.chemicalFormula())
        .classification(request.classification())
        .reagentCabinet(request.reagentCabinet())
        .reagentCabinet(request.reagentCabinet())
        .status(request.status())
        .quantity(request.quantity())
        .density(request.density())
        .deoksan(request.deoksan())
        .msds(request.msds())
        .isManagementRecord(request.isManagementRecord())
        .note(request.note())
        .build()
    );
  }

  public void detailReagent(long reagentId) {

  }

  public void reagentList() {

  }

  public void updateReagent(UpdateReagentRequest request) {
    Reagent reagent = this.jpaReagentRepository.findById(request.reagentId().longValue())
      .orElseThrow(() -> new GeneralException(ErrorStatus.KEY_NOT_EXIST, "시약을 찾을 수 없습니다."));
    reagent.update(request);
    this.jpaReagentRepository.save(reagent);
  }

  public void deleteReagent(long reagentId) {

  }
}
