
package com.gmail.fukuoka.yahoo.testspringb;

import java.util.List;
import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import lombok.AllArgsConstructor;
import lombok.Data;

@Generated("jsonschema2pojo")
@Data
@AllArgsConstructor
public class Person {
    @SerializedName("firstName")
    @Expose
    private String firstName;
    @SerializedName("lastName")
    @Expose
    private String lastName;
    @SerializedName("address")
    @Expose
    private String address;
    @SerializedName("pets")
    @Expose
    private List<Pet> pets = null;
}
