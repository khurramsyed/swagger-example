package com.leanmentors.api;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@ApiModel
@AllArgsConstructor
public class User {

    @ApiModelProperty
    private String userName;

    @ApiModelProperty
    private String firstName;

    @ApiModelProperty
    private String lastName;
}
