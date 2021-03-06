package fr.esgi.tp11;

import fr.esgi.tp11.kernel.Engine;

import java.util.function.Predicate;

@Engine
public class ValidationAddressEngine implements Predicate<Address> {

    private static final ValidationAddressEngine INSTANCE = new ValidationAddressEngine();

    private ValidationAddressEngine() {
    }

    public static ValidationAddressEngine getInstance() {
        return INSTANCE;
    }

    @Override
    public boolean test(Address address) {
        return true;
    }
}
