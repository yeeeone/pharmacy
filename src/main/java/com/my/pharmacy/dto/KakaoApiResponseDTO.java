package com.my.pharmacy.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.ToString;

import java.util.List;

@Getter
@ToString
public class KakaoApiResponseDTO {
    @JsonProperty("meta")
    private MetaDTO metaDTO;
    @JsonProperty("documents")
    private List<DocumentDTO> documentList;
}
