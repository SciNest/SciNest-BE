package com.scinest.domain.dashboard.service;

import com.scinest.domain.dashboard.controller.response.ListReagentCabinetResponse;
import com.scinest.domain.dashboard.controller.response.ListReagentCategoryResponse;
import com.scinest.domain.dashboard.controller.response.ListReagentStatusResponse;
import com.scinest.domain.dashboard.dto.ListReagentCabinetDto;
import com.scinest.domain.dashboard.dto.ListReagentCategoryDto;
import com.scinest.domain.dashboard.dto.ListReagentStatusDto;
import com.scinest.domain.reagent.repository.ReagentRepository;
import com.scinest.global.api_response.exception.GeneralException;
import com.scinest.global.api_response.status.ErrorStatus;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class DashboardService {
  private final ReagentRepository reagentRepository;

  public ListReagentCategoryResponse reagentCategory() {
    List<ListReagentCategoryDto> response = new ArrayList<>();
    List<ListReagentCategoryDto> dto = this.reagentRepository.reagentCategory();

    if (dto.isEmpty()) {
      throw new GeneralException(ErrorStatus.KEY_NOT_EXIST, "시약을 찾을 수 없습니다.");
    }

    dto.forEach(r ->
      response.add(
        ListReagentCategoryDto.builder()
          .classification(r.getClassification())
          .name(r.getClassification().getValue())
          .count(r.getCount())
          .build()
      )
    );

    return ListReagentCategoryResponse.builder()
      .reagentList(response)
      .build();
  }

  public ListReagentCabinetResponse reagentCabinet() {
    List<ListReagentCabinetDto> response = new ArrayList<>();
    List<ListReagentCabinetDto> dto = this.reagentRepository.reagentCabinet();

    if (dto.isEmpty()) {
      throw new GeneralException(ErrorStatus.KEY_NOT_EXIST, "시약을 찾을 수 없습니다.");
    }

    dto.forEach(r ->
      response.add(
        ListReagentCabinetDto.builder()
          .cabinet(r.getCabinet())
          .name(r.getCabinet().getValue())
          .count(r.getCount())
          .build()
      )
    );

    return ListReagentCabinetResponse.builder()
      .reagentList(response)
      .build();
  }

  public ListReagentStatusResponse reagentStatus() {
    List<ListReagentStatusDto> response = new ArrayList<>();
    List<ListReagentStatusDto> dto = this.reagentRepository.reagentStatus();

    if (dto.isEmpty()) {
      throw new GeneralException(ErrorStatus.KEY_NOT_EXIST, "시약을 찾을 수 없습니다.");
    }

    dto.forEach(r ->
      response.add(
        ListReagentStatusDto.builder()
          .status(r.getStatus())
          .name(r.getStatus().getValue())
          .count(r.getCount())
          .build()
      )
    );

    return ListReagentStatusResponse.builder()
      .reagentList(response)
      .build();
  }
}
