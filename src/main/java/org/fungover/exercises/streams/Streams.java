package org.fungover.exercises.streams;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.TreeMap;
import java.util.stream.Collectors;

public class Streams {

    static void main() {
        System.out.println("===Exercise 2===");
        exercise2();
        System.out.println("===Exercise 3===");
        exercise3();
        System.out.println("===Exercise 4===");
        exercise4();
        System.out.println("===Exercise 5===");
        exercise5();
        System.out.println("===Exercise 6===");
        exercise6();
        System.out.println("===Exercise 7===");
        exercise7();
        System.out.println("===Exercise 8===");
        exercise8();
        System.out.println("===Exercise 9===");
        exercise9();
        System.out.println("===Exercise 10===");
        exercise10();
        System.out.println("===Exercise 11===");
        exercise11();
        System.out.println("===Exercise 12===");
        exercise12();
        System.out.println("===Exercise 13===");
        exercise13();
        System.out.println("===Exercise 14===");
        exercise14();
        System.out.println("===Exercise 15===");
        exercise15();
        System.out.println("===Exercise 16a===");
        exercise16a();
        System.out.println("===Exercise 16b===");
        exercise16b();
        System.out.println("===Exercise 17===");
        exercise17();


    }

    private static void exercise17() {
        getCountries().stream()
                .sorted(Comparator.comparing(country -> new StringBuilder(country.capital()).reverse().toString()))
                .map(Country::countryName)
                .forEach(System.out::println);
    }

    private static void exercise16b() {
        record NameAndDensity(String name, double density) {
            static NameAndDensity of(Country country) {
                return new NameAndDensity(country.countryName(), country.population() * 1_000_000 / country.area());
            }
        }
        getCountries().stream()
                .map(NameAndDensity::of)
                .sorted(Comparator.comparingDouble(NameAndDensity::density))
                .forEach(nd -> System.out.printf("%s with density %.2f%n", nd.name, nd.density));
    }

    private static void exercise16a() {
        record NameAndPopulation(String name, int population) {
            static NameAndPopulation of(Country country) {
                return new NameAndPopulation(country.countryName, (int) (country.population * 1_000_000));
            }
        }
        getCountries().stream()
                .map(NameAndPopulation::of)
                .forEach(System.out::println);
    }

    private static void exercise15() {
        var map = getCountries().stream()
                .collect(Collectors.groupingBy(
                        country -> Math.floor(country.population),
                        TreeMap::new,
                        Collectors.toList()
                ));
        presentCountryGrouping(map);
    }

    private static void presentCountryGrouping(TreeMap<Double, List<Country>> map) {
        map.forEach((population, countries) -> System.out.printf("""
                Länder med %.0f miljoner invånare
                %s
                """, population, countries.stream()
                .map(Country::countryName)
                .sorted()
                .collect(Collectors.joining("\n- ", "- ", ""))));
    }

    private static void exercise14() {
        var result = getCountries().stream()
                .collect(Collectors.groupingBy(
                        country -> country.countryName.substring(0, 1),
                        Collectors.counting()
                ));
        System.out.println(result.entrySet());
    }

    private static void exercise13() {
        getCountries().stream()
                .filter(country -> country.area() >= 500_000)
                .sorted(Comparator.comparing(Country::area).reversed())
                .limit(3)
                .map(country -> country.countryName() + "," + country.area())
                .forEach(System.out::println);
    }

    private static void exercise12() {
        getCountries().stream()
                .filter(country -> country.population() > 7.0)
                .sorted(Comparator.comparingDouble(Country::population))
                .limit(3)
                .map(Country::countryName)
                .forEach(System.out::println);
    }

    private static void exercise11() {
        getCountries().stream()
                .sorted(Comparator.comparingDouble(Country::population))
                .limit(5)
                .map(Country::countryName)
                .forEach(System.out::println);
    }

    private static void exercise10() {
        getCountries().stream().filter(country -> country.countryName().length() > country.capital().length()).map(Country::countryName).forEach(System.out::println);
    }

    private static void exercise9() {
        getCountries().stream()
                .filter(country -> country.countryName()
                        .charAt(0) == country.capital().charAt(0))
                .map(country -> country.countryName() + ", " + country.capital())
                .forEach(System.out::println);
        getCountries().stream()
                .filter(country -> country.countryName().startsWith(country.capital().substring(0, 1)))
                .map(country -> country.countryName() + ", " + country.capital())
                .forEach(System.out::println);
    }

