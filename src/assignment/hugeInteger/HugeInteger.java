package assignment.hugeInteger;

public class HugeInteger {

    private final int[] digitArray;
    private static final int MAX_INT_SIZE = 40;


    public HugeInteger() {
        digitArray = new int[MAX_INT_SIZE];
    }

    public HugeInteger(String value) {
        this();
        this.parse(value);
    }

    public int getDigit(int digit) {
        return getIndex(MAX_INT_SIZE - digit);
    }

    public int getIndex(int index) {
        if ((index < MAX_INT_SIZE) && (index >= 0)) {
            return digitArray[index];
        } else {
            throw new IndexOutOfBoundsException("getIndex failed: index out of bounds");
        }
    }

    private void setDigit(int digit, int value) {
        setIndex((MAX_INT_SIZE - digit), value);
    }

    private void setIndex(int index, int value) {
        if ((index < MAX_INT_SIZE) && (index >= 0)) {
            if ((value < 10) && (value >= 0)) {
                digitArray[index] = value;
            } else {
                throw new IllegalArgumentException("setIndex failed: value should be an integer in the range 0-9.");
            }
        } else {
            throw new IndexOutOfBoundsException("setIndex failed: index out of bounds.");
        }
    }

    public void parse(String value) {
        if ((value.length() <= MAX_INT_SIZE) && (value.length() > 0)) {
            for (int counter = 1; counter <= value.length(); counter++) {
                int charDigit = value.length() - counter;
                if (Character.isDigit(value.charAt(charDigit))) {
                    setDigit(counter, Character.getNumericValue(value.charAt(charDigit)));
                } else {
                    throw new IllegalArgumentException("parse failed: value must consist of numeric characters only.");
                }
            }
        } else {
            throw new IllegalArgumentException("parse failed: value must contain " + MAX_INT_SIZE + " or fewer characters.");
        }
    }

    public void add(HugeInteger addend) {
        int sum;
        int carry = 0;

        for (int counter = 1; counter <= MAX_INT_SIZE; counter++) {
            sum = getDigit(counter) + addend.getDigit(counter) + carry;

            if (sum < 10) {
                setDigit(counter, sum);
                carry = 0;
            } else {
                setDigit(counter, (sum - 10));
                carry = 1;
            }
        }
        if (carry != 0) {
            throw new ArithmeticException("addition result is incorrect: an overflow occurred");
        }
    }


    public void subtract(HugeInteger subtrahend) {
        int difference;
        int borrow = 0;

        if (isGreaterThanOrEqualTo(subtrahend)) {
            for (int counter = 1; counter <= MAX_INT_SIZE; counter++) {
                difference = getDigit(counter) - subtrahend.getDigit(counter) - borrow;

                if (difference >= 0) {
                    setDigit(counter, difference);
                    borrow = 0;
                } else {
                    setDigit(counter, (difference + 10));
                    borrow = 1;
                }
            }
        } else {
            throw new ArithmeticException("subtraction failed: result would be negative");
        }
    }

    public boolean isZero() {
        for (int counter = 0; counter < MAX_INT_SIZE; counter++) {
            if (getIndex(counter) != 0) {
                return false;
            }
        }
        return true;
    }

    public boolean isEqualTo(HugeInteger argument) {
        for (int counter = 0; counter < MAX_INT_SIZE; counter++) {
            if (getIndex(counter) == argument.getIndex(counter)) {
                return true;
            }
        }
        return false;
    }


    public boolean isNotEqualTo(HugeInteger argument) {
        return !(isEqualTo(argument));
    }

    public boolean isGreaterThan(HugeInteger argument) {
        int counter = 0;
        while ((getIndex(counter) == argument.getIndex(counter)) && (counter < MAX_INT_SIZE)) {
            counter++;
        }
        if (counter == MAX_INT_SIZE) {
            return false;
        } else {
            return (getIndex(counter) > argument.getIndex(counter));
        }
    }

    public boolean isGreaterThanOrEqualTo(HugeInteger argument) {
        return (isEqualTo(argument) || isGreaterThan(argument));
    }

    public boolean isLessThan(HugeInteger argument) {
        int counter = 0;
        while ((getIndex(counter) == argument.getIndex(counter)) && (counter < MAX_INT_SIZE)) {
            counter++;
        }
        if (counter == MAX_INT_SIZE) {
            return false;
        } else {
            return (getIndex(counter) < argument.getIndex(counter));
        }
    }

    public boolean isLessThanOrEqualTo(HugeInteger argument) {
        return (isEqualTo(argument) || isLessThan(argument));
    }


    @Override
    public String toString() {
        StringBuilder stringValue = new StringBuilder(MAX_INT_SIZE);
        for (int counter = 0; counter < MAX_INT_SIZE; counter++) {
            stringValue.append(getIndex(counter));
        }
        return stringValue.toString();
    }
}

