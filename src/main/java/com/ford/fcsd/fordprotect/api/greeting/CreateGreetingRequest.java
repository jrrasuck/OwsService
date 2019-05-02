package com.ford.fcsd.fordprotect.api.greeting;

import javax.validation.constraints.NotNull;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class CreateGreetingRequest {
    @NotNull String message;
    String authorName;
}
