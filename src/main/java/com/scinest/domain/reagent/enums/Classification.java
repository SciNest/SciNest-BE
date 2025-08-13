package com.scinest.domain.reagent.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum Classification {

  ACID("산"),
  BASE("염기"),
  INORGANIC("무기 화합물"),
  ORGANIC("유기 화합물"),
  OXIDIZERS("산환제"),
  SOLVENTS("용매"),
  SALTS("염류");

  private final String value;
}
