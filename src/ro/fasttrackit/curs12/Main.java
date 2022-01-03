package ro.fasttrackit.curs12;

import static ro.fasttrackit.curs12.PuncteCardinale.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(NORD);
        System.out.println(SUD.toDirection());
        System.out.println(EST.toDirection());
        System.out.println(VEST.name());

        System.out.println(NORD.ordinal());
        PuncteCardinale pc = NORD;
        System.out.println(NORD.equals(pc));

        PuncteCardinale[] values = PuncteCardinale.values();
        for (PuncteCardinale pcard : values){
            System.out.println(pcard);
        }

        PuncteCardinale nord = PuncteCardinale.valueOf("NORD");
        System.out.println(nord);
        //PuncteCardinale.valueOf("ALTCEVA");
    }
}
