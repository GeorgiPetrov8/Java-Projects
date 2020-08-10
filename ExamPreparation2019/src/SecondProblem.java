import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SecondProblem {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String regex = "^([A-Z]{1}[a-z\\' ]+):([A-Z ]+)\\b";
        Pattern pattern = Pattern.compile(regex);

        String artistAndSong = scan.nextLine();
        while (!artistAndSong.equals("end")) {

            Matcher matcher = pattern.matcher(artistAndSong);

            if (matcher.find()) {
                String validArtist = matcher.group(1);
                String validSong = matcher.group(2);

                StringBuilder encryptedArtist = new StringBuilder();
                int count = validArtist.length();
                for (int i = 0; i < validArtist.length(); i++) {
                    char currentChar = validArtist.charAt(i);
                    char resultOne = (char) (currentChar + count);
                    if (currentChar == ' ' || currentChar == '\'') {
                        encryptedArtist.append(currentChar);
                        continue;
                    } else if (resultOne > 122) {
                        resultOne = (char) (resultOne - 26);
                    }
                    encryptedArtist.append(resultOne);

                }


                StringBuilder encryptedSong = new StringBuilder();
                for (int i = 0; i < validSong.length(); i++) {
                    char currentChar = validSong.charAt(i);
                    char resultTwo = (char) (currentChar + count);
                    if (currentChar == ' ' || currentChar == '\'') {
                        encryptedSong.append(currentChar);
                        continue;
                    } else if (resultTwo > 90) {
                        resultTwo = (char) (resultTwo - 26);
                    }
                    encryptedSong.append(resultTwo);

                }


                System.out.println(String.format("Successful encryption: %s@%s", encryptedArtist, encryptedSong));

            } else {
                System.out.println("Invalid input!");
            }

            artistAndSong = scan.nextLine();
        }

    }
}
//Working! 100/100!!!
