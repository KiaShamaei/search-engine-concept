package com.nasr.crawlersubscriber.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serial;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ETLData {


    private String id;
    private String title;
    private String body;
    private String url;
}
