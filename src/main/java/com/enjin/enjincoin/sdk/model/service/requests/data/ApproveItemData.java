package com.enjin.enjincoin.sdk.model.service.requests.data;

import com.google.gson.annotations.SerializedName;
import lombok.Builder;

import java.math.BigInteger;

@Builder
public class ApproveItemData {

    private String operator;

    @SerializedName("operator_id")
    private BigInteger operatorId;

    @SerializedName("token_id")
    private String tokenId;

    @SerializedName("token_index")
    private String tokenIndex;

    @SerializedName("current_value")
    private Integer currentValue;

    private Integer value;

}
