package zadaniadomowe.lokaty;

public enum Kapitalizacja {
    MIESIECZNA, KWARTALANA, ROCZNA;

    public static int obliczMscKapitalicacji(Kapitalizacja kapitalizacja){
        switch (kapitalizacja){
            case MIESIECZNA:
                return 1;
            case KWARTALANA:
                return 3;
            case ROCZNA:
                return 12;
                default:
                    System.out.println("Obecnie dostępna jest tylko kapitalizacja:\n" +
                            "- miesięczna;\n" +
                            "- kwartalna;\n" +
                            "- roczna");
        }return 0;
    }
}

