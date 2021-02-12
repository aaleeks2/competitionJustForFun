package poligon.Konkurseł.src;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GeneratorId {
    public static void main(String[] args) {
        InteractionService interactionService = new InteractionService();
        Scanner scanner = new Scanner(System.in);
        ItEmployee yourDev = new ItEmployee();
        System.out.println(interactionService.getOWNER_GREETINGS());
        String reply = scanner.nextLine();
        if(!reply.equalsIgnoreCase("Tak")){
            if(reply.equalsIgnoreCase("Nie")) {
                System.out.println("Well, następnym razem.");
                scanner.close();
            } else {
                    System.out.println(interactionService.getHehe());
                    scanner.close();
            }
        } else {
            System.out.println(interactionService.getNAME_PLEASE());
            String name = scanner.nextLine();
            if(name.matches("[a-zA-Z]{2,15}")) {
                System.out.println(interactionService.getNameReply(name));
                yourDev.setName(name);
            } else {
                System.out.println("złe imie");
            }
            List<String> questions = interactionService.getQuestionsList();
            List<String> answers = new ArrayList<>();
            for(int i = 0; i < questions.size(); i++){
                System.out.println(questions.get(i));
                answers.add(scanner.nextLine());
            }
            System.out.println(interactionService.generateEmployee(yourDev, answers).toString());
            scanner.close();
        }
    }
}
