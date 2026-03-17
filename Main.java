import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        int option;
        do {
            System.out.println("\n ----MENU----\n");
            System.out.println("1) Criar AudioVisualEquipment");
            System.out.println("2) Criar ComputingEquipment");
            System.out.println("3) Criar Laptop");
            System.out.println("4) Criar Desktop");
            System.out.println("5) Comparar dois equipamentos (mesmo tipo) usando equals()");
            System.out.println("0) Sair");
            option = scanner.nextInt();
            switch (option) {
                case 1 -> createAudioVisualEquipment();
                case 2 -> createComputingEquipment();
                case 3 -> createLaptop();
                case 4 -> createDesktop();
                case 5 -> compareEquipments();
                case 0 -> System.out.println("Adeus!");
                default -> System.out.println("Opção inválida!");
            }
        } while (option != 0);

    }

    public static AudioVisualEquipment createAudioVisualEquipment() {
        System.out.println("\n--- Criar AudioVisualEquipment ---");
        scanner.nextLine();
        System.out.print("ID: ");
        String id = scanner.nextLine();
        System.out.print("Nome: ");
        String name = scanner.nextLine();
        System.out.print("Preço diário: ");
        double price = scanner.nextDouble();  scanner.nextLine();
        System.out.print("Resolução: ");
        String res = scanner.nextLine();
        System.out.print("É Smart? (true/false): ");
        boolean smart = scanner.nextBoolean();  scanner.nextLine();

        AudioVisualEquipment av = new AudioVisualEquipment(id, name, price, res, smart);
        printEquipmentInfo(av);
        return av;
    }
    public static ComputingEquipment createComputingEquipment() {
        System.out.println("\n--- Criar ComputingEquipment ---");
        scanner.nextLine();
        System.out.print("ID: ");
        String id = scanner.nextLine();
        System.out.print("Nome: ");
        String name = scanner.nextLine();
        System.out.print("Preço diário: ");
        double price = scanner.nextDouble(); scanner.nextLine();
        System.out.print("Processador: ");
        String proc = scanner.nextLine();

        ComputingEquipment ce = new ComputingEquipment(id, name, price, proc);
        printEquipmentInfo(ce);
        return ce;
    }
    public static Laptop createLaptop() {
        System.out.println("\n--- Criar Laptop ---");
        scanner.nextLine();
        System.out.print("ID: ");
        String id = scanner.nextLine();
        System.out.print("Nome: ");
        String name = scanner.nextLine();
        System.out.print("Preço diário: ");
        double price = scanner.nextDouble(); scanner.nextLine();
        System.out.print("Processador: ");
        String proc = scanner.nextLine();
        System.out.print("Bateria (h): ");
        int bat = scanner.nextInt(); scanner.nextLine();
        System.out.print("Peso (Kg): ");
        double weight = scanner.nextDouble(); scanner.nextLine();

        Laptop l = new Laptop(id, name, price, proc, bat, weight);
        printEquipmentInfo(l);
        return l;

    }
    public static Desktop createDesktop() {
        System.out.println("\n--- Criar Desktop ---");
        scanner.nextLine();
        System.out.print("ID: ");
        String id = scanner.nextLine();
        System.out.print("Nome: ");
        String name = scanner.nextLine();
        System.out.print("Preço diário: ");
        double price = scanner.nextDouble(); scanner.nextLine();
        System.out.print("Processador: ");
        String proc = scanner.nextLine();

        Desktop d = new Desktop(id, name, price, proc);
        printEquipmentInfo(d);
        return d;
    }
    public static void compareEquipments() {
        System.out.println("\n --- Comparar dois AudioVisualEquipment ---");
        AudioVisualEquipment av1 = createAudioVisualEquipment();
        AudioVisualEquipment av2 = createAudioVisualEquipment();
        System.out.println("\nSão iguais? " + av1.equals(av2));
    }

    public static void printEquipmentInfo(Equipment e) {
        System.out.println("\n--- Equipamento criado ---");
        System.out.println(e.toString());
        System.out.println("Tipo: " + e.getEquipmentType());
        System.out.printf("Seguro: %.2f€\n", e.calculateInsurance());
    }



}