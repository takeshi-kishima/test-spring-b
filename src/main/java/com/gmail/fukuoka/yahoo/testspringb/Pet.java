
package com.gmail.fukuoka.yahoo.testspringb;

import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import lombok.AllArgsConstructor;
import lombok.Data;

@Generated("jsonschema2pojo")
@Data
@AllArgsConstructor
public class Pet {
    @SerializedName("type")
    @Expose
    private String type;
    @SerializedName("name")
    @Expose
    private String name;
}
