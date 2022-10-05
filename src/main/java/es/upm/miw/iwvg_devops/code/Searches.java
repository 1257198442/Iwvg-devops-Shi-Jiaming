package es.upm.miw.iwvg_devops.code;

import java.util.stream.Stream;

public class Searches {
    public Double findFirstDecimalFractionByUserName(String name) {
        return new UsersDataBase().findAll()
                .filter(user -> name.equals(user.getName()))
                .flatMap(user -> user.getFractions().stream()
                .filter(fraction -> fraction.getNumerator() % fraction.getDenominator() != 0)
                )
                .findFirst()
                .get()
                .decimal();
    }
}
