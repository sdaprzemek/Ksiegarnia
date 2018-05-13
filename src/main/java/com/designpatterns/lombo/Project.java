package com.designpatterns.lombo;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.ToString;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@AllArgsConstructor
@Builder
@Getter
@ToString
class Project {

    private String name;

    private LocalDateTime deadLine;

    private String author;

    private BigDecimal budget;

    private String company;

    private boolean closed;


}
