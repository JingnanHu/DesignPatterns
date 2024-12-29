public class InterpreterPatternDemo {
    public static Expression getMaleExpression(){
        Expression John = new TerminalExpression("John");
        Expression Axel = new TerminalExpression("Axel");
        return new OrExpression(John, Axel);
    }
    public static Expression getCatName(){
        Expression meow = new TerminalExpression("meow");
        Expression cat = new TerminalExpression("cat");
        return new AndExpression(meow, cat);
    }
    public static void main(String[] args) {
        Expression isMale = getMaleExpression();
        Expression isCatName = getCatName();
        System.out.println("John is a male? " + isMale.interpret("John"));
        System.out.println("meow is a cat? " + isCatName.interpret("meow cat"));
    }
}
