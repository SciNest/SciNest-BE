package com.scinest.domain.reagent.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum ReagentCabinet {

  ACID("산"),
  BASE("염기"),
  INORGANIC1("무기1"),
  INORGANIC2("무기2"),
  ORGANIC("유기"),
  METAL("금속");

  private final String value;
}
