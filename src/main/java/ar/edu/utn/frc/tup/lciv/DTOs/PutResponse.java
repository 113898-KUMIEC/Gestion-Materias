package ar.edu.utn.frc.tup.lciv.DTOs;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class PutResponse {
    private String legajo;
    private String materia;
    private String estado;
}
