package com.example.fedex_backend.models.program;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class CpuDTO {

  private String name;
  private Double cpuUsage;
}
