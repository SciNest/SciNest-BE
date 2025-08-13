package com.scinest.domain.reagent;

import com.scinest.domain.reagent.enums.Classification;
import com.scinest.domain.reagent.enums.ReagentCabinet;
import com.scinest.domain.reagent.enums.Status;
import com.scinest.global.domain.BaseTimeEntity;
import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.Comment;

@Entity
@Getter
@Builder
@ToString
@AllArgsConstructor
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Table(name = "reagent")
public class Reagent extends BaseTimeEntity {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Comment(value = "시약 ID")
  @Column(name = "reagent_id")
  private Long reagentId;

  @Comment(value = "시약명")
  @Column(name = "reagent_name", nullable = false)
  private String reagentName;

  @Comment(value = "영문명")
  @Column(name = "english_name")
  private String englishName;

  @Comment(value = "화학식")
  @Column(name = "chemical_formula", nullable = false)
  private String chemicalFormula;

  @Enumerated(EnumType.STRING)
  @Comment(value = "분류")
  @Column(name = "classification", nullable = false)
  private Classification classification;

  @Enumerated(EnumType.STRING)
  @Comment(value = "상태")
  @Column(name = "status", nullable = false)
  private Status status;

  @Enumerated(EnumType.STRING)
  @Comment(value = "시약장")
  @Column(name = "reagent_cabinet", nullable = false)
  private ReagentCabinet reagentCabinet;

  @Comment(value = "수량")
  @Column(name = "quantity", nullable = false)
  private Integer quantity;

  @Comment(value = "농도/용도")
  @Column(name = "density", nullable = false)
  private String density;

  @Comment(value = "덕산")
  @Column(name = "deoksan", nullable = false)
  private String deoksan;

  @Comment(value = "MSDS")
  @Column(name = "msds", nullable = false)
  private String msds;

  @Comment(value = "관리 대장")
  @Column(name = "is_management_record", nullable = false)
  private Boolean isManagementRecord;

  @Comment(value = "비고")
  @Column(name = "note", nullable = false)
  private String note;
}
