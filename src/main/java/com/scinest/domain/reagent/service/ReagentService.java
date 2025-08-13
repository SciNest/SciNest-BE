package com.scinest.domain.reagent.service;

import com.scinest.domain.reagent.Reagent;
import com.scinest.domain.reagent.controller.request.CreateReagentRequest;
import com.scinest.domain.reagent.controller.request.UpdateReagentRequest;
import com.scinest.domain.reagent.controller.response.DetailReagentResponse;
import com.scinest.domain.reagent.controller.response.ListReagentResponse;
import com.scinest.domain.reagent.dto.ListReagentDto;
import com.scinest.domain.reagent.repository.JpaReagentRepository;
import com.scinest.global.api_response.exception.GeneralException;
import com.scinest.global.api_response.status.ErrorStatus;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

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

  public DetailReagentResponse detailReagent(long reagentId) {
    Reagent reagent = this.jpaReagentRepository.findById(reagentId)
      .orElseThrow(() -> new GeneralException(ErrorStatus.KEY_NOT_EXIST, "시약을 찾을 수 없습니다."));

    return DetailReagentResponse.builder()
      .reagentId(reagent.getReagentId())
      .reagentName(reagent.getReagentName())
      .englishName(reagent.getEnglishName())
      .chemicalFormula(reagent.getChemicalFormula())
      .classification(reagent.getClassification())
      .reagentCabinet(reagent.getReagentCabinet())
      .status(reagent.getStatus())
      .quantity(reagent.getQuantity())
      .density(reagent.getDensity())
      .deoksan(reagent.getDeoksan())
      .msds(reagent.getMsds())
      .isManagementRecord(reagent.getIsManagementRecord())
      .note(reagent.getNote())
      .build();
  }

  public ListReagentResponse reagentList() {
    List<Reagent> reagent = this.jpaReagentRepository.findAll();

    if (reagent.isEmpty()) {
      throw new GeneralException(ErrorStatus.KEY_NOT_EXIST, "시약이 비어있습니다.");
    }

    return ListReagentResponse.builder()
      .reagentList(
        reagent.stream()
          .map(r ->
            ListReagentDto.builder()
              .reagentId(r.getReagentId())
              .reagentName(r.getReagentName())
              .englishName(r.getEnglishName())
              .chemicalFormula(r.getChemicalFormula())
              .classification(r.getClassification())
              .reagentCabinet(r.getReagentCabinet())
              .status(r.getStatus())
              .quantity(r.getQuantity())
              .density(r.getDensity())
              .deoksan(r.getDeoksan())
              .msds(r.getMsds())
              .isManagementRecord(r.getIsManagementRecord())
              .note(r.getNote())
              .build()
          ).toList()
      )
      .build();
  }

  public void updateReagent(UpdateReagentRequest request) {
    Reagent reagent = this.jpaReagentRepository.findById(request.reagentId().longValue())
      .orElseThrow(() -> new GeneralException(ErrorStatus.KEY_NOT_EXIST, "시약을 찾을 수 없습니다."));
    reagent.update(request);
    this.jpaReagentRepository.save(reagent);
  }

  public void deleteReagent(long reagentId) {
    this.jpaReagentRepository.deleteById(reagentId);
  }
}
