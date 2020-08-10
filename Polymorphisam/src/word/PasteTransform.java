package word;

public class PasteTransform extends CutTransform {

    @Override
    public void invokeOn(StringBuilder text, int startIndex, int endIndex) {
        if (startIndex == endIndex) {
            text = text.insert(startIndex, super.getLastCut());
        } else {
            text = text.replace(startIndex, endIndex - 1, super.getLastCut());
        }
        System.out.println(text.toString());
    }
}
