package com.simformsolutions.grievance.dto.response;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ErrorResponse {

    private String status;
    private String message;
    private LocalDateTime timeStamp;
    private int code;
}