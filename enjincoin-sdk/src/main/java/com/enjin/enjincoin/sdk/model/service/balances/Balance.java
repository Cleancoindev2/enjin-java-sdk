package com.enjin.enjincoin.sdk.model.service.balances;

import com.enjin.enjincoin.sdk.model.service.tokens.Token;
import com.google.gson.annotations.SerializedName;
import lombok.Getter;
import lombok.ToString;

@Getter
@ToString
public class Balance {

    @SerializedName("ethereum_adddress")
    private String ethAddr;

    @SerializedName("token_id")
    private String tokenId;

    @SerializedName("token_index")
    private String tokenIndex;

    @SerializedName("identity_id")
    private Integer identityId;

    private Integer balance;

    private Token token;

}
