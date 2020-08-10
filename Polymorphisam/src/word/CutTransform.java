package word;

public class CutTransform implements TextTransform {
    private String lastCut;
    private String newText;
    @Override
    public void invokeOn(StringBuilder text, int startIndex, int endIndex) {
        if (startIndex == endIndex) {
            this.lastCut = "";
        } else {
            lastCut = text.substring(startIndex, endIndex - 1);
            this.newText = text.toString().replace(lastCut,"");
        }
    }

    public String getLastCut() {
        return lastCut;
    }

    public String getNewText() {
        return newText;
    }
}
