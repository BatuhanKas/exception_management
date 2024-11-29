package com.batuhankas.exception_management.dto;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class DtoEmployee {
    private int id;
    private String name;
    private DtoDepartment dtoDepartment = new DtoDepartment();
}
