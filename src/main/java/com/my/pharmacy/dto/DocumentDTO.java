package com.my.pharmacy.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.ToString;
import org.springframework.beans.factory.annotation.Value;

@Getter
@ToString
public class DocumentDTO {
    // 약국 이름
    @JsonProperty("place_name")
    private String placeName;
    //주소명
    @JsonProperty("address_name")
    private String addressName;
    //경도
    @JsonProperty("x")
    private double longitude;
    //위도
    @JsonProperty("y")
    private double latitude;
    //거리
    @JsonProperty("distance")
    private double distance;
}
