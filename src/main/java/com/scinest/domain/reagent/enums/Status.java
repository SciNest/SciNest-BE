package com.scinest.domain.reagent.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum Status {

  SOLID("s"),
  AQUEOUS("aq"),
  LIQUID("l"),
  GAS("g");

  private final String value;
}
