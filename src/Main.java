import java.util.Scanner;

// TODO Убрать многократное обращение к Сканеру, поменять диапазон наоборот, обработать исклбючения в Integer.parseInt, while (!"11".equals(s)) заменил бы на while (true)

public class Main {

    private final static Scanner scanner = new Scanner(System.in);

    private static void pressEnterToContinue(){
        System.out.println("Нажмите Enter, чтобы продолжить...");
        try
        {
            System.in.read();
            scanner.nextLine();
        }
        catch(Exception e)
        {}
    }

        public static void main(String[] args) {
        System.out.println("Эта программа определяет необходимые мероприятия при измерении ширины коллеи стрелочного перевода.\nВыберите необходмое измерение в соответствии с контекстным меню:");

        int x = 0;
        String s ="";


        while (!"11".equals(s)){
            System.out.println("\n1. Ширина коллеи в приемном стыке");
            System.out.println("2. Ширина коллеи у острия остряков");
            System.out.println("3. Ширина коллеи в корне остряка по боковому направлянию");
            System.out.println("4. Ширина коллеи в корне остряка по прямому направлянию");
            System.out.println("5. Ширина коллеи в переводной кривой");
            System.out.println("6. Ширина коллеи в переднем вылете крестовины");
            System.out.println("7. Ширина коллеи в крестовине по боковому направлянию");
            System.out.println("8. Ширина коллеи в крестовине по прямому направлянию");
            System.out.println("9. Ширина коллеи в хвосте крестовины по боковому направлянию");
            System.out.println("10. Ширина коллеи в хвосте крестовины по прямому направлянию");
            System.out.println("11. Вторая страница");
            System.out.println("12. Выход из приложения");
            s = scanner.next();

            // походу дублирует ответ ниже
            try {
                x = Integer.parseInt(s);
            } catch (NumberFormatException e){
                System.out.println("Неверный значение");
            }

            switch (x){
                case 1 -> Main.vPriemnomStike();
                case 2 -> Main.uOstriyaOstryakov();
                case 3 -> Main.vKorneOstryakaNaBok();
                case 4 -> Main.vKorneOstryakaPryamo();
                case 5 -> Main.vPerevodnoyKrivoy();
                case 6 -> Main.vPerednemVileteKrestovini();
                case 7 -> Main.vKristovineNaBok();
                case 8 -> Main.vKristovinePryamo();
                case 9 -> Main.vHvosteKristoviniNaBok();
                case 10 -> Main.vHvosteKristoviniPryamo();
                case 11 -> secondNenu();
                case 12 -> {
                    System.out.println("До свидания!");
                    System.exit(0);
                }
                default -> System.out.println("Неверное значение");
            }
            Main.pressEnterToContinue();
        }

    }

    public static void vPriemnomStike() {

        System.out.println("\nВведите ширину коллеи в приемном стыке в милиметрах: ");
        int vPriemnomStike = Integer.parseInt(scanner.next());
        if (vPriemnomStike >= 1518 && vPriemnomStike <= 1524) {
            System.out.println("Ширина коллеи " + vPriemnomStike + " мм в приемном стыке в нормативе.");
        } else if (vPriemnomStike >= 1512 && vPriemnomStike <= 1548) {
            System.out.println("Ширина коллеи " + vPriemnomStike + " мм в приемном стыке ТРЕБУЕТ РЕГУЛИРОВКИ.");
        } else {
            System.out.println("Ширина коллеи " + vPriemnomStike + " мм в приемном стыке ТРЕБУЕТ ЗААКРЫТИЯ ДЛЯ ДВИЖЕНИЯ!");
        }
    }

    public static void uOstriyaOstryakov() {

        System.out.println("\nВведите ширину коллеи у острия остряков в милиметрах: ");
        int uOstriyaOstryakov = Integer.parseInt(scanner.next());
        if (uOstriyaOstryakov >= 1522 && uOstriyaOstryakov <= 1528) {
            System.out.println("Ширина коллеи " + uOstriyaOstryakov + " мм у острия остряков в нормативе.");
        } else if (uOstriyaOstryakov >= 1512 && uOstriyaOstryakov <= 1548) {
            System.out.println("Ширина коллеи " + uOstriyaOstryakov + " мм у острия остряков ТРЕБУЕТ РЕГУЛИРОВКИ.");
        } else {
            System.out.println("Ширина коллеи " + uOstriyaOstryakov + " мм у острия остряков ТРЕБУЕТ ЗААКРЫТИЯ ДЛЯ ДВИЖЕНИЯ!");
        }
    }

