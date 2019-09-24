package com.enjin.enjincoin.sdk.model.service.users;

import com.enjin.enjincoin.sdk.model.service.identities.Identity;
import com.enjin.enjincoin.sdk.model.service.roles.Role;
import com.google.gson.annotations.SerializedName;
import lombok.Getter;
import lombok.ToString;

import java.util.List;

/**
 * Represents a Trusted Platform user.
 *
 * @author Evan Lindsay
 * @see com.enjin.enjincoin.sdk.service.users.UsersService
 */
@Getter
@ToString
public class User {

    /**
     * The user id.
     *
     * @return the id.
     */
    private Integer id;

    /**
     * The user name.
     *
     * @return the name.
     */
    private String name;

    /**
     * The user email.
     *
     * @return the email.
     */
    private String email;

    /**
     * The users access tokens.
     *
     * @return the access tokens.
     */
    @SerializedName("access_tokens")
    private List<AccessToken> accessTokens;

    /**
     * The users roles.
     *
     * @return the roles.
     */
    private List<Role> roles;

    /**
     * The users identities.
     *
     * @return the identities.
     */
    private List<Identity> identities;

}
