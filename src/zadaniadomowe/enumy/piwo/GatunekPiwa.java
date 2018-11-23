package zadaniadomowe.enumy.piwo;

public enum GatunekPiwa {
    LAGER, PILZNER, STOUT, PORTER, MIODOWE;

    public static void opiszPiwo(GatunekPiwa nazwaPiwa){

        switch (nazwaPiwa){
            case LAGER:
                System.out.println("Piwo LAGER (jasne).");
                break;
            case PILZNER:
                System.out.println("Piwo PILZNER (jasne).");
                break;
            case STOUT:
                System.out.println("Piwo STOUT (ciemne).");
                break;
            case PORTER:
                System.out.println("Piwo PORTER (ciemne).");
                break;
            case MIODOWE:
                System.out.println("Piwo MIODOWE (jasne)");
                break;
            default:
                System.out.println("To chyba nowe piwo.");
        }
    }

}

