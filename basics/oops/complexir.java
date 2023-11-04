import java.util.Scanner;

public class complexir {

  public static void main(String args[]) {
Complex a = new Complex(4, 5);
Complex b = new Complex(9, 4);

 Complex h = Complex.add(a, b);
  Complex f= Complex.subtract(a, b);
   Complex g = Complex.multiply(a, b);

  f.print();
  g.print();
h.print();
  }
}

class Complex {

  int real;
  int imaginary;

  public Complex(int r, int i) {
    real = r;
    imaginary = i;
  } /// or i can do this inhertiance

  public static Complex add(Complex a, Complex b) {
    return new Complex((a.real + b.real), (a.imaginary + b.imaginary));
  }

  public static Complex subtract(Complex a, Complex b) {
    return new Complex((a.real - b.real), (a.imaginary - b.imaginary));
  }

  public static Complex multiply(Complex a, Complex b) {
        int newReal = a.real * b.real - a.imaginary * b.imaginary;
        int newImaginary = a.real * b.imaginary + a.imaginary * b.real;
        return new Complex(newReal, newImaginary);
    }

  // these value will go to above to real and imaginary
  public void print() {
    if (real == 0 && imaginary != 0) {
      System.out.println(imaginary+"i");
    } else if (imaginary == 0 && real != 0) {
      System.out.println(real);
    } else {
      System.out.println(real + "+" + imaginary + "i");
    }
  }
}
