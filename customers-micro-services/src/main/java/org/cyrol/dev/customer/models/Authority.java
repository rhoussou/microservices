package org.cyrol.dev.customer.models;

import lombok.*;
import javax.persistence.*;

import org.cyrol.dev.security.domain.AuthorityName;

import java.util.Set;

@Getter
@Setter
@RequiredArgsConstructor
@Entity
public class Authority {

    @javax.persistence.Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @NonNull
    private AuthorityName name;

    @ManyToMany(mappedBy = "authorities",fetch = FetchType.LAZY)
    private Set<Customer> users;

}