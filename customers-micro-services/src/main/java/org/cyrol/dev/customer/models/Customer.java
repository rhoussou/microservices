package org.cyrol.dev.customer.models;

import java.io.Serializable;
import java.util.Date;
import java.util.Set;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.validation.constraints.NotNull;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;


@Data
@NoArgsConstructor
@RequiredArgsConstructor
@Entity
public class Customer implements Serializable {

    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@javax.persistence.Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @NonNull
    @NotNull(message = "password can not be null.")
    private String username;

    @NonNull
    @NotNull(message = "first name can not be null.")
    private String password;

    @NonNull
    @NotNull(message = "first name can not be null.")
    private String firstname;

    @NonNull
    @NotNull(message = "last name can not be null.")
    private String lastname;

    @NonNull
    @NotNull(message = "email can not be null.")
    private String email;

    @NonNull
    @NotNull(message = "enabled can not be null.")
    protected Boolean enabled;

    @NonNull
    @NotNull(message = "last Password Reset Date can not be null.")
    protected Date lastPasswordResetDate;

    @NonNull
    @NotNull(message = "authorities can not be null.")
    @ManyToMany(fetch = FetchType.EAGER)
    @JoinTable(
            name = "USER_AUTHORITY",
            joinColumns = {@JoinColumn(name = "USER_ID", referencedColumnName = "ID")},
            inverseJoinColumns = {@JoinColumn(name = "AUTHORITY_ID", referencedColumnName = "ID")})
    protected Set<Authority> authorities;

}
