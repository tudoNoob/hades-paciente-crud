package io.tudonoob.patient.model;


import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.hibernate.validator.constraints.NotEmpty;

import javax.validation.constraints.NotNull;

@Getter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@EqualsAndHashCode
public class Address {

    @NotNull
    @NotEmpty
    private String street;
    @NotNull
    @NotEmpty
    private String number;
    @NotEmpty
    private String complement;

}
