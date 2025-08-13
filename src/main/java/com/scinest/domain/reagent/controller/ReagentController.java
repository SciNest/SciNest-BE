package com.scinest.domain.reagent.controller;

import com.scinest.domain.reagent.service.ReagentService;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/reagent")
@RequiredArgsConstructor
@Tag(name = "Reagent", description = "시약 관련 API")
public class ReagentController {
  private final ReagentService reagentService;


}
