public class Calculator{
    private int num1;
    private int num2;
    private char op;
    private float res;

    Calculator() {
        this.num1 = 0;
        this.num2 = 0;
        this.op = ' ';
    }

    Calculator(int n1, int n2, char opr) {
        this.num1 = n1;
        this.num2 = n2;
        this.op = opr;
        this.res = calculate();
    }

    float calculate() {
        switch (this.op) {
            case '+':
                return this.num1 + this.num2;
            case '-':
                return this.num1 - this.num2;
            case '*':
                return this.num1 * this.num2;
            case '/':
                return this.num1 / this.num2;
            default:
                return -1;
        }
    }
    float getResult() {
        return this.res;
    }
}

