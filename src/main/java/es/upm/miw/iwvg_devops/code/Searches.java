package es.upm.miw.iwvg_devops.code;

import java.util.Comparator;
import java.util.Optional;
import java.util.stream.Stream;

public class Searches {
    public Double findFirstDecimalFractionByUserName(String name) {
        Optional<Fraction> optional = new UsersDataBase().findAll()
                .filter(user -> name.equals(user.getName()))
                .flatMap(user -> user.getFractions().stream()
                        .filter(fraction -> fraction.getNumerator() % fraction.getDenominator() != 0)
                )
                .findFirst();
                if(optional.isPresent()){
                    return optional.get().decimal();
                }else  return null;


    }
    public Stream<String>  findUserIdBySomeProperFraction(int fractionDenominator) {
        return new UsersDataBase().findAll()
                .filter(user -> user.getFractions().stream().anyMatch(fraction -> fraction.getNumerator()<fraction.getDenominator()))
                .map(User::getId);
    }
    public Stream<Double> findDecimalFractionByUserName(String name) {
        return new UsersDataBase().findAll()
                .filter(user->name.equals(user.getName()))
                .flatMap(user -> user.getFractions().stream())
                .map(Fraction::decimal);
    }
    public Stream<String> findUserFamilyNameByAllNegativeSignFractionDistinct() {
        return new UsersDataBase().findAll()
                .filter(user -> user.getFractions()
                .stream()
                .allMatch(fraction -> fraction.getNumerator() < 0 ^ fraction.getDenominator() < 0))
                .map(User::getFamilyName)
                .distinct();
    }
}
