import java.util.ArrayList;
import java.util.List;


public class StringHandler {
    private List<Long> answer = new ArrayList<>();


    public void handleString(String newLine) {
        answer.add(sizeOfReductedLine(newLine));
    }

    private long sizeOfReductedLine(String newLine) {
        long result = newLine.chars().count();

        long countA = newLine.chars().filter(el -> el == 'a').count();
        long countB = newLine.chars().filter(el -> el == 'b').count();
        long countC = newLine.chars().filter(el -> el == 'c').count();

        if ((countA == 0 && countB == 0) ^ (countA == 0 && countC == 0) ^ (countC == 0 && countB == 0)) return result;
        if ((countA % 2 == 0) & (countB % 2 == 0) & (countC % 2 == 0)) return 2;
        else return 1;
    }

    public List<Long> getAnswer() {
        return answer;
    }

}
