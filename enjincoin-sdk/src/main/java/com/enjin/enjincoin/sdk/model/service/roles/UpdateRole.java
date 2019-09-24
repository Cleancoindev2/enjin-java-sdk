package com.enjin.enjincoin.sdk.model.service.roles;

import com.enjin.enjincoin.sdk.graphql.GraphQLRequest;

import java.util.Collection;

public class UpdateRole extends GraphQLRequest<UpdateRole> {

    public UpdateRole name(String name) {
        withParameter("name", name);
        return this;
    }

    public UpdateRole newName(String newName) {
        withParameter("new_name", newName);
        return this;
    }

    public UpdateRole permissions(String... permissions) {
        withParameter("permissions", permissions);
        return this;
    }

    public UpdateRole permissions(Collection<String> permissions) {
        withParameter("permissions", permissions);
        return this;
    }

}
