package com.ford.fcsd.fordprotect.api.greeting;

import java.time.ZonedDateTime;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class GreetingApi {
    Long id;
    String message;
    String authorName;
    ZonedDateTime created;
}
