package com.scinest.domain.reagent.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum Status {

  SOLID("고체(s)"),
  AQUEOUS("수용액(aq)"),
  LIQUID("액체(l)"),
  GAS("기체(g)");

  private final String value;
}
