package com.bytetrade.obridge.bean;

import lombok.*;
import lombok.experimental.Accessors;

import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import com.fasterxml.jackson.databind.annotation.JsonNaming;

@Data
@NoArgsConstructor
@JsonNaming(PropertyNamingStrategy.SnakeCaseStrategy.class)
@Accessors(chain = true)
public class PreBusiness {

    SwapAssetInformation swapAssetInformation;

    String hash;

    String lpSalt;

    String hashlockEvm;

    String hashlockXrp;

    String hashlockNear;

    Boolean locked;

    Long timestamp;

    String orderAppendData;

    Boolean isKyc;

    Boolean sameDid;

    KycInfo kycInfo;
}