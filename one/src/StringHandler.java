import java.util.List;
import java.util.stream.IntStream;


public class StringHandler {
    private List<Long> answer;


    public void handleString(String newLine) {
        answer.add(sizeOfReductedLine(newLine));
    }

    private long sizeOfReductedLine(String newLine) {
        IntStream lineAsStream = newLine.chars();
        long result = lineAsStream.count();

        long countA = lineAsStream.filter(el -> el == 'a').count();
        long countB = lineAsStream.filter(el -> el == 'b').count();
        long countC = lineAsStream.filter(el -> el == 'c').count();

        if ((countA == 0 && countB == 0) ^ (countA == 0 && countC == 0) ^ (countC == 0 && countB == 0)) return result;
        if ((countA % 2 == 0) & (countB % 2 == 0) & (countC % 2 == 0)) return 2;
        else return 1;
    }

    public List<Long> getAnswer() {
        return answer;
    }

}
