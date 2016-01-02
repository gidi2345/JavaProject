
	public enum Operator
	{
	    ADDITION("+") {
	        @Override public int apply(int x1, int x2) {
	            return x1 + x2;
	        }
	    },
	    SUBTRACTION("-") {
	        @Override public int apply(int x1, int x2) {
	            return x1 - x2;
	        }
	    };
	    // You'd include other operators too...

	    private final String text;

	    private Operator(String text) {
	        this.text = text;
	    }

	    // Yes, enums *can* have abstract methods. This code compiles...
	    public abstract int apply(int x1, int x2);

	    @Override public String toString() {
	        return text;
	    }
	}


