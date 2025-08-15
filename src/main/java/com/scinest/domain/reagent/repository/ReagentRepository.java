package com.scinest.domain.reagent.repository;

import com.querydsl.core.types.Projections;
import com.querydsl.jpa.impl.JPAQueryFactory;
import com.scinest.domain.dashboard.dto.ListReagentCabinetDto;
import com.scinest.domain.dashboard.dto.ListReagentCategoryDto;
import com.scinest.domain.dashboard.dto.ListReagentStatusDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.List;

import static com.scinest.domain.reagent.QReagent.reagent;

@Repository
@RequiredArgsConstructor
public class ReagentRepository {
  private final JPAQueryFactory queryFactory;

  public List<ListReagentCategoryDto> reagentCategory() {
    return this.queryFactory.select(
      Projections.fields(
        ListReagentCategoryDto.class,
        reagent.classification,
        reagent.reagentId.count().as("count")
      )
    )
    .from(reagent)
    .groupBy(reagent.classification, reagent.reagentName)
    .fetch();
  }

  public List<ListReagentCabinetDto> reagentCabinet() {
    return this.queryFactory.select(
        Projections.fields(
          ListReagentCabinetDto.class,
          reagent.reagentCabinet.as("cabinet"),
          reagent.reagentId.count().as("count")
        )
      )
      .from(reagent)
      .groupBy(reagent.reagentCabinet)
      .fetch();
  }

  public List<ListReagentStatusDto> reagentStatus() {
    return this.queryFactory.select(
        Projections.fields(
          ListReagentStatusDto.class,
          reagent.status,
          reagent.reagentId.count().as("count")
        )
      )
      .from(reagent)
      .groupBy(reagent.status)
      .fetch();
  }
}
