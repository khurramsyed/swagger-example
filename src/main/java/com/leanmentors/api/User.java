package com.leanmentors.api;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
@ApiModel
public class User {

    @ApiModelProperty(notes = "userName of the user", required = true)
    private String userName;

    @ApiModelProperty(notes ="given name of the user")
    private String firstName;

    @ApiModelProperty(notes = "surName of the user")
    private String lastName;
}
