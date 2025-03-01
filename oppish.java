import java.util.Scanner;

public class Oppish {
    static Scanner userinput = new Scanner(System.in);
    public  static  void main(String[] args) {
        String startWord;
        int a = 0;
        int e = 0;
        int i;
        int o = 0;
        int u = 0;
        int y = 0;
        int locationA = 0;
        int locationE = 0;
        int locationI = 0;
        int locationO = 0;
        int locationU = 0;
        int locationY = 0;

        System.out.println("What word would you like translated to Oppish?");
        startWord = userinput.nextLine();
        String lastLetter = startWord.substring(startWord.length()-1);
        startWord = startWord.toLowerCase();


        for (i = 0; i < startWord.length(); i++) {
            a++;
            e++;
            o++;
            u++;
            y++;

            if (startWord.charAt(i) =='a' && i > 0){
                locationA = a;
            }

            if (startWord.charAt(i) == 'e'&& i > 0) {
                locationE = e;
            }

            if(startWord.charAt(i) == 'i'){
                locationI = i;
            }

            if(startWord.charAt(i) == 'o'){
                locationO = o;
            }

            if(startWord.charAt(i) == 'u'){
                locationU = u;
            }

            if(startWord.charAt(i) == 'y'){
                locationY = y;
            }
        }
        StringBuilder newWord = new StringBuilder(startWord);
        if(locationA >0 && !lastLetter.equals("a")){
            newWord.insert(locationA,"opp");
        }
        if(locationE>0 && !lastLetter.equals("e")){
            newWord.insert(locationE, "opp");
        }
        if(locationI>0 && !lastLetter.equals("i")){
            newWord.insert(locationI, "opp");
        }
        if(locationO>0 && !lastLetter.equals("o")){
            newWord.insert(locationO, "opp");
        }
        if(locationU>0 && !lastLetter.equals("u")){
            newWord.insert(locationU, "opp");
        }
        if(locationY>0 && !lastLetter.equals("y")){
            newWord.insert(locationY, "opp");
        }
        System.out.println(newWord);


    }
}