    public static void vKorneOstryakaNaBok() {
        System.out.println("\nВведите ширину коллеи в корне остряка по боковому направлянию в милиметрах: ");
        int vKorneOstryakaNaBok = Integer.parseInt(scanner.next());
        if (vKorneOstryakaNaBok >= 1518 && vKorneOstryakaNaBok <= 1524) {
            System.out.println("Ширина коллеи " + vKorneOstryakaNaBok + " мм в корне остряка по боковому направлянию в нормативе.");
        } else if (vKorneOstryakaNaBok >= 1512 && vKorneOstryakaNaBok <= 1548) {
            System.out.println("Ширина коллеи " + vKorneOstryakaNaBok + " мм в корне остряка по боковому направлянию ТРЕБУЕТ РЕГУЛИРОВКИ.");
        } else {
            System.out.println("Ширина коллеи " + vKorneOstryakaNaBok + " мм в корне остряка по боковому направлянию ТРЕБУЕТ ЗААКРЫТИЯ ДЛЯ ДВИЖЕНИЯ!");
        }
    }

    public static void vKorneOstryakaPryamo() {
        System.out.println("\nВведите ширину коллеи в корне остряка по прямому направлянию в милиметрах: ");
        int vKorneOstryakaPryamo = Integer.parseInt(scanner.next());
        if (vKorneOstryakaPryamo >= 1519 && vKorneOstryakaPryamo <= 1525) {
            System.out.println("Ширина коллеи " + vKorneOstryakaPryamo + " мм в корне остряка по прямому направлянию в нормативе.");
        } else if (vKorneOstryakaPryamo >= 1512 && vKorneOstryakaPryamo <= 1548) {
            System.out.println("Ширина коллеи " + vKorneOstryakaPryamo + " мм в корне остряка по прямому направлянию ТРЕБУЕТ РЕГУЛИРОВКИ.");
        } else {
            System.out.println("Ширина коллеи " + vKorneOstryakaPryamo + " мм в корне остряка по прямому направлянию ТРЕБУЕТ ЗААКРЫТИЯ ДЛЯ ДВИЖЕНИЯ!");
        }
    }

    public static void vPerevodnoyKrivoy() {
        System.out.println("\nВведите ширину коллеи в переводной кривой в милиметрах: ");
        int vPerevodnoyKrivoy = Integer.parseInt(scanner.next());
        if (vPerevodnoyKrivoy >= 1518 && vPerevodnoyKrivoy <= 1530) {
            System.out.println("Ширина коллеи " + vPerevodnoyKrivoy + " мм в переводной кривой в нормативе.");
        } else if (vPerevodnoyKrivoy >= 1512 && vPerevodnoyKrivoy <= 1548) {
            System.out.println("Ширина коллеи " + vPerevodnoyKrivoy + " мм в переводной кривой ТРЕБУЕТ РЕГУЛИРОВКИ.");
        } else {
            System.out.println("Ширина коллеи " + vPerevodnoyKrivoy + " мм в переводной кривой ТРЕБУЕТ ЗААКРЫТИЯ ДЛЯ ДВИЖЕНИЯ!");
        }
    }

    public static void vPerednemVileteKrestovini() {
        System.out.println("\nВведите ширину коллеи в переднем вылете крестовины в милиметрах: ");
        int vPerednemVileteKrestovini = Integer.parseInt(scanner.next());
        if (vPerednemVileteKrestovini >= 1517 && vPerednemVileteKrestovini <= 1523) {
            System.out.println("Ширина коллеи " + vPerednemVileteKrestovini + " мм в переднем вылете крестовины в нормативе.");
        } else if (vPerednemVileteKrestovini >= 1512 && vPerednemVileteKrestovini <= 1548) {
            System.out.println("Ширина коллеи " + vPerednemVileteKrestovini + " мм в переднем вылете крестовины ТРЕБУЕТ РЕГУЛИРОВКИ.");
        } else {
            System.out.println("Ширина коллеи " + vPerednemVileteKrestovini + " мм в переднем вылете крестовины ТРЕБУЕТ ЗААКРЫТИЯ ДЛЯ ДВИЖЕНИЯ!");
        }
    }

    public static void vKristovineNaBok() {
        System.out.println("\nВведите ширину коллеи в крестовине по боковому направлянию в милиметрах: ");
        int vKristovineNaBok = Integer.parseInt(scanner.next());
        if (vKristovineNaBok >= 1517 && vKristovineNaBok <= 1523) {
            System.out.println("Ширина коллеи " + vKristovineNaBok + " мм в крестовине по боковому направлянию в нормативе.");
        } else if (vKristovineNaBok >= 1512 && vKristovineNaBok <= 1548) {
            System.out.println("Ширина коллеи " + vKristovineNaBok + " мм в крестовине по боковому направлянию ТРЕБУЕТ РЕГУЛИРОВКИ.");
        } else {
            System.out.println("Ширина коллеи " + vKristovineNaBok + " мм в крестовине по боковому направлянию ТРЕБУЕТ ЗААКРЫТИЯ ДЛЯ ДВИЖЕНИЯ!");
        }
    }