    private static void exercise8() {
        var greaterThan10000 = getCountries().stream()
                .filter(country -> country.area > 10000)
                .count();
        var greaterThan100000 = getCountries().stream()
                .filter(country -> country.area > 100_000)
                .count();
        var greaterThan1000000 = getCountries().stream()
                .filter(country -> country.area > 1_000_000)
                .count();
        System.out.println(greaterThan10000 + " " + greaterThan100000 + " " + greaterThan1000000);

        int a = 0;
        int b = 0;
        int c = 0;
        for (var country : getCountries()) {
            if (country.area > 1_000_000) {
                a++;
                b++;
                c++;
            } else if (country.area > 100_000) {
                a++;
                b++;
            } else if (country.area > 10_000)
                a++;
        }
        System.out.println(a + " " + b + " " + c);

    }

    private static void exercise7() {
        IO.println(getCountries().stream()
                .filter(country -> country.population < 5)
                .map(Country::countryName)
                .collect(Collectors.joining(" ")));
    }

    private static void exercise6() {
        double meanArea = getCountries().stream()
                .mapToInt(Country::area)
                .average()
                .orElse(0.0);
        System.out.println(meanArea);

        var count = getCountries().stream()
                .filter(country -> country.area() < meanArea)
                .count();
        System.out.println(count);
    }

    private static void exercise5() {
        getCountries().stream()
                .map(Country::population)
                .max(Comparator.naturalOrder())
                .ifPresent(System.out::println);

        getCountries().stream()
                .mapToDouble(Country::population)
                .max()
                .ifPresent(System.out::println);

        getCountries().stream()
                .max(Comparator.comparing(Country::population))
                .map(country -> String.format("The largest population is %,.0f",
                        country.population * 1000000))
                .ifPresent(System.out::println);
    }

    private static void exercise4() {
        getCountries().stream()
                .sorted(Comparator.comparingDouble(Country::population).reversed())
                .map(Country::countryName)
                .forEach(System.out::println);
    }

    private static void exercise3() {
        //Print all country names sorted
        getCountries().stream()
                .map(Country::countryName)
                .sorted(Comparator.naturalOrder())
                .forEach(System.out::println);
    }

    private static void exercise2() {
        //First country name in list
        Optional<String> result = getCountries().stream()
                .map(Country::countryName)
                .findFirst();
        result.ifPresent(System.out::println);

        //Last country name in list
        //System.out.println(getCountries().getLast().countryName);
        var list = getCountries();
        //list.stream().skip(list.size()-1).map(Country::countryName).findFirst();
        list.stream()
                .map(Country::countryName)
                .reduce((a, b) -> b)
                .ifPresent(System.out::println);
    }


    private static List<Country> getCountries() {
        return List.of(
                new Country("Sverige", "Stockholm", 10.07, 450295),
                new Country("Norge", "Oslo", 5.27, 323802),
                new Country("Island", "Reykjavik", 0.33, 102775),
                new Country("Danmark", "Köpenhamn", 5.75, 42931),
                new Country("Finland", "Helsinki", 5.51, 338424),
                new Country("Belgien", "Bryssel", 11.30, 30528),
                new Country("Tyskland", "Berlin", 82.18, 357168),
                new Country("Frankrike", "Paris", 66.99, 640679),
                new Country("Storbritannien", "London", 60.80, 209331),
                new Country("Niue", "Alofi", 0.0016, 261),
                new Country("Mongoliet", "Ulan Batar", 3.08, 1566000),
                new Country("Polen", "Warszawa", 38.63, 312679),
                new Country("Spanien", "Madrid", 46.5, 505990),
                new Country("Portugal", "Lissabon", 10.31, 92212),
                new Country("Italien", "Rom", 60.59, 301338),
                new Country("Grekland", "Aten", 11.18, 131957),
                new Country("Luxemburg", "Luxemburg", 0.58, 2586),
                new Country("Liechtenstein", "Vaduz", 0.038, 160));
    }


    record Country(String countryName, String capital, double population, int area) {
    }
}
