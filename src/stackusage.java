import java.util.Scanner;

public class stackusage {
    public static Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {
        stack stack = new stack();
        System.out.println("equation?");
        String question = scan.nextLine();
        String[] split = question.split(" ");
        for (int i = 0; i < split.length; i++) {
            if (split[i].equals("+")) {
                int pop1 = stack.pop();
                int pop2 = stack.pop();
                int addSave = pop1 + pop2;
                stack.push(addSave);
            }
            else if (split[i].equals("-")) {
                int pop1 = stack.pop();
                int pop2 = stack.pop();
                int subSave = pop1 - pop2;
                stack.push(subSave);
            }
            else if (split[i].equals("*")) {
                int pop1 = stack.pop();
                int pop2 = stack.pop();
                int multiSave = pop1 * pop2;
                stack.push(multiSave);
            }
            else if (split[i].equals("/")) {
                int pop1 = stack.pop();
                int pop2 = stack.pop();
                int divSave = pop1 / pop2;
                stack.push(divSave);
            }
            else {
                stack.push(Integer.parseInt(split[i]));
            }
        }
        System.out.println(stack.peek());
    }
}
