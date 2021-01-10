public class EnglandProgram {
    public static void main(String[] args) {
        // Drużyna 1
        System.out.println("---------- England  1 ----------");
        England e1 = new England();
        char[] teamName = {'F', 'c', ' ', 'L', 'i', 'v', 'e', 'r', 'p', 'o', 'o','l'};
        e1.teamName = teamName;
        e1.value = 999.9;
        e1.position = 1;
        e1.averageNumberOfGoals = 2.67;
        e1.yearOfBirthOfTheBestPlayer = 1987;
        char[] theNameOfTheBestPlayer = {'M', 'o', 'h', 'a', 'm', 'e', 'd', ' ', 'S', 'a', 'l', 'a', 'h'};
        e1.theNameOfTheBestPlayer = theNameOfTheBestPlayer;

        System.out.print("Team name: ");
        for(char c : e1.teamName) {
            System.out.print(c);
        }

        System.out.println();
        System.out.println("Value: "+e1.value);
        System.out.println("Position: "+e1.position);
        System.out.println("Average number of goals: "+e1.averageNumberOfGoals);
        System.out.println("Year of birth of the best player: "+e1.yearOfBirthOfTheBestPlayer);

        System.out.print("The name of the best player: ");
        for(char c : e1.theNameOfTheBestPlayer) {
            System.out.print(c);
        }


        // Drużyna 2
        System.out.println();
        System.out.println("---------- England  2 ----------");
        System.out.println();

        England e2 = new England();
        char[] teamName1 = {'M', 'a', 'n', 'c', 'h', 'e', 's', 't', 'e', 'r', ' ','U', 'n', 'i','t', 'e', 'd'};
        e2.teamName = teamName1;
        e2.value = 687.87;
        e2.position = 4;
        e2.averageNumberOfGoals = 1.73;
        e2.yearOfBirthOfTheBestPlayer = 1992;
        char[] theNameOfTheBestPlayer1 = {'M', 'a', 'r', 'c', 'u', 's', ' ', 'R', 'a', 's', 'c', 'h', 'w', 'o', 'r', 'd'};
        e2.theNameOfTheBestPlayer = theNameOfTheBestPlayer1;

        System.out.print("Team name: ");
        for(char c : e2.teamName) {
            System.out.print(c);
        }

        System.out.println();
        System.out.println("Value: "+e2.value);
        System.out.println("Position: "+e2.position);
        System.out.println("Average number of goals: "+e2.averageNumberOfGoals);
        System.out.println("Year of birth of the best player: "+e2.yearOfBirthOfTheBestPlayer);

        System.out.print("The name of the best player: ");
        for(char c : e2.theNameOfTheBestPlayer) {
            System.out.print(c);
        }

        // przypisanie drużyn do tablicy

        England[] englands = new England[2];
        englands[0] = e1;
        englands[1] = e2;
        System.out.println();
        System.out.println("---------- Englands - foreach ----------");
        for(England england : englands) {
            System.out.print("Team name: ");
            for (char c : england.teamName) {
                System.out.print(c);
            }
            System.out.println();
            System.out.println("Value: " + england.value);
            System.out.println("Position: " + england.position);
            System.out.println("Average number of goals: " + england.averageNumberOfGoals);
            System.out.println("Year of birth of the best palyer: " + england.yearOfBirthOfTheBestPlayer);
            System.out.print("The name of the best player: ");
            for (char c : england.theNameOfTheBestPlayer) {
                System.out.print(c);

            }
            System.out.println();
        }
    }
}
