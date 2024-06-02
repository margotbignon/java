package interfacefonctionnelle;

import java.util.Optional;

public class Optionals {
    public static void main(String[] args) {
        //Empty
        Optional<String> optionalEmpty = Optional.empty();

        //For value
        Optional<String> optionalOf = Optional.of("Bonjour");

        //For nulable
        Optional<String> optionalNulable = Optional.ofNullable("Touch");

        String defaultValue = optionalNulable.orElse("Default Value");
        System.out.println(defaultValue);
        if (optionalOf.isPresent()) System.out.println(optionalOf.get());


        Optional<String> optionalFilter = optionalOf.filter(s -> s.startsWith("Bon"));

        //map
        Optional<String> optionalmap = optionalOf.map(String::toUpperCase);

    }
}
