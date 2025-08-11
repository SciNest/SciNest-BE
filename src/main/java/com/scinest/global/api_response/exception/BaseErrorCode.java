package com.scinest.global.api_response.exception;

import com.scinest.global.api_response.dto.ApiDto;

public interface BaseErrorCode {
  ApiDto getReasonHttpStatus();
}
