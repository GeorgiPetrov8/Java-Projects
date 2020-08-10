package allProblems.Telephony;

import java.util.List;

public class Smartphone implements Callable, Browsable {
    private List<String> numbers;
    private List<String> urls;

    public Smartphone(List<String> numbers, List<String> urls) {
        this.numbers = numbers;
        this.urls = urls;
    }

    @Override
    public String call() {
        StringBuilder builder = new StringBuilder();
        for (String number : numbers) {
            String result = "";
            for (int i = 0; i < number.length(); i++) {
                if (!Character.isDigit(number.charAt(i))) {
                    result = "Invalid number!";
                    break;
                }
            }

            if (result.isEmpty()) {
                builder.append("Calling... ").append(number).append(System.lineSeparator());
            } else {
                builder.append(result).append(System.lineSeparator());
            }

        }
        return builder.toString();
    }

    @Override
    public String browse() {
        StringBuilder builder = new StringBuilder();
        for (String url : urls) {
            String result = "";
            for (int i = 0; i < url.length() ; i++) {
                if (Character.isDigit(url.charAt(i))) {
                    result = "Invalid URL!";
                    break;
                }
            }

            if (result.isEmpty()) {
                builder.append("Browsing: ").append(url).append("!").append(System.lineSeparator());
            } else {
                builder.append(result).append(System.lineSeparator());
            }

        }

        return builder.toString();
    }

}
