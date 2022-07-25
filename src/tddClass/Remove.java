package tddClass;

public class Remove {

    public String replace(String text) {
        StringBuilder ret= new StringBuilder();
        String captureGroup ="-_";
        for (int i = 0; i < text.length(); i++) {
            if (!captureGroup.contains(String.valueOf(text.charAt(i)))) {
                ret.append(text.charAt(i));
            }else{
                ret.append(Character.toUpperCase(text.charAt(i+1)));
                i++;
            }
        }
        return ret.toString();
    }
}