    public static void vKristovinePryamo() {
        System.out.println("\nВведите ширину коллеи в крестовине по прямому направлянию в милиметрах: ");
        int vKristovinePryamo = Integer.parseInt(scanner.next());
        if (vKristovinePryamo >= 1517 && vKristovinePryamo <= 1523) {
            System.out.println("Ширина коллеи " + vKristovinePryamo + " мм в крестовине по прямому направлянию  в нормативе.");
        } else if (vKristovinePryamo >= 1512 && vKristovinePryamo <= 1548) {
            System.out.println("Ширина коллеи " + vKristovinePryamo + " мм в крестовине по прямому направлянию ТРЕБУЕТ РЕГУЛИРОВКИ.");
        } else {
            System.out.println("Ширина коллеи " + vKristovinePryamo + " мм в крестовине по прямому направлянию ТРЕБУЕТ ЗААКРЫТИЯ ДЛЯ ДВИЖЕНИЯ!");
        }
    }

    public static void vHvosteKristoviniNaBok() {
        System.out.println("\nВведите ширину коллеи в хвосте крестовины по боковому направлянию в милиметрах: ");
        int vHvosteKristoviniNaBok = Integer.parseInt(scanner.next());
        if (vHvosteKristoviniNaBok >= 1517 && vHvosteKristoviniNaBok <= 1523) {
            System.out.println("Ширина коллеи " + vHvosteKristoviniNaBok + " мм в хвосте крестовины по боковому направлянию в нормативе.");
        } else if (vHvosteKristoviniNaBok >= 1512 && vHvosteKristoviniNaBok <= 1548) {
            System.out.println("Ширина коллеи " + vHvosteKristoviniNaBok + " мм в хвосте крестовины по боковому направлянию ТРЕБУЕТ РЕГУЛИРОВКИ.");
        } else {
            System.out.println("Ширина коллеи " + vHvosteKristoviniNaBok + " мм в хвосте крестовины по боковому направлянию ТРЕБУЕТ ЗААКРЫТИЯ ДЛЯ ДВИЖЕНИЯ!");
        }
    }

    public static void vHvosteKristoviniPryamo() {
        System.out.println("\nВведите ширину коллеи в хвосте крестовины по прямому направлянию в милиметрах: ");
        int vHvosteKristoviniPryamo = Integer.parseInt(scanner.next());
        if (vHvosteKristoviniPryamo >= 1517 && vHvosteKristoviniPryamo <= 1523) {
            System.out.println("Ширина коллеи " + vHvosteKristoviniPryamo + " мм в хвосте крестовины по прямому направлянию в нормативе.");
        } else if (vHvosteKristoviniPryamo >= 1512 && vHvosteKristoviniPryamo <= 1548) {
            System.out.println("Ширина коллеи " + vHvosteKristoviniPryamo + " мм в хвосте крестовины по прямому направлянию ТРЕБУЕТ РЕГУЛИРОВКИ.");
        } else {
            System.out.println("Ширина коллеи " + vHvosteKristoviniPryamo + " мм в хвосте крестовины по прямому направлянию ТРЕБУЕТ ЗААКРЫТИЯ ДЛЯ ДВИЖЕНИЯ!");
        }
    }

    public static void secondNenu() {
        int x = 0;
        String s ="";


        while (!"11".equals(s)){
            System.out.println("\n1. Ширина коллеи в приемном стыке");
            System.out.println("2. Ширина коллеи у острия остряков");
            System.out.println("3. Ширина коллеи в корне остряка по боковому направлянию");
            System.out.println("4. Выход из приложения");
            s = scanner.next();

            // походу дублирует ответ ниже
            try {
                x = Integer.parseInt(s);
            } catch (NumberFormatException e){
                System.out.println("Неверный значение");
            }

            switch (x){
                case 1 -> Main.vPriemnomStike();
                case 2 -> Main.uOstriyaOstryakov();
                case 3 -> Main.vKorneOstryakaNaBok();
                case 4 -> {
                    System.out.println("До свидания!");
                    System.exit(0);
                }
                default -> System.out.println("Неверное значение");
            }
            Main.pressEnterToContinue();
        }
    }


}