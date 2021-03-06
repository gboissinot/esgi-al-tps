package fr.esgi.tp1607.use_cases.user.application;

import fr.esgi.tp1607.kernel.Command;
import fr.esgi.tp1607.use_cases.user.domain.Address;

/**
 * Command object
 */
@SuppressWarnings("all")
public final class CreateUser implements Command {

    public final String lastname;
    public final String firstname;
    public final Address address;

    public CreateUser(String lastname, String firstname, Address address) {
        this.lastname = lastname;
        this.firstname = firstname;
        this.address = address;
    }
}
