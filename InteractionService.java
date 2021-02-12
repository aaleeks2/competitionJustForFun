package poligon.Konkurseł;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class InteractionService {

    public InteractionService() {
    }

    private final String OWNER_GREETINGS = "Witaj Użytkowniku, pragnę powitać Cię w moim programie generującym." + "\n"
            + "By wyrazić gotowość do rozpoczęcia generowania, napisz \"Tak\", jeśli nie jesteś gotów, napisz \"Nie\".";

    private final String NAME_PLEASE = "Podaj imię dewelopera.";

    private final String hehe =
            "░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░\n" +
            "░░░░█████████░░█████████░░░░░░░░░░░\n" +
            "░░░░░░░░░░░░█░░█░░░░░░░██░░░░░░░░░░\n" +
            "░░░░░░░░░░░░█░░█░░░░░░░░█░░░░░░░░░░\n" +
            "░░░░░░░░░░░░█░░█░░░░░░░░██░░░░░░░░░\n" +
            "░░░░░░░░░░░░█░░█░░░░░░░░░██░░░░░░░░\n" +
            "░░░░░░░░░░░░█░░█░░░░░░░░░░█░░░░░░░░\n" +
            "░░░░░░░░░░░░█░░█░░░░░░░░░░█░░░░░░░░\n" +
            "░░░░█░░░░░░░█░░█░░░░░░░░░░█░░░░░░░░\n" +
            "░░░░█░░░░░░██░░█░░░░░░░░███░░░░░░░░\n" +
            "░░░░█░░░░██░░░░█░░░░░░███░░░░░░░░░░\n" +
            "░░░░██████░░░░░████████░░░░░░░░░░░░\n" +
            "░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░\n";

    public String getHehe() {
        return hehe;
    }

    public String getNameReply(String name){
        return "Dobrze "+name+", zaczynajmy. Zadam Ci teraz kilka pytań.";
    }

    private final String QUESTION_1 = "I. W skali od 1(nie lubisz) do 10(jest to twoja pasja) oceń, na ile lubisz programować.";
    private final String QUESTION_2 = "II. W skali od 1(nigdy) do 10(za każdym razem jak koduję) oceń, jak często korzystasz z rozwiązań ze Stack Overflow.";
    private final String QUESTION_3 = "III. Czytasz JAWA(1) czy DŻAWA(2)? Wpisz odpowiednią cyfrę.";
    private final String QUESTION_4 = "IV. Czy na spotkaniach ze Scrum Masterem rysujesz penisy na whiteboardzie(1), czy nie(2)?";
    private final String QUESTION_5 = "V. Na jakim systemie operacyjnym pracujesz? Windows(1), Linux(2), MacOS(3)";
    private final String QUESTION_6 = "VI. Jak myślisz, mam pomysł na kolejne sensowne pytania? Tak(1)/Nie(2)";
    private final String QUESTION_7 = "VII. Czy wygram ten konkurs, bo doceniasz moją pracę nad tym krindżem? Tak(1)/Nie(2)";

    public String getOWNER_GREETINGS() {
        return OWNER_GREETINGS;
    }

    public String getNAME_PLEASE() {
        return NAME_PLEASE;
    }

    public List<String> getQuestionsList(){
        return Arrays.asList(QUESTION_1, QUESTION_2, QUESTION_3, QUESTION_4, QUESTION_5, QUESTION_6, QUESTION_7);
    }

    private int questionPoints1;
    private void setQuestionPoints1(int answer){
        if(0 <=answer && answer<3){
            questionPoints1 = 1;
        } else if(3<=answer && answer<6){
            questionPoints1 = 2;
        } else if(6<=answer && answer<9){
            questionPoints1 = 3;
        } else {
            questionPoints1 = 4;
        }
    }
    private int questionPoints2;
    private void setQuestionPoints2(int answer){
        if(0 <=answer && answer<3){
            questionPoints2 = 4;
        } else if(3<=answer && answer<6){
            questionPoints2 = 3;
        } else if(6<=answer && answer<9){
            questionPoints2 = 2;
        } else {
            questionPoints2 = 1;
        }
    }
    private int questionPoints3;
    private void setQuestionPoints3(int answer){
        if(answer == 1){
            questionPoints3 = 1;
        } else if(answer == 2){
            questionPoints3 = 2;
        }
    }
    private int questionPoints4;
    private void setQuestionPoints4(int answer){
        if(answer == 1){
            questionPoints4 = 2;
        } else {
            questionPoints4 = 1;
        }
    }
    private int questionPoints5;
    private void setQuestionPoints5(int answer){
        if(answer == 1){
            questionPoints5 = 8;
        }else if(answer == 2) {
            questionPoints5 = 10;
        } else if(answer == 3){
            questionPoints5 = 10;
        }
    }
    private int questionPoints6;
    private void setQuestionPoints6(int answer){
        if(answer == 1){
            questionPoints6 = 0;
        } else if(answer == 2){
            questionPoints6 = 1;
        }
    }
    private int questionPoints7;
    private void setQuestionPoints7(int answer){
        if(answer == 1){
            questionPoints7 = 1;
        } else if(answer == 2){
            questionPoints7 = 0;
        }
    }

    public ItEmployee generateEmployee(ItEmployee employee, List<String> answers){
        List<Integer> parsedAnswers = answers.stream()
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        setQuestionPoints1(parsedAnswers.get(0));
        setQuestionPoints2(parsedAnswers.get(1));
        setQuestionPoints3(parsedAnswers.get(2));
        setQuestionPoints4(parsedAnswers.get(3));
        setQuestionPoints5(parsedAnswers.get(4));
        setQuestionPoints6(parsedAnswers.get(5));
        setQuestionPoints7(parsedAnswers.get(6));

        String tomaszewBlessing = "";
        if(questionPoints3 == 1){
            tomaszewBlessing = ", Tomaszew mu błogosławi";
        }

        double score1 = (Math.pow(((double) questionPoints1 + questionPoints2), questionPoints3)/questionPoints4) + questionPoints5;
        double finalScore = 0;
        if(questionPoints6 == 0 && questionPoints7 == 0){
            if(score1 <= 16){
                finalScore = score1+10;
            }else if(score1 > 16){
                finalScore = score1+5;
            }
        }
        else if(questionPoints6 == 0 && questionPoints7 == 1){
            if(score1 <= 16){
                finalScore = score1+15;
            }else if(score1 > 16){
                finalScore = score1+7.5;
            }
        } else if(questionPoints6 == 1 && questionPoints7 == 0){
            if(score1 <= 16){
                finalScore = score1+11;
            }else if(score1 > 16){
                finalScore = score1+5.5;
            }
        } else if(questionPoints6 == 1 && questionPoints7 == 1){
            if(score1 <= 16){
                finalScore = score1+30;
            }else if(score1 > 16){
                finalScore = score1+15;
            }
        }

        if(finalScore >= 21 && finalScore < 51){
            employee.setProgrammingLanguage("HTML");
            employee.setJob("Junior HTML Developer");
            employee.setCompany("HTMLtoNIEjezyk S.A.");
            employee.setHobby("stepowanie i jedzenie bigosu na czas");
            employee.setFeatures("płaczu na zawołanie i palenia papierosów nosem");
            employee.setTomaszewBlessing(tomaszewBlessing);
        } else if(finalScore>=51 && finalScore < 80){
            employee.setProgrammingLanguage("C++");
            employee.setJob("Mid Software Developer");
            employee.setFeatures("obgryzania paznokci na czas i odporności na pierdolenie seniora");
            employee.setCompany("M-0-BBing S.A.");
            employee.setHobby("granie w komputer i ogladanie komedii Adama Sandlera");
            employee.setTomaszewBlessing(tomaszewBlessing);
        }else if(finalScore>=80 && finalScore < 105){
            employee.setProgrammingLanguage("JAVA");
            employee.setJob("Senior Fullstack najlepszy Dev Ever <333");
            employee.setFeatures("wiecznego RiGCzu i widzenia w ciemonści");
            employee.setCompany("JestesKozak.exe S.A.");
            employee.setHobby("wygrywanie i pieniędzowanie");
            employee.setTomaszewBlessing(tomaszewBlessing);
        }

        return employee;
    }
}
