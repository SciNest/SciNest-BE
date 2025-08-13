package com.scinest.domain.enum_api.service;

import com.scinest.domain.enum_api.controller.response.EnumListResponse;
import com.scinest.domain.enum_api.dto.EnumListDto;
import com.scinest.domain.reagent.enums.Classification;
import com.scinest.domain.reagent.enums.ReagentCabinet;
import com.scinest.domain.reagent.enums.Status;
import org.springframework.stereotype.Service;

import java.util.stream.Stream;

@Service
public class EnumService {

  public EnumListResponse classificationEnumList() {
    return EnumListResponse.builder()
      .enumList(
        Stream.of(Classification.values())
          .map(dto ->
            EnumListDto.builder()
              .code(dto.name())
              .value(dto.getValue())
              .build()
          ).toList()
      )
      .build();
  }

  public EnumListResponse reagentCabinetEnumList() {
    return EnumListResponse.builder()
      .enumList(
        Stream.of(ReagentCabinet.values())
          .map(dto ->
            EnumListDto.builder()
              .code(dto.name())
              .value(dto.getValue())
              .build()
          ).toList()
      )
      .build();
  }

  public EnumListResponse statusEnumList() {
    return EnumListResponse.builder()
      .enumList(
        Stream.of(Status.values())
          .map(dto ->
            EnumListDto.builder()
              .code(dto.name())
              .value(dto.getValue())
              .build()
          ).toList()
      )
      .build();
  }
}
