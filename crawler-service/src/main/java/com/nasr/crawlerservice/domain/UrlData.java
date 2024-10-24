package com.nasr.crawlerservice.domain;

import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class UrlData {

    @NotNull
    private String url;

    @NotNull
    private int depth;
}