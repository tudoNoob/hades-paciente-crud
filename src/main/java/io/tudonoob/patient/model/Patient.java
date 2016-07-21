package io.tudonoob.patient.model;


import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.validation.Valid;
import java.util.List;

@Getter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@EqualsAndHashCode
public class Patient {

    @Valid
    private List<Address> addressList;

    @Valid
    private List<PhoneNumber> phoneNumbers;

}
