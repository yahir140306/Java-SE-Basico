public class MathematicOperations {
    public static void main(String[] args) {
        double x = 2;
        double y = 3;

        System.out.println(Math.PI);
        System.out.println(Math.E);

        // devuelve un entero hacia arriba
        System.out.println(Math.ceil(x));

        // devuelve un entero hacia abajo
        System.out.println(Math.floor(x));

        // devuelve un numero elevado a otro numero
        System.out.println(Math.pow(x,y));

        // devuelve el numero mayor
        System.out.println(Math.max(x,y));

        // devuelve la raiz cuadrada
        System.out.println(Math.sqrt(y));

        // area de un circulo
        // pi * r2
        System.out.println(Math.PI* Math.pow(y,2));

        // area de una esfera
        // 4 * pi * r2
        System.out.println(4 * Math.PI * Math.pow(y,2));

        // volumen de una esfera
        // (4/3) * pi * r3
        System.out.println((4/3) * Math.PI * Math.pow(y,3));
    }
}
