package com.ford.fcsd.fordprotect.api.hello;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class HelloResponseWithoutBaseBody {

	String greeting;

}
