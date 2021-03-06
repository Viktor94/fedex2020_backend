package com.example.fedex_backend.models.dtos;

import com.example.fedex_backend.models.student.StudentDTO;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class MUDTO {

  private StudentDTO studentDTO;
  private Integer cursorTravelDistance;
  private Integer buttonsPressed;
  private Integer scrollWheelActivity;
}
