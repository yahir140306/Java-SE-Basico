public class ActualizandoVariables {
    public static void main (String[] args) {
        int salary = 1000;

        // bono $200
        salary = salary + 200;
        System.out.println(salary);

        // pension: $50 descuento
        salary = salary - 50;
        System.out.println(salary);

        // 2 horas extra $30
        // comida: $45
        salary = salary + (2 * 30) - 45;
        System.out.println(salary);

        // Actualizando cadena de texto
        String employeeName = " Yahir ";
        employeeName = employeeName + " Isidro Cervantes";
        System.out.println(employeeName);

        employeeName = " Juanchis " + employeeName;
        System.out.println(employeeName);


    }
}
