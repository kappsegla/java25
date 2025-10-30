package org.fungover.exercises.regexp;

import java.util.regex.MatchResult;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regexp {
    static void main() {
        exercise10b();
    }


    static void exercise1() {
        String s = "kat";
        Pattern p = Pattern.compile(s);
        Matcher m = p.matcher("min katt har tre konkatenerade kanter");
        System.out.println(m.find());
//        System.out.println(m.results().findAny().isPresent());

    }

    static void exercise2() {
        String s = "kat|kon|kan";
//String s = "k(at|an|on)";
//        String s = "ka[tn]|kon";
//        String s = "k[ao][tn]";  //Matches kot also... not in the approved list of words
//        String s = "k(?!ot)[ao][tn]";  //Negative lookahead (?! ) Don't include in the matchresult group
        Pattern p = Pattern.compile(s);
        Matcher m = p.matcher("min katt har tre konkatenerade kanter");
        m.results()
                .peek(mr -> System.out.println(">" + mr.start() + ":" + mr.end()))  //Prints start and end pos of match
                .map(MatchResult::group)  //The matched sequence
                .forEach(System.out::println);
    }

    static void exercise3() {
        String s = "a[a-zåäö]";
        Pattern p = Pattern.compile(s);
        Matcher m = p.matcher("min katt har tre konkatenerade kanter");
        m.results()
                .peek(mr -> System.out.println(">" + mr.start() + ":" + mr.end()))  //Prints start and end pos of match
                .map(MatchResult::group)  //The matched sequence
                .forEach(System.out::println);
    }

    private static void exercise4() {
        String s = "(?<!t)t(?!t)";
        Pattern p = Pattern.compile(s);
        Matcher m = p.matcher("min katt har tre konkatenerade kanter");
        m.results()
                .peek(mr -> System.out.println(">" + mr.start() + ":" + mr.end()))  //Prints start and end pos of match
                .map(MatchResult::group)  //The matched sequence
                .forEach(System.out::println);
    }

    private static void exercise5() {
        String s = "as|od";
        Pattern p = Pattern.compile(s);
        Matcher m = p.matcher("hands jumbled terrific old-fashioned grass highfalutin stupendous daughter feigned skirt modern truthful");
        m.results()
                .peek(mr -> System.out.println(">" + mr.start() + ":" + mr.end()))  //Prints start and end pos of match
                .map(MatchResult::group)  //The matched sequence
                .forEach(System.out::println);
    }

    private static void exercise6() {
        String s = "[ae][nds]";
        Pattern p = Pattern.compile(s);
        Matcher m = p.matcher("hands jumbled terrific old-fashioned grass highfalutin stupendous daughter feigned skirt modern truthful");
        m.results()
                .peek(mr -> System.out.println(">" + mr.start() + ":" + mr.end()))  //Prints start and end pos of match
                .map(MatchResult::group)  //The matched sequence
                .forEach(System.out::println);
    }

    private static void exercise7() {
        String s = "\\b[dh][a-z]+";
        Pattern p = Pattern.compile(s);
        Matcher m = p.matcher("hands jumbled terrific old-fashioned grass highfalutin stupendous daughter feigned skirt modern truthful");
        m.results()
                .peek(mr -> System.out.println(">" + mr.start() + ":" + mr.end()))  //Prints start and end pos of match
                .map(MatchResult::group)  //The matched sequence
                .forEach(System.out::println);
        System.out.println("==========");
        s = "[a-z]+s\\b";
        p = Pattern.compile(s);
        m = p.matcher("hands jumbled terrific old-fashioned grass highfalutin stupendous daughter feigned skirt modern truthful");
        m.results()
                .peek(mr -> System.out.println(">" + mr.start() + ":" + mr.end()))  //Prints start and end pos of match
                .map(MatchResult::group)  //The matched sequence
                .forEach(System.out::println);
    }

    private static void exercise8() {

        var p = Pattern.compile("(?<!-)\\b\\w[aeiouyåäö]\\w*\\b");
        var m = p.matcher("hands jumbled terrific old-fashioned grass highfalutin stupendous daughter feigned skirt modern truthful");
        m.results()
                .peek(mr -> System.out.println(">" + mr.start() + ":" + mr.end()))  //Prints start and end pos of match
                .map(MatchResult::group)  //The matched sequence
                .forEach(System.out::println);
    }

    private static void exercise9() {
        var p = Pattern.compile("(\\w)\\1");
        var m = p.matcher("hands jumbled terrific old-fashioned grass highfalutin stupendous daughter feigned skirt modern truthful");
        m.results()
                .peek(mr -> System.out.println(">" + mr.start() + ":" + mr.end()))  //Prints start and end pos of match
                .map(MatchResult::group)  //The matched sequence
                .forEach(System.out::println);
    }

    private static void exercise10() {
        var p = Pattern.compile("(\\w{3})(?=.*\\1)");
        var m = p.matcher("hands jumbled terrific old-fashioned grass highfalutin stupendous daughter feigned skirt modern truthful");
        m.results()
                .peek(mr -> System.out.println(">" + mr.start() + ":" + mr.end()))  //Prints start and end pos of match
                .map(mr -> mr.group(0))  //The matched sequence
                .forEach(System.out::println);
    }

    private static void exercise10b() {
        var p = Pattern.compile("<(\\w+)>(.*?)</\\1>");
        var m = p.matcher("<div>Första</div><div>Andra</div>");
        m.results()
                .peek(mr -> System.out.println(">" + mr.start() + ":" + mr.end()))  //Prints start and end pos of match
                .map(mr -> mr.group(2))  //The matched sequence
                .forEach(System.out::println);
    }


}
