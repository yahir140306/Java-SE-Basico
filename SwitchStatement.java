public class SwitchStatement {
    public static void main(String[] args) {
    String colorModeSelected = "Dark";

    switch (colorModeSelected) {
        case "Light":
            System.out.println(" Seleccionastes Ligth Mode");
            break;
        case "Night":
            System.out.println("Seleccionastes Night Mode");
            break;
        case "Blue Dark":
            System.out.println("Seleccionastes Blue Mode");
            break;
        case "Dark":
            System.out.println("Seleccionastes Dark Mode");
            break;
        default:
            System.out.println("Seleccione una opcion");
        }
    }
}